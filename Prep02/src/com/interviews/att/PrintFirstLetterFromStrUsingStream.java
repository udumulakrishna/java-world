package com.interviews.att;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintFirstLetterFromStrUsingStream {


	public static void main(String[] args) {

		//With Java 8 streams:
		String str = "Java Development Is Easy";

		String initials = Arrays.stream(str.split(" "))
				.map(s -> s.substring(0, 1))
				.collect(Collectors.joining());

		System.out.println(initials);

	}
}
