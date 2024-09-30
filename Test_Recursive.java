package Lab3;

import java.util.Arrays;

public class Test_Recursive {
    public static void main(String[] args){

        int rec = Recursive.fact(5);
        System.out.println(rec );

        double pow = Recursive.myPow(3, 4);
        System.out.println(pow);

        String rev =  Recursive.reverse("hello");
        System.out.println(rev);

        int sum = Recursive.sum(new int[]{1,2,4,5,6,7,8});
        System.out.println(sum);
    }
}
