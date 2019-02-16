package com.wlz.java.chapterThirteen_String;

public class SimpleFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		double y=5.332642;
		System.out.println("Row1:["+x+" "+y+"]");
		//the new way
		System.out.format("Row1:[%d %f]\n",x,y);
		//or,在这个函数内调用了format（）
		System.out.printf("Row11:[%d %f]\n",x,y);
	}

}
