package com.wlz.java.chapterTwelve_Exception;

 class SimpleException extends Exception {
}

public class InheritingExceptions {
	//调用f()抛出异常，交给它的上一级处理异常
	public void f() throws SimpleException {
		System.out.println("Throw simplexception from f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritingExceptions sed = new InheritingExceptions();
		//捕获异常
		try {
			sed.f();
		} catch (SimpleException e) {
			// TODO Auto-generated catch block
			//异常处理程序
			System.out.println("Caught it");
			System.out.println(e.getMessage());
		}
	}

}
