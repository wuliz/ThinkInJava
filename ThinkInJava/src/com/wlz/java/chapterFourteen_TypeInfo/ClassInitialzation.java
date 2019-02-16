package com.wlz.java.chapterFourteen_TypeInfo;

import java.util.Random;

class Initable{
	static final int staticFinal=47;
	static final int staticFinal2=ClassInitialzation.rand.nextInt(1000);
	static{
		System.out.println("initializing Initable");
	}
}
class Initable2{
	static int staticNonFinal=17;
	static{
		System.out.println("Initializing Initable2");
	}
}
class Initable3{
	static int staticNonFinal=74;
	static{
		System.out.println("Initializing Initable3");
	}
}
public class ClassInitialzation {
	public static Random rand=new Random(47);
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class initable=Initable.class;
		System.out.println("after creating initable ref");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticNonFinal);
		Class initable3=Class.forName("com.wlz.java.chapterFourteen_TypeInfo.Initable3");
		System.out.println("after creeaing Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
		System.out.println(new Initable3() instanceof Object);
	}

}
