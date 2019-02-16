package com.wlz.java.chapterEleven_holdObject;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < 10000; i++) {
			set.add(rand.nextInt(30));
		}
		System.out.print(set);
		// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 16, 19,
		// 18, 21, 20, 23, 22, 25, 24, 27, 26, 29, 28]
		System.out.println();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			treeSet.add(rand.nextInt(30));
		}
		System.out.print(treeSet);
		// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
		// 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
		System.out.println();
		LinkedHashSet<Integer> linkHashSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			linkHashSet.add(rand.nextInt(30));
		}
		System.out.print(linkHashSet);
		// [25, 11, 10, 6, 19, 29, 23, 18, 15, 3, 4, 0, 12, 28, 9, 16, 2, 26,
		// 13, 8, 27, 20, 1, 17, 22, 24, 14, 7, 5, 21]
	}

}
