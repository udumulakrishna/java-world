package com.interviews.mphasis;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepetitiveChars {

	public static void main(String[] args) {
		String input = "programming is fun";
		
		System.out.println("input.chars(): "+ input.chars().toArray().length);
		// Map to store character counts
		Map<Character, Long> charCounts = input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),  Collectors.counting() ));

		// Filter and collect repetitive characters
		List<Character> repetitiveChars = charCounts.entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println("Original String: \"" + input + "\"");
		System.out.println("Repetitive characters: " + repetitiveChars);
	}
}
