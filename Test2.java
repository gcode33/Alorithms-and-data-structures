package Lab6;

public class Test2 {
    public static void main(String[] args) {
        String[][] students = {{"grian","Amy","Bryce"}, {"Kamal", "Maria", "Elissa" }};
        // Should print the values in students in order
        for (int row = 0; row < students.length; row++) {
            for (int col = 0; col < students[row].length; col++) {
                System.out.print(students[row][col] + " ");
            }
        }
    }
}


