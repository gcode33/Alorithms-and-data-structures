package Lab8;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
        public static void main(String[] args) {
            List<String> list_Strings = new ArrayList<String>();
            list_Strings.add("Red");
            list_Strings.add("Blue");
            list_Strings.add("Orange");
            list_Strings.add("Black");
            list_Strings.add("Indigo");

            // Add "Pink" to index 3 outside the loop
            list_Strings.add(3, "Pink");
            for(int i = 0; i < list_Strings.size(); i++){
                System.out.println(list_Strings.get(i));
            }
            System.out.println(list_Strings.get(4));
            System.out.println(list_Strings);
            System.out.println(list_Strings.size());
            list_Strings.remove(2);
            System.out.println(list_Strings.size());
            // Print the list after adding "Pink"
            System.out.println(list_Strings);
        }
    }

