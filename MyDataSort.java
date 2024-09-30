package lab4;

import java.util.Arrays;

public class MyDataSort {
    public static void SelectionSort(int[] a)
    {
        //setting the first array to loop through the array
        for(int i = 0; i < a.length-1; i++){
            //setting the min value to the first number
            int small = i;
            //second array to loop through all unsorted values in array
            for(int j = i +1; j <a.length; j++ ){
                if(a[j] < a[small])

                 //if value is smaller set smallest to it
                 small = j;
               // System.out.println(Arrays.toString(a));
            }
            //System.out.println(Arrays.toString(a));
            int smallest = a[small];
            //setting the minimum current position
            a[small] = a[i];
            a[i] = smallest;
        }



    }
    public static void ReverseSelectionSort(int []a){
        for(int k = 0; k < a.length-1; k++){
            //setting the min value to the first number
            int large = k;
            //second array to loop through all unsorted values in array
            for(int j = k +1; j <a.length; j++ ){
                if(a[j] > a[large])

                    //if value is smaller set smallest to it
                    large = j;
                //System.out.println(Arrays.toString(a));
            }
            //System.out.println(Arrays.toString(a));
            int smallest = a[large];
            //setting the minimum current position
            a[large] = a[k];
            a[k] = smallest;
        }
    }
}
