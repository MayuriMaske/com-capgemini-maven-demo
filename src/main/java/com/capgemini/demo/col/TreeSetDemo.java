package com.capgemini.demo.col;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<String> ts  = new TreeSet<>();
		ts.add("Abhishekh");
		ts.add("Balaram");
		ts.add("Chetan");// order is maintained

		ts.add("Chetan");// Duplicates will not get inserted in treeset

		System.out.println(ts);
	}
}
