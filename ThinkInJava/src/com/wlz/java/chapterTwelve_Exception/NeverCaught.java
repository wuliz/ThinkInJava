package com.wlz.java.chapterTwelve_Exception;

public class NeverCaught {
	//���ܲ���Ҫ����RuntimeException�쳣
	//������������System.err
static void f(){
	throw new RuntimeException();
}
static void g(){
	f();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		g();
	}

}
