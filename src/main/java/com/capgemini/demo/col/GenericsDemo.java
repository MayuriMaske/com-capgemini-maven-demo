package com.capgemini.demo.col;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		// List marks=new ArrayList<E>(); same type of data
		//they accept object data ,not primitive data

		List<Integer> marks = new ArrayList<>();

		marks.add(90);
		marks.add(95);
//		 marks.add("abc");
//		 marks.add(false);
		System.out.println(marks);
	}

}
