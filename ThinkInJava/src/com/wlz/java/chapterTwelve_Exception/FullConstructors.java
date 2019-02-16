package com.wlz.java.chapterTwelve_Exception;
class MyException extends Exception{
	public MyException(){
		
	}
	public MyException(String msg){
		super(msg);
	}
}
public class FullConstructors {
	public static void f() throws MyException{
		System.out.println("throwing myexceptoion from f()");
		throw new MyException();
	}
	public static void g() throws MyException{
		System.out.println("throwing myexceptoion from g()");
		throw new MyException("orginated in g()");
	}
public static void main(String[] args){
	try {
		f();
	} catch (MyException e) {
		// TODO Auto-generated catch block
		e.printStackTrace(System.out);
		//Ä¬ÈÏÊä³ö´íÎóÁ÷
		e.printStackTrace();
	}
	try {
		g();
	} catch (MyException e) {
		// TODO Auto-generated catch block
		e.printStackTrace(System.out);
		System.out.println(e.getMessage());
	}
}
}
