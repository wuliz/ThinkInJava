package com.wlz.java.chapterTen_innerClass;

class Egg {
	private York y;

	protected class York {
		public York() {
			System.out.println("egg.york()");
		}
	}

	public Egg() {
		System.out.println("new egg()");
		y = new York();
	}
}

public class BigEgg extends Egg {
	public class York {
		public York() {
			System.out.println("big egg.york()");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BigEgg();
		/*
		 * new egg() egg.york()
		 */
	}

}
