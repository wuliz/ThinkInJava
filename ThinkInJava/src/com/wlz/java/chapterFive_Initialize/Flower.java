package com.wlz.java.chapterFive_Initialize;

public class Flower {
	int petalcount=0;
	String s="initial value";
	Flower(int i){
		petalcount =i;
		System.out.println("petalcount="+petalcount);
	}
	Flower(String ss){
		s=ss;
		System.out.println("s="+s);
	}
	Flower(String s,int i){
		//this调用构造函数的用法
		this(s);
		//不能调用两次，下面会提示语义错误
		//this(i);
	}
	Flower(){
		this("hi",17);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f=new Flower();
	}

}
