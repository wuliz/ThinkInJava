package com.wlz.java.chapterTen_innerClass;

class Egg2 {
	private York y = new York();

	protected class York {
		public York() {
			System.out.println("egg2.york()");
		}

		public void f() {
			System.out.println("Egg2.York.g()");
		}
	}

	public Egg2() {
		System.out.println("new egg2()");
	}

	public void insertYork(York yy) {
		y = yy;
	}

	public void g() {
		y.f();
	}
}

public class BigEgg2 extends Egg2 {
	public class York extends Egg2.York {
		public York() {
			System.out.println("BigEgg2.yotk()");
		}

		public void f() {
			System.out.println("BigEgg2.york.f()");
		}

	}

	public BigEgg2() {
		insertYork(new York());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigEgg2 b = new BigEgg2();
		b.g();
		/*
		 * egg2.york() new egg2() egg2.york() BigEgg2.yotk() BigEgg2.york.f()
		 */
	}

}
