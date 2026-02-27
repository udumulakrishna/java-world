package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SecondIntegerExtractor {

    public static void main(String[] args) {
    	String input = "The first number is 14, and the second is 27. There are also 40 and 4.";

        Optional<Integer> secondInt = extractNthInteger(input, 2);

        if (secondInt.isPresent()) {
            System.out.println("The second integer in the string is: " + secondInt.get());
        } else {
            System.out.println("Could not find the second integer in the string.");
        }
        // **************************
        String str = "Will there be 14 or perhaps 27 mails in my office today?";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);
        List<Integer> list = new ArrayList<Integer>();
        while (m.find()) {
            list.add(Integer.parseInt(m.group()));
        }

        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        System.out.println("Average: " + sum / list.size());

        // Using Stream
        OptionalDouble average = list.stream().mapToDouble(a -> a).average();
        System.out.println("Average: " + (int) average.getAsDouble());

        // Another way of doing it using Stream
        int sumInts = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Average: " + sumInts / list.size());
    	
    }

    /**
     * Extracts the Nth integer from a given string using streams and regex.
     *
     * @param str The input string.
     * @param n   The position of the integer to extract (1-based index).
     * @return An Optional containing the Nth integer if found, otherwise empty.
     */
    public static Optional<Integer> extractNthInteger(String str, int n) {
        // Regex to find one or more digits, potentially with a leading minus sign
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(str);

        // Convert the Matcher results to a Stream of Strings, then map to Integers
 /*       Stream<String> integerStrings = Stream.builder();
        while (matcher.find()) {
            integerStrings.add(matcher.group());
        } */
        
        // This is a common way to build a stream from a while loop with a Matcher, 
        // though note that the builder's build() method can only be called once.
        // A more concise way within a single expression would be:
        
        return Pattern.compile("-?\\d+")
            .matcher(str)
            .results() // Requires Java 9+ for results() method
            .map(matchResult -> Integer.parseInt(matchResult.group()))
            .skip(n - 1) // Skip the first (n-1) elements
            .findFirst(); // Find the Nth element
    }
}
