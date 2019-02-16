package com.wlz.java.chapterTwelve_Exception;

public class ReThrow {
public static void f() throws Exception{
	System.out.println("Originating the exception in f()");
	throw new Exception("throw from f()");
}
public static void g() throws Exception{
	try {
		f();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Indide g().e.printStackTrace()");
		e.printStackTrace(System.out);
		//抛出原来的异常对象
		throw e;
	}
}
public static void h() throws Exception{
	try {
		f();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Indide h().e.printStackTrace()");
		e.printStackTrace(System.out);
		//抛出异常,原来异常发生点的信息会丢失，只留下新的抛出点有关的信息
		throw (Exception)e.fillInStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			g();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("main :printStackTrace()");
			e.printStackTrace(System.out);
		}
		System.out.println("_______________________________");
		try {
			h();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("main :printStackTrace()");
			e.printStackTrace(System.out);
		}
	}

}
