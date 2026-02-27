package com.java8.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintAllArrayElements {
	public static void main(String[] args) {

		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		System.out.println("array size: "+ intArray.length);

		String output = Arrays.stream(intArray)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(", ", "[", "]"));

		System.out.println(output); // delimeter, prefix, suffix
	}

}
