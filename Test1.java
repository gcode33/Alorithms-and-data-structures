package Lab6;

public class Test1
{
    public static void main(String[] args)
    {
        // ADD CODE HERE //
        int[][] table = new int[3][3];
        // Should print the values in table
        int count = 0;
        for (int row = 0; row < table.length; row++)
        {
            for (int col = 0; col < table.length; col++)
            {
                table[row][col] = count;
                count++;
                System.out.print(table[row][col] + " ");
            }
        }
    }
}

