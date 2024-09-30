package Lab6;

public class Test5
{
    public static void main(String[] args)
    {
        String[][] colours = {{"Orange","Blue","Red"}, {"Black", "White","Purple"}};
        int[][] nums= {{6,7,5},{9,7,7}};
        int[][] table = { {1,4,9},{11,4,3},{2,2,3} };
        for(int i = 0; i < colours.length; i++){

            for(int j = 0; j < colours[i].length; j++){
                System.out.println(colours[i][j]);
            }
        }
        int count = 0;
        for(int k = 0; k < nums.length; k++){

            for(int y =0; y < nums[k].length; y++){
                if(nums[k][y] == 7){
                    count++;

                }

            }

        }
        System.out.println( count);
        int sum = 0;
        for(int w = 1; w < table.length-1; w++){

            for(int e = 0; e < table[w].length; e++){
                sum = sum + table[w][e];
                System.out.println(sum);
            }
        }

        // ADD CODE HERE //
    }
}

