package com.wlz.java.chapterEleven_holdObject;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			c.add(i);
		}
		for (Integer i : c) {
			System.out.println(i);
		}
		/*
		 * 0 1 2 3 4 5 6 7 8 9
		 */
	}

}
