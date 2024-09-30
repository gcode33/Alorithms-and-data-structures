package Lab1;

public class TestMyMath {
    public static void main(String[] args) {
        // Test Case 1: first argument is the smallest
        int min1 = MyMath.smallest(12, 44, 66);
        System.out.println("Expected: " + 12 + " Actual: " + min1);//or just comment: expected = 12

        // Test Case 2: second argument is the smallest
        int min2 = MyMath.smallest(12, -10, 66);
        System.out.println("Expected: " + -10 + " Actual: " + min2);//expected = -10

        // Test Case 3: third argument is the smallest
        int min3 = MyMath.smallest(12, 44, 4);
        System.out.println("Expected: " + 4 + " Actual: " + min3);//expected = 4

        int min4 = MyMath.smallest(12, 3, 4);
        System.out.println("Expected: " + 3 + " Actual: " + min3);//expected = 3

        int pow = MyMath.myPow(6, 8);
        System.out.println("the answer is "+ pow);

        int sum = MyMath.sumOfNums(10);
        System.out.println("the sum of the numbers is"+sum);
    }
}
