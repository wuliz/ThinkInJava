package com.wlz.java.chapterSeven_ReusableClass;
class Clear{
	private String s="Cleaner";
	public void append(String a){
		s+=a;
	}
	public void dilute(){
		append("dilute()");
	}
	public void apply(){
		append("apply()");
	}
	public void scrub(){
		append("scrub()");
	}
	public String toString(){
		return s;
	}
	static void main(String[] args){
		Clear x=new Clear();
		x.dilute();x.apply();x.scrub();
		System.out.println(x);
	}
}
class Test extends Detergent{
	public void scrub(){
		append("test.scrub()");
		super.scrub();
	}
	public void sterlize(){
		append("sterlize()");
	}
}
public class Detergent extends Clear{
	public void scrub(){
		append("detergent.scrub()");
		super.scrub();
	}
	public void foam(){
		append("foam()");
	}
	public static void main(String[] args){
		Detergent x=new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Test base class:");
		Clear.main(args);
	}
}
