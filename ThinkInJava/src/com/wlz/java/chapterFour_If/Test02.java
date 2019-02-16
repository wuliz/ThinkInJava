package com.wlz.java.chapterFour_If;

class Cup {
	Cup(int markes) {
		System.out.println("cup(" + markes + ")");
	}

	void f(int markes) {
		System.out.println("f(" + markes + ")");
	}
}

class Cups {
	/*
	 * 静态成员和静态代码块只会执行一次
	 */
	static void test(){
		System.out.print(cup1);
		System.out.println("test");
	}
	
	static Cup cup1;
	static Cup cup2;
	static {
		System.out.println(cup1);
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	
	Cups() {
		System.out.println("Cups");
	}
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mains");
		//Cups.cup1.f(99);
		Cups.test();
		/*
		 * cup(1) cup(2) f(99)
		 */
	
	}
	/*static Cups cups1=new Cups();//先执行
	static Cups cups2=new Cups();//先执行
*/}
