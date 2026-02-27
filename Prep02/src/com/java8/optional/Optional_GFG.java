package com.java8.optional;

import java.util.Optional;

public class Optional_GFG {

	public static void main(String[] args) {
		String[] str = new String[5];
		str[2] = "Geeks Classes are coming soon";

		Optional<String> empty = Optional.empty();
		System.out.println(empty); 

		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);

		System.out.println(value.get());       
		System.out.println(value.hashCode());  
		System.out.println(value.isPresent()); 
		
		// filter(Predicate<? super T> predicate)
		// flatMap(Function<? super T, Optional<U>> mapper) 
		
		// ifPresent(Consumer<? super T> consumer)
		// map(Function<? super T, ? extends U> mapper)
		// orElse(T other)
		// orElseGet(Supplier<? extends T> other)
		// orElseThrow(Supplier<? extends X> exceptionSupplier)
		
	}
}
