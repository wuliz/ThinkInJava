package com.wlz.java.chapterNight_interface;

import com.wlz.java.chapterEight_polymorphic.Note;

abstract class Instrument{
	private int i;
	public abstract void play(Note n);
	public String what(){
		return "Instrument";
	}
	public abstract void adjust();
}
class Wind extends Instrument{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("wind.play()"+n);
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
	public String what(){
		return "wind";
	}
	
}
class Percussion extends Instrument{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Percussion.play()"+n);
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
	public String what(){
		return "Percussion";
	}
	
}
class Stringed extends Instrument{

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Stringed.play()"+n);
	}

	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		
	}
	public String what(){
		return "Stringed";
	}
	
}
class Brass extends Wind{
	public void play(Note n){
		System.out.println("Brass.play()"+n);
	}
	public void adjust(){
		System.out.println("Brass.adjust");
	}
}
class WooWind extends Wind{
	public void play(Note n){
		System.out.println("WooWind.play()"+n);
	}
	public String what(){
		return "Woodwind";
	}
}
public class Music4 {
	static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e){
		for(Instrument i:e){
			tune(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] or={new Wind(),new Percussion(),new Stringed(),new Brass(),new WooWind()};
		tuneAll(or);
	}

}
