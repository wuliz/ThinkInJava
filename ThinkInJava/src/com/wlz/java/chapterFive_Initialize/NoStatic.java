package com.wlz.java.chapterFive_Initialize;

public class NoStatic {
	String a;
	String b;
	{
		System.out.println(a);
		System.out.println(b);
		a = new String("aaaa");
		b = new String("bbbb");
		System.out.println(a);
		System.out.println(b);
		/*
		 * null null aaaa bbbb
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoStatic n = new NoStatic();
	}

}
