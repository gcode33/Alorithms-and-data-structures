package Lab2;

public class Encrypter {
    public static String encryptRowColumn(String plaintext, int numColumns) {
        plaintext = plaintext.toUpperCase();
        StringBuilder plaintextBuilder = new StringBuilder(plaintext);
        int numRows = (plaintextBuilder.length() + numColumns - 1) / numColumns;


        while (plaintextBuilder.length() % numColumns != 0) {
            //numRows = plaintextBuilder.length();
            plaintextBuilder.append("x");
        }

        plaintext = plaintextBuilder.toString();
        StringBuilder cipherText = new StringBuilder();

        for (int col = 0; col < numColumns; col++) {
            for (int row = 0; row < numRows; row++) {
                int index = col + row * numColumns;
                if (index < plaintext.length()) {
                    cipherText.append(plaintext.charAt(index));
                }
            }
        }

        return cipherText.toString();
    }
    public static String encryptCaesarCipher(String plaintext, int shift){

        if(shift >= 26){
            shift%=26;
        }
        StringBuilder cipherText = new StringBuilder();
        for(int i= 0; i< plaintext.length(); i++){
            char ch = plaintext.charAt(i);
            if(plaintext.charAt(i) != ' '){
                ch+=shift;
                cipherText.append(ch);
            }
            else{
                ch = ' ';
                cipherText.append(ch);
            }
        }


        return cipherText.toString();
    }

}


