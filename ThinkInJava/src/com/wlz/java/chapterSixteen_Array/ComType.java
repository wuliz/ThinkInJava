package com.wlz.java.chapterSixteen_Array;

import java.util.Arrays;
import java.util.Collections;

public class ComType implements Comparable<ComType> {
	int i;
	int j;

	public ComType(int i, int j) {
		this.i = i;
		this.j = j;
	}


	@Override
	public int compareTo(ComType o) {
		// TODO Auto-generated method stub
		return i < o.i ? -1 : (i == o.i ? 0 : 1);
	}

	@Override
	public String toString() {
		return "ComType [i=" + i + ", j=" + j + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComType t1 = new ComType(1,1);
		ComType t2 = new ComType(2,2);
		System.out.println(t1.compareTo(t2));
		
		//Arrays.sort()的应用：将一个数组排序：默认是按
		int[] ints1=new int[]{1,21,3,4,5,8,0,1,2};
		Arrays.sort(ints1);
		System.out.println(Arrays.toString(ints1));//[0, 1, 1, 2, 3, 4, 5, 8, 21]
		ComType[] com={new ComType(1,1),new ComType(0,1),new ComType(2,1)};
		//如果没有实现Comparable接口的类的数组是不能调用sort的，会报运行时错误
		Arrays.sort(com);
		System.out.println(Arrays.toString(com));//[ComType [i=0, j=1], ComType [i=1, j=1], ComType [i=2, j=1]]
		Arrays.sort(com,Collections.reverseOrder());
		System.out.println(Arrays.toString(com));//[ComType [i=0, j=1], ComType [i=1, j=1], ComType [i=2, j=1]]
		
	}

}
