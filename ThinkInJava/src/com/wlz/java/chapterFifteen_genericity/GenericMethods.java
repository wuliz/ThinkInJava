package com.wlz.java.chapterFifteen_genericity;

public class GenericMethods {
public <T> void f(T t){
	System.out.println(t.getClass().getName());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods gen = new GenericMethods();
		gen.f(1.0);
		gen.f(1);
		gen.f("hello");
		gen.f(1.0f);
		gen.f('c');
		gen.f(gen);
	}

}
