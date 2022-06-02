package com.capgemini.demo.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

// Collection Framework in Java - 
//  interfaces - 
//  List 		
//  Set
//  Map
//  Queue

//  classes - 
//  List 		
//	ArrayList
//	LinkedList
//	Stack
//	sector

//  Set
//  Map
//  Queue
public class ColDemo {

	public static void main(String[] args) {

//			int[] arr = {10, 20, 30.5, "abc", false};

		ArrayList myList = new ArrayList();
		// collection object

		System.out.println(myList.size());// 0
		System.out.println(myList);// []
		myList.add(10);
		myList.add(10.5);
		myList.add("abc");
		myList.add(false);

		System.out.println(myList.size());// 4
		System.out.println(myList);// [10,10.5,abc,false]

		myList.remove(2);

		System.out.println(myList.size());// 3
		System.out.println(myList);// [10,10.5,false]
	}
}