package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomSortNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// 1. Partition the numbers into Even (true) and Odd (false)
		Map<Boolean, List<Integer>> partitioned = numbers.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("partitioned: "+partitioned);
		
		// 2. Sort the Odd half in Descending order
		List<Integer> oddDescending = partitioned.get(false).stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		// 3. Sort the Even half in Ascending order
		List<Integer> evenAscending = partitioned.get(true).stream()
				.sorted()
				.collect(Collectors.toList());

		System.out.println("Odd Half (Descending): " + oddDescending);
		System.out.println("Even Half (Ascending): " + evenAscending);
	}

}
