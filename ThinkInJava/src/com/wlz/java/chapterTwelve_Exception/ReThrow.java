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
		//�׳�ԭ�����쳣����
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
		//�׳��쳣,ԭ���쳣���������Ϣ�ᶪʧ��ֻ�����µ��׳����йص���Ϣ
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
