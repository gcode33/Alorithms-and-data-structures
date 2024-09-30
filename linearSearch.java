package lab4;
public class linearSearch {
    static void linear_search(int a[], int key){
        for(int i = 0; i < a.length; i++){
            System.out.println("index " +i);
            System.out.println("comparison "+ a[i]+ " = " +key);
            if(a[i] == key){
                System.out.println("The search is done, the number was "+ a[i] + "and is found at index " + i);
                return; // Add return to exit the method once the key is found
            }
        }
        System.out.println("The key does not exist in this array");
    }
}
