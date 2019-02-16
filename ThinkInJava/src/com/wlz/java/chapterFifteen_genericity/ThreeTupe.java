package com.wlz.java.chapterFifteen_genericity;

public class ThreeTupe<A,B,C> extends TwoTuple<A,B> {
	public final C third;
	public ThreeTupe(A a, B b,C c) {
		super(a, b);
		this.third=c;
	}
	public String toString(){
		return first+","+second+","+third;
	}

}
