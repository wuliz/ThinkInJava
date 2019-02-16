package com.wlz.java.chapterEight_polymorphic;

class Characteristic {
	private String s;

	Characteristic(String s) {
		this.s = s;
		System.out.println("Creating CHharacteristic:" + s);
	}

	protected void dispose() {
		System.out.println("disposing Characterisic" + s);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("c");
		super.finalize();
	}

}

class Description {
	private String s;

	Description(String s) {
		this.s = s;
		System.out.println("Createing Description" + s);
	}

	protected void dispose() {
		System.out.println("disposing Description" + s);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("d");
		super.finalize();
	}

}

class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("basic living creature");

	LivingCreature() {
		System.out.println("LivingCreate()");
	}

	protected void dispose() {
		System.out.println("licingCreateure dispose");
		t.dispose();
		p.dispose();

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("l");
		super.finalize();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");

	Animal() {
		System.out.println("Animal");

	}

	protected void dispose() {
		System.out.println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("al");
		super.finalize();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");

	Amphibian() {
		System.out.println("Amphibain()");
	}

	protected void dispose() {
		System.out.println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("am");
		super.finalize();
	}
}

public class Frog extends Amphibian {
	private Characteristic p = new Characteristic("Croks");
	private Description t = new Description("eats bugs");

	public Frog() {
		System.out.println("Frog");
	}

	protected void dispose() {
		System.out.println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("f");
		super.finalize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog = new Frog();
		System.out.println("Bye");
		frog.dispose();
		/*
		 * Creating CHharacteristic:is alive Createing Descriptionbasic living
		 * creature LivingCreate() Creating CHharacteristic:has heart Createing
		 * DescriptionAnimal not Vegetable Animal Creating CHharacteristic:can
		 * live in water Createing DescriptionBoth water and land Amphibain()
		 * Creating CHharacteristic:Croks Createing Descriptioneats bugs Frog
		 * Bye Frog dispose disposing Descriptioneats bugs disposing
		 * CharacterisicCroks Amphibian dispose disposing DescriptionBoth water
		 * and land disposing Characterisiccan live in water Animal dispose
		 * disposing DescriptionAnimal not Vegetable disposing Characterisichas
		 * heart licingCreateure dispose disposing Descriptionbasic living
		 * creature disposing Characterisicis alive
		 */
	}

}
