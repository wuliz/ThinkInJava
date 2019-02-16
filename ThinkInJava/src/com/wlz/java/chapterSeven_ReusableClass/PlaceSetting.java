package com.wlz.java.chapterSeven_ReusableClass;

class Plate {
	Plate(int i) {
		System.out.println("Plate constructor");
	}
}

class DinnerPlate extends Plate {

	DinnerPlate(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("dinner constroctor");
	}

}

class Utensil {
	Utensil(int i) {
		System.out.println("utensil contructor");
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		System.out.println("Spoon constructor");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		System.out.println("Fork constructor");
	}
}

class Custom {
	Custom(int i) {
		System.out.println("Custom constructor");
	}
}

class Knife extends Utensil {

	Knife(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("Knife constructor");
	}

}

public class PlaceSetting extends Custom {

	PlaceSetting(int i) {
		super(i + 1);
		// TODO Auto-generated constructor stub

		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		p1 = new DinnerPlate(i + 5);
		System.out.println("placeSetting constructor");
	}

	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate p1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceSetting x = new PlaceSetting(9);
		/*
		 * Custom constructor utensil contructor Spoon constructor utensil
		 * contructor Fork constructor utensil contructor Knife constructor
		 * Plate constructor dinner constroctor placeSetting constructor
		 */
	}

}
