package com.wlz.java.chapterTen_innerClass;

interface A {

}
interface B {

}
class X implements A, B {

}
class Y implements A {
	B makeB() {
		return new B() {

		};
	}
}
public class MultiInterface {
	static void takesA(A a) {
	}
	static void takesB(B b) {
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
	}

}
