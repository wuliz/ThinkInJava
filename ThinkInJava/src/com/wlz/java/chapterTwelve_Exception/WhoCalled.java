package com.wlz.java.chapterTwelve_Exception;

public class WhoCalled {
static void f(){
	try {
		throw new Exception();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		for(StackTraceElement ste:e.getStackTrace()){
			System.out.println(ste.getMethodName());
		}
		
	}
}
static void g(){
	f();
}
static void h(){	
	g();
}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		f();
		System.out.println("________________________________________________");
		g();
		System.out.println("_____________________________________________");
		h();
		
	}
	

}
