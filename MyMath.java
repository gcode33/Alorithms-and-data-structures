package Lab1;

public class MyMath {
    public static int smallest(int x, int y, int z) {
        int smallest;
        if (x < y)
            smallest = x;
        else
            smallest = y;
        if (z < smallest)
            smallest = z;
        return smallest;
    }

    public static int myPow(int x, int num) {
        int ans = 1;
        for (int i = 1; i <= x; i++) {
           ans =ans * num;
        }
        return ans;
    }

    public static int sumOfNums(int x){
        int ans = 0;

        for(int i = 1; i <= x; i++){
            ans = ans + i;
            System.out.println(ans);
        }
        return ans;
    }
}
