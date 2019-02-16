package com.wlz.java.chapterSixteen_Array;

import java.util.ArrayList;
import java.util.Arrays;

class BeryLLiumSphere{
	private static long counter;
	public final long id=counter++;
	public String toString(){
		return "Sphere"+id;
	}
}
public class ContainerComparson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeryLLiumSphere[] spheres=new BeryLLiumSphere[10];
		for(int i=0;i<5;i++){
			spheres[i]=new BeryLLiumSphere();
		}
		System.out.println(Arrays.toString(spheres));
		System.out.println(spheres[4]);
		ArrayList<BeryLLiumSphere> spherelist = new ArrayList<BeryLLiumSphere>();
		for(int i=0;i<5;i++){
			spherelist.add(new BeryLLiumSphere());
		}
		System.out.println(spherelist);
		System.out.println(spherelist.get(4));
		
		int[] integers={0,1,2,3,4,5};
		System.out.println(Arrays.toString(integers));
		System.out.println(integers[4]);
		ArrayList<Integer> intlist = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		intlist.add(97);
		System.out.println(intlist);
		System.out.println(intlist.get(4));
	}

}
