package com.wlz.java.chapterEight_polymorphic;

import java.util.Random;

class Shape {
	public void draw() {

	}

	public void erase() {

	}
}

class Circle1 extends Shape {
	public void draw() {
		System.out.println("Circle.draw()");
	}

	public void erase() {
		System.out.println("Circle.ease()");
	}
}

class Square extends Shape {
	public void draw() {
		System.out.println("Square.draw()");
	}

	public void erase() {
		System.out.println("square.erase()");
	}
}

class Triangel extends Shape {
	public void draw() {
		System.out.println("Trigle.draw()");
	}

	public void erase() {
		System.out.println("Triangel.erase()");
	}
}

class RandomShapeGenerator {
	private Random rand = new Random(47);

	public Shape next() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Circle1();
		case 1:
			return new Square();
		case 2:
			return new Triangel();

		}

	}

}

public class Shapes1 {
	
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[9];
		for (int i = 0; i < s.length; i++) {
			s[i] = gen.next();
		}
		for (Shape sh : s) {
			sh.draw();
		}
		/*
		 * Trigle.draw() 
		 * Trigle.draw()
		 *  Square.draw() 
		 *  Trigle.draw()
		 *   Square.draw()
		 * Trigle.draw()
		 *  Square.draw() 
		 *  Trigle.draw() 
		 *  Circle.draw()
		 */
	}
}
