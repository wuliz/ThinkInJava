package com.wlz.java.chapterOne_OOP;

public class Test01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		Circle c=new Circle();
		Triangle t = new Triangle();
		dosomething(s);//draw shape
		dosomething(c);//circle draw
		dosomething(t);//triangle draw
	}

	public static void dosomething(Shape s) {
		s.draw();
	}

}
