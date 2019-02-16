package com.wlz.java.chapterSeven_ReusableClass;
class WithFinals{
	private final void f(){
		System.out.println("WithFials.f()");
	}
	private void g(){
		System.out.println("WithFials.g()");
	}
}
class OverrifingPrivate extends WithFinals{
	//强制覆盖final修饰的方法
	private final void f(){
		System.out.println("=overrifingPrivate.f()");
	}
	private void g(){
		System.out.println("overifinfprivate.g()");
	}
}
class OverrifingPrivate2 extends WithFinals{
	//强制覆盖final修饰的方法
	public final void f(){
		System.out.println("=overrifingPrivate2.f()");
	}
	public void g(){
		System.out.println("overifinfprivate2.g()");
	}
}
public class FinalOverideingIllusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrifingPrivate2 o2 = new OverrifingPrivate2();
		o2.f();
		o2.g();
		//不能这样用
		//OverrifingPrivate o=o2;
	}

}
