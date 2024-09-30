package examprac2_summer2022;

import java.util.LinkedList;
import java.util.ListIterator;

public class binary {
    public static int binarySearch(String[] a, String key) {
        int l = 0;
        int r = a.length - 1;
        boolean found = false;
        int comparisons = 0;

        while (!found && l <= r) {
            int m = (l + r) / 2;
            if (key.equals(a[m])) {
                found = true;
            } else if (key.compareTo(a[m]) < 0) {
                r = m - 1;
            } else {
                l = m + 1;
            }
            comparisons++; // Increment the counter for each comparison
        }

        System.out.println("Total comparisons: " + comparisons);

        if (found) {
            return l; // Return the index of the found element
        } else {
            return -1; // Return -1 if the element is not found
        }
    }
    public static int linearSearch(int[] a, int key){
        for(int i = 0; i < a.length; i++){
            if(key == a[i]){
                System.out.println("found the key at index: "+ i);
            }
            else{
                System.out.println("key not found in the array");
            }
        }
        return key;
    }
    public static class Town {
        private String name;
        private String county;
        private int population;
        public Town(String name, String county, int population) {
            this.name = name;
            this.county = county;
            this.population = population;
        }
        public String getName() {
            return name;
        }
        public String getCounty() {
            return county;
        }
        public int getPopulation() {
            return population;
        }
        public String toString() {
            return "Town[" + name + "," + county + "," + population + "]";
        }
    }

    public static void main(String[] args) {
        String[] names = {"Ann", "Ben", "Bob", "Cal", "Fay", "Kim", "Ray", "Sam", "Sue", "Tim"};
        int[] name = {1,2,3,4,5,5,6,7,84,5,33,54};

        // Search for "Ben"
        int indexBen = binarySearch(names, "Ben");
        System.out.println("Index of Ben: " + indexBen);

        // Search for "Tom" (not in the array)
        int indexTom = binarySearch(names, "Tom");
        System.out.println("Index of Tom: " + indexTom);

        int lin = linearSearch(name, 84);
        System.out.println("the key of Ben is: " + lin);

        LinkedList<Town> towns = new LinkedList<Town>();
        towns.addLast(new Town("Tralee", "Kerry", 23000));
        towns.addLast(new Town("Killarney", "Kerry", 14500));
        towns.addLast(new Town("Macroom", "Cork", 3800));
        towns.addLast(new Town("Listowel", "Kerry", 4820));
        Town town = towns.getFirst();
        System.out.println(town);
        town = towns.getLast();
        System.out.println(town);

        ListIterator<Town> iterator = towns.listIterator(2); // Start the iterator at index 2 (third element)
        Town newTown = new Town("Dingle", "Kerry", 5200); // Create a new Town object
        iterator.add(newTown); // Add the newTown after the second element

        ListIterator<Town> iterators = towns.listIterator();
        int totalPopulation = 0;
        int townCount = 0;

        while (iterators.hasNext()) {
            Town townss = iterators  .next();
            System.out.println(townss.getName()); // Display the name of each Town object
            totalPopulation += townss.getPopulation(); // Add the population of each town to the total
            townCount++; // Increment the town count
        }

        double averagePopulation = (double) totalPopulation / townCount; // Calculate the average population
        System.out.println("Average population: " + averagePopulation);





    }
}

