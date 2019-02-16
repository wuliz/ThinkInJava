package com.wlz.java.chapterSeven_ReusableClass;

class Homer {
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}

	float doh(float f) {
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse {

}

class Bart extends Homer {
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}
	//覆写基类的函数
	@Override
	char doh(char c) {
		// TODO Auto-generated method stub
		return super.doh(c);
	}
	
}

public class Hide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
		/*
		 * doh(float) doh(char) doh(float) doh(Milhouse)
		 */
	}

}
