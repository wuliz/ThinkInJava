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
		//this���ù��캯�����÷�
		this(s);
		//���ܵ������Σ��������ʾ�������
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
