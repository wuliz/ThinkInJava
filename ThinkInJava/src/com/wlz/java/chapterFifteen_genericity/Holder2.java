package com.wlz.java.chapterFifteen_genericity;

public class Holder2 {
private Object a;
public Holder2(Object o){
	this.a=o;
}
public void set(Object o){
	this.a=o;
}
public Object get(){
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder2 h2 = new Holder2(new Holder());
		Holder a = (Holder)h2.get();
		h2.set("Not an holder");
		String s=(String)h2.get();
		h2.set(1);
		Integer x=(Integer)h2.get();
	}

}
