package ExamPractice_2019Summer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lists {
        public static void main(String[] args) {
            // Creating ArrayList to store String objects
            ArrayList<String> arrayList = new ArrayList<>();
            // Populating ArrayList with Strings
            arrayList.add("Kay");
            arrayList.add("Ray");
            arrayList.add("Jay");

            // Creating LinkedList to store String objects
            LinkedList<String> linkedList = new LinkedList<>();
            // Populating LinkedList with Strings
            linkedList.add("Kay");
            linkedList.add("Ray");
            linkedList.add("Jay");
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
            // Creating ListIterator to iterate through the LinkedList
            ListIterator<String> iterator = linkedList.listIterator();
            // Iterating through the LinkedList and displaying the Strings
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

