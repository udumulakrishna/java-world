package com.interviews;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberMultiplier {
	public static void main(String[] args) {
		// write a java program to multiply with 2 only for even numbers in List using Stream API

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Multiply even numbers by 2 and collect them into a new List
		List<Integer> multipliedEvenNumbers = numbers.stream()
				.filter(n -> n % 2 == 0) // Keep only even numbers
				.map(n -> n * 2)      // Multiply each even number by 2
				.collect(Collectors.toList()); // Collect the results into a new List

		System.out.println("Original list: " + numbers);
		System.out.println("Even numbers multiplied by 2: " + multipliedEvenNumbers);
	}

	//VM -> 
	//ReactNode / Component
}
