package com.wlz.java.chapterTwelve_Exception;

public class NeverCaught {
	//尽管不需要捕获RuntimeException异常
	//其输出报告给了System.err
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
