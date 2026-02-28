package com.java8.optional;

import java.util.Optional;

public class Optional_filter {

	public static void main(String[] args) {
		// create a Optional
		Optional<Integer> op = Optional.of(9456);

		// print value
		System.out.println("Optional: " + op);

		// filter the value
		System.out.println("Filtered value for even: " + op.filter(num -> num % 2 == 0)); // Filtered value for odd or even: Optional[9456]
		System.out.println("Filtered value for odd: " + op.filter(num -> num % 2 == 1)); // Filtered value for odd or even: Optional.empty
	}

}
