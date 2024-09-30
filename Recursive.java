package Lab3;

import java.util.Arrays;

public class Recursive {
    public static int fact(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        else{
            return n * fact(n-1);
        }

    }
    public static double myPow(double x, int y){
        if(y == 0){
            return 1;
        }
        if (y ==1){
            return x;
        }
        else{
            return x * myPow(x,y-1 );
        }

    }
    public static String reverse(String str){
        if(str.isEmpty()){
            return "";
        }
        else{
            return str.charAt(str.length() -1) + reverse(str.substring(0, str.length()-1));
        }
    }
    public static int sum(int [] values){
        int [] newArr = Arrays.copyOf(values, values.length);
        int cnt = 0;
        if (newArr.length == 0){
            return 0;
        }
        else
        {
            return newArr[cnt] + sum(Arrays.copyOfRange(newArr, 1, newArr.length));
        }
    }
}
