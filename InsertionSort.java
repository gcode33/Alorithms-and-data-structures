package lab4;

public class InsertionSort {
    public static void insertion(int []a){
        for (int i = 1; i < a.length; i++) {
            //setting the value at index one to a value
            int num = a[i];
            //setting the value at index 0 to a value
            int j = i - 1;

            //while j is grater than 0 and the value at index j is greater than the number at index i then
            while (j >= 0 && a[j] > num) {

                //increase the index of j by one and set it equal to the orginal index value of j
                a[j + 1] = a[j];

                //decrease the index of j
                j--;
            }
            //if while condition is not met then the num value is equal to the index of j + 1
            a[j + 1] = num;
        }

    }
}
