package com.interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HealthFirstTech {
	// 2 List<Integer> ==> unsorted
	// single list which is sorted
	// O(n) // should not
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(3, 5, 1, 88, 22, 10);// size = 6
		List<Integer> list2 = Arrays.asList(63, 85, 11, 88, 22, 10);

		List<Integer> resList = new ArrayList<Integer>(); // final o/p List
		Iterator iterator = list1.iterator();
		while (iterator.hasNext()) {
			resList.add((Integer) iterator.next());
		}
		iterator = list2.iterator();
		while (iterator.hasNext()) {
			resList.add((Integer) iterator.next());
		}

		for (int i = 0; i < resList.size(); i++) {
			for (int j = i + 1; j < resList.size(); j++) {// Swap quick sort O(n2)
				if (resList.get(i) > resList.get(j)) { // Swap quick  sort O(n log n)= O(n2)  mid the array n/2 pivotel 
					int temp = resList.get(i);
					resList.set(i, resList.get(j));
					resList.set(j, temp);
				}
			}
		}
		System.out.println(resList);
	}
}
