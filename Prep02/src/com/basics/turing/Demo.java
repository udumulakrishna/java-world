package com.basics.turing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class Demo {
	public static void main(String[] args) {
		Collection<String> collection;
		
		//collection = new ArrayList();
		collection = new ArrayDeque();
		//collection = new LinkedList();
		//collection = new LinkedHashSet();
		//collection = new TreeSet();
		
		collection.add("foo");
		collection.add("bar");
		collection.add("baz");
		collection.forEach(System.out::println);
		
		
		String s1 = "a";
		String s2 = "a";
		String s3 = new String("a");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println((s1==s2));
		System.out.println((s1==s3));
	}
}

/*
abstract class Demo {
	public int a;
	void demo() {
		a=10;
	}
	abstract final public void get();
}

class Test extends Demo {
	final public void get() {
		System.out.println("a= "+a);
	}
	public static void main(String[] args) {
		Test obj = new Test();
		obj.get();
	}
}
*/