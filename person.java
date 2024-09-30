package lab4;

public class person {
    private String name;
    private int age;
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
class PersonComparator implements java.util.Comparator<person> {
    @Override
    public int compare(person a, person b) {
        //return a.getAge() - b.getAge();
         return a.getName().compareTo(b.getName());
    }
}


