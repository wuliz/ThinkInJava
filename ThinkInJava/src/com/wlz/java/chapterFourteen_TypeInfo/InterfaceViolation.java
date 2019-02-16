package com.wlz.java.chapterFourteen_TypeInfo;
class A{
	
}
class B{
	
}
class C extends A{
	
}
public class InterfaceViolation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new C();
		System.out.println(a.getClass());
	}

}
