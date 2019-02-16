package com.wlz.java.chapterSixteen_Array;

import java.util.Arrays;

public class ArrayOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeryLLiumSphere[] a;
		BeryLLiumSphere[] b=new BeryLLiumSphere[5];
		System.out.println("b"+Arrays.toString(b));
		BeryLLiumSphere[] c=new BeryLLiumSphere[4];
		for(int i=0;i<c.length;i++){
			if(c[i]==null){
				c[i]=new BeryLLiumSphere();
			}
		}
		BeryLLiumSphere[] d={new BeryLLiumSphere(),new BeryLLiumSphere(),new BeryLLiumSphere()};
		a=new BeryLLiumSphere[]{
				new BeryLLiumSphere(),new BeryLLiumSphere(),new BeryLLiumSphere()
		};
		
	}

}
