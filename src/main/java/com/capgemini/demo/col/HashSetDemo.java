package com.capgemini.demo.col;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();

		h.add("India");
		h.add("Australia");
		h.add("South Africa");

		h.add("India");// Adding duplicate elements

		System.out.println(h);

		h.remove("Australia");
		System.out.println("List after removing Australia:" + h);

		System.out.println("Loop by isung Iterating over list:");

		Iterator<String> i = h.iterator();

		while (i.hasNext())
			System.out.println(i.next());
	}
}
