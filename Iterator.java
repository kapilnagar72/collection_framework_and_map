package collection_framework_and_map;

import java.util.ArrayList;

public class Iterator {
     public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    java.util.Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
  }
}
