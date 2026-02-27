package com.basics.collections;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {

		SortedSet<Integer> set = new TreeSet<>(); // only sort ASC order, No dup
		set.add(10);
		set.add(50);
		set.add(20);
		set.add(40);
		set.add(10);

		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.getLast());
		System.out.println(set.reversed());
		//-----
		
		SortedSet<String> ts = new TreeSet<String>();
        // Elements are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");
        System.out.println(ts);
        System.out.println(ts.getFirst());
        System.out.println("check 'D': "+ ts.contains("D"));
        
	}
}
