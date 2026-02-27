package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamSolutions {

    public static void main(String[] args) {
        // Sample Data
        List<Integer> numbers = Arrays.asList(10, 35, 10, 50, 50, 22);
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 50000, 30),
            new Employee("Bob", 60000, 25),
            new Employee("Charlie", 50000, 22)
        );
        List<Student> students = Arrays.asList(
            new Student("John", "CS"),
            new Student("Jane", "IT"),
            new Student("Doe", "CS")
        );

        System.out.println("--- I. Highest and Second Highest ---");
        findTopTwo(numbers);

        System.out.println("\n--- II. Sort Employee (Salary, then Age) ---");
        sortEmployees(employees);

        System.out.println("\n--- III. Filter Students by Branch (CS) ---");
        filterByBranch(students, "CS");

        System.out.println("\n--- IV. Reverse String ---");
        System.out.println(reverseString("Gemini"));

        System.out.println("\n--- V. Reverse Each Word ---");
        System.out.println(reverseWords("Java Streams are powerful"));

        System.out.println("\n--- VI. Reverse Word Excluding Specials ---");
        System.out.println(reverseExcludingSpecials("Ab,c$d"));

        System.out.println("\n--- VII. Max Length Word ---");
        findMaxLengthWord("The quick brown fox jumps over the lazy dog");

        System.out.println("\n--- VIII. Highest Rank & Lowest Quantity ---");
        findRankAndQuantity(Arrays.asList(1, 2, 2, 3, 3, 3, 4));

        System.out.println("\n--- IX. Denominations ---");
        calculateDenominations(868);
    }

    // I. Highest and Second Highest
    public static void findTopTwo(List<Integer> nums) {
        List<Integer> result = nums.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .limit(2)
            .collect(Collectors.toList());
        System.out.println("Highest: " + result.get(0) + ", Second: " + (result.size() > 1 ? result.get(1) : "N/A"));
    }

    // II. Sort Employee based on Salary and Age
    public static void sortEmployees(List<Employee> list) {
        list.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary)
                              .thenComparingInt(Employee::getAge))
            .forEach(System.out::println);
    }

    // III. Filter data based on Branch
    public static void filterByBranch(List<Student> list, String branch) {
        list.stream()
            .filter(s -> s.branch.equalsIgnoreCase(branch))
            .forEach(System.out::println);
    }

    // IV. Reverse a String
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // V. Reverse each word in a sentence
    public static String reverseWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
            .map(word -> new StringBuilder(word).reverse().toString())
            .collect(Collectors.joining(" "));
    }

    // VI. Reverse word excluding special characters
    public static String reverseExcludingSpecials(String str) {
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(arr[i])) i++;
            else if (!Character.isLetterOrDigit(arr[j])) j--;
            else {
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        return new String(arr);
    }

    // VII. Max length word
    public static void findMaxLengthWord(String sentence) {
        Arrays.stream(sentence.split(" "))
            .max(Comparator.comparingInt(String::length))
            .ifPresent(word -> System.out.println("Longest: " + word));
    }

    // VIII. Highest rank (max value) and Lowest quantity (least frequent)
    public static void findRankAndQuantity(List<Integer> nums) {
        int max = nums.stream().max(Integer::compare).orElse(0);
        
        int minFreqElement = nums.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .min(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(0);

        System.out.println("Highest Rank: " + max + ", Lowest Quantity Element: " + minFreqElement);
    }

    // IX. Denominations
    public static void calculateDenominations(int amount) {
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int note : notes) {
            if (amount >= note) {
                System.out.println(note + " x " + (amount / note));
                amount %= note;
            }
        }
    }
}

// --- Helper Classes ---

class Employee {
    String name; double salary; int age;
    Employee(String n, double s, int a) { name = n; salary = s; age = a; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    @Override public String toString() { return name + " ($" + salary + ", " + age + ")"; }
}

class Student {
    String name; String branch;
    Student(String n, String b) { name = n; branch = b; }
    public String getBranch() { return branch; }
    @Override public String toString() { return name + " [" + branch + "]"; }
}