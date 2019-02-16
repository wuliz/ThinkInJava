package com.wlz.java.chapterNight_interface;

import com.wlz.java.chapterEight_polymorphic.Note;

interface Instrument1 {
	int VALUE = 5;// 默认是static并且是final的

	void play(Note n);

	void adjust();

}

class Wind1 implements Instrument1 {

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("wind.play()" + n);
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub

	}

	public String what() {
		return "wind";
	}

}

class Percussion1 implements Instrument1 {

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Percussion.play()" + n);
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub

	}

	public String what() {
		return "Percussion";
	}

}

class Stringed1 implements Instrument1 {

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Stringed.play()" + n);
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub

	}

	public String what() {
		return "Stringed";
	}

}

class Brass1 extends Wind1 {
	public void play(Note n) {
		System.out.println("Brass.play()" + n);
	}

	public void adjust() {
		System.out.println("Brass.adjust");
	}
}

class WooWind1 extends Wind1 {
	public void play(Note n) {
		System.out.println("WooWind.play()" + n);
	}

	public String what() {
		return "Woodwind";
	}
}

public class Music5 {
	static void tune(Instrument1 i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument1[] e) {
		for (Instrument1 i : e) {
			tune(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument1[] or = { new Wind1(), new Percussion1(), new Stringed1(),
				new Brass1(), new WooWind1() };
		tuneAll(or);
		/*
		 * wind.play()MIDDLE_C Percussion.play()MIDDLE_C Stringed.play()MIDDLE_C
		 * Brass.play()MIDDLE_C WooWind.play()MIDDLE_C
		 */
	}

}
