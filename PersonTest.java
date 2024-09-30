package lab4;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
    public class PersonTest {
        public static void main(String[] args) {
            List<person> people = new ArrayList<>();
            people.add(new person("Alice", 25));
            people.add(new person("Bob", 30));
            people.add(new person("Charlie", 20));
            Collections.sort(people, new PersonComparator());
            System.out.println("Sorted List: " + people);
        }
    }


