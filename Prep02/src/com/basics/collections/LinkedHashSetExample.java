package com.basics.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> fruits = new LinkedHashSet<>();  // only insertion order. No sort, No dup

        // Adding elements (duplicates will be ignored)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana"); // Duplicate, will not be added

        SortedSet<String> set = new TreeSet<>();// only sort ASC order, No dup
        set.addAll(fruits);
        System.out.println("Set: "+set);
        
        
        // Display the LinkedHashSet (insertion order preserved)
        System.out.println("Fruits Set: " + fruits);

        // Check if an element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Contains Grapes? " + fruits.contains("Grapes"));

        // Remove an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterate using for-each loop
        System.out.println("\nIterating using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterate using Iterator
        System.out.println("\nIterating using Iterator:");
        
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Size of the set
        System.out.println("\nSize of set: " + fruits.size());

        // Clear the set
        fruits.clear();
        System.out.println("Is set empty after clear? " + fruits.isEmpty());
    }
}
