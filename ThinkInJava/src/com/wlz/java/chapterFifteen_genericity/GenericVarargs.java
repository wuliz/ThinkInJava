package com.wlz.java.chapterFifteen_genericity;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
	public static <T> List<T> makeList(T...args){
		ArrayList<T> result = new ArrayList<T>();
		for(T item:args)
			result.add(item);
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = makeList("A");
		System.out.println(ls);
		ls=makeList("A","b","c");
		System.out.println(ls);
		ls=makeList("ABHsaKFDJKJNDSJKAKSAJFBJSAKJAK".split(""));
		System.out.println(ls);
	}

}
