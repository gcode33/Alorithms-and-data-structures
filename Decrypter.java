package Lab2;

public class Decrypter {
    public static void main(String[] args) {
        //String word = Encrypter.encryptRowColumn("qwertyuiopasdfgh", 8);
        //System.out.println("the encryption is :"+ word);

//        String word = Encrypter.encryptRowColumn("HELLOWOR", 6);
//        System.out.println("the encryption is :"+ word);// expect HOERLXLXOXWX

        String word = Encrypter.encryptRowColumn("HEL", 4);
        System.out.println("the encryption is :"+ word);// expect HOEWLOLR

        String cesar = Encrypter.encryptCaesarCipher("george fotabong",27);
        System.out.println("the encrypted word is: "+ cesar);
    }

}
