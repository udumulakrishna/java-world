package com.interviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GlobalLogic {
	
	public static void main(String[] args) {
		
		// [2,4,5,1,8,9,4]; 
		List<Integer> list3 = Arrays.asList(2,4,5,1,8,9,4); // second Largest
		Set<Integer> set = new HashSet<Integer>();
		for(int i: list3) {
			System.out.println("list3.get(i)"+ list3.get(i));
			set.add(list3.get(i));
		}
		
		System.out.println(" list3:"+ set);
		
		
		
		
		String str = "Java Stream"; // 
		List<Integer> intList = Arrays.asList(2,4,1,5,6,3,4,7,77);
		List<String> strList = Arrays.asList("ABC", "DEF", "IJK");
		
		List<String> op = strList.stream()
				.filter(n -> {
					return !n.isEmpty();
				})
				.collect(Collectors.toList());
		
		
		
		List<Integer> op2 = intList.stream()
		.filter(n-> {
			return n%2==0;
		})
		.collect(Collectors.toList());
		
		System.out.println("OP: "+ op2);
		
		
		
		
		
//		Arrays.stream(str.split(" "))
//		
//		
//		//FI:  Predicate Interface 
//		Completable 
		
	}

}
