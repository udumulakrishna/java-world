package com.interviews.htc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HTC {
	// 1-9  ==> even or Odd ==> Odd= Descing Order 
	// Even = Ascending Order
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(4,3,9,2,7,5,6,1,8);
		
	Map<Boolean,List<Integer>>	p=myList.stream().collect(Collectors.partitioningBy(n->n%2!=0));
		//.sorted(Comparator.reverseOrder());
		
		System.out.println(p.get(true).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println(p.get(false).stream().sorted().collect(Collectors.toList()));
//		myList.stream()
//			.filter(n -> n%2==0)
//			.sorted(Comparator.reverseOrder()).forEach(System.out::print);
			
		
	}
}
