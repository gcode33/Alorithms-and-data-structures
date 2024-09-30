package Lab6;

public class Test4 {
    public static void main(String[] args)
    {
        String[][] arr = { {"hello","there","world"},
                {"how","are","you"} };
        System.out.println("Rows: "+ arr.length);
        System.out.println("columns: "+ arr[0].length);

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

        // ADD CODE TO PRINT NUMBER OF ROWS HERE //

        // ADD CODE TO PRINT NUMBER OF COLUMNS HERE //

    }
}

