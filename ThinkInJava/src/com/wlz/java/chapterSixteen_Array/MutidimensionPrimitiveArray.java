package com.wlz.java.chapterSixteen_Array;

import java.util.Arrays;

public class MutidimensionPrimitiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={
				{
					1,2,3
				},{
					4,5
				}
		};
		System.out.println(Arrays.deepToString(a));
		//[[1, 2, 3], [4, 5]]
		int[][][] b=new int[3][][];
		for(int i=0;i<b.length;i++){
			b[i]=new int[i+1][];
		}
		
	}

}
