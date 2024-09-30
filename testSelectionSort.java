package lab4;

import java.util.Arrays;

public class testSelectionSort {
    public static void main(String[] args) {

        int arr[] = {12,24,5,7,2,16};

        MyDataSort.SelectionSort(arr);
        System.out.println("sorted array"+ Arrays.toString(arr));


        MyDataSort.ReverseSelectionSort(arr);
        System.out.println("sorted array"+ Arrays.toString(arr));
    }
}
