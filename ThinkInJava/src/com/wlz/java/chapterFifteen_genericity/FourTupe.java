package com.wlz.java.chapterFifteen_genericity;

public class FourTupe<A,B,C,D> extends ThreeTupe<A,B,C> {
	public final D four;
	public FourTupe(A a, B b, C c,D d) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
		this.four=d;
	}
	public String toString(){
		return first+","+second+","+third+","+four;
	}

}
