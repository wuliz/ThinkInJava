package com.wlz.java.chapterTwelve_Exception;

 class SimpleException extends Exception {
}

public class InheritingExceptions {
	//����f()�׳��쳣������������һ�������쳣
	public void f() throws SimpleException {
		System.out.println("Throw simplexception from f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritingExceptions sed = new InheritingExceptions();
		//�����쳣
		try {
			sed.f();
		} catch (SimpleException e) {
			// TODO Auto-generated catch block
			//�쳣�������
			System.out.println("Caught it");
			System.out.println(e.getMessage());
		}
	}

}
