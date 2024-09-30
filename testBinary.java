package lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testBinary {
    public static void main(String[] args) {
        Integer[] numbers = {22, 55, 666, 7775, 77987, 44, 55};

        // Print Unsorted Array
        System.out.println(Arrays.toString(numbers));

        int low = 0; // Corrected low value
        int high = numbers.length - 1; // Corrected high value
        int key = 44;

        Arrays.sort(numbers,1,3); // Sort the array
        System.out.println("Sorted Array: " + Arrays.toString(numbers)); // Print sorted array

        //descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted Array: " + Arrays.toString(numbers)); // Print sorted array

       // binarySearch.binary_search(numbers, low, high, key);
        List<Integer> integerList = new ArrayList<>();

        // Add numbers to the list
        integerList.add(10);
        integerList.add(5);
        integerList.add(20);
        integerList.add(3);

        // Sort the list
        Collections.sort(integerList);

        // Print out the sorted list
        System.out.println("Sorted List: " + integerList);
    }
}


