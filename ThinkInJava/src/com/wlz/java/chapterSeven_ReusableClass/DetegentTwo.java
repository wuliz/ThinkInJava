package com.wlz.java.chapterSeven_ReusableClass;
class Clear2{
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
public class DetegentTwo {
	private Clear2 c=new Clear2();
	public void dliute(){
		c.dilute();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetegentTwo d=new DetegentTwo();
		d.dliute();
	}

}
