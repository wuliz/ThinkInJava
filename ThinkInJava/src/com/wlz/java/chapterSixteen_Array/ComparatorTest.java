package com.wlz.java.chapterSixteen_Array;

import java.util.Arrays;
import java.util.Comparator;

class ComTypeComparator implements Comparator<ComType>{

	@Override
	public int compare(ComType o1, ComType o2) {
		// TODO Auto-generated method stub
		return o1.i > o2.i ? -1 : (o1.i == o2.i ? 0 : 1);
	}
	
}
public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComType[] com={new ComType(1,1),new ComType(0,1),new ComType(2,1)};
		System.out.println(Arrays.toString(com));
		Arrays.sort(com);
		System.out.println(Arrays.toString(com));
		Arrays.sort(com,new ComTypeComparator());
		System.out.println(Arrays.toString(com));
	}

}
