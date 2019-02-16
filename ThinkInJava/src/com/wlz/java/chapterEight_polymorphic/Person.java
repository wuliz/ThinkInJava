package com.wlz.java.chapterEight_polymorphic;
class Circle{
	
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("Circle riding");
	}
	
}
class Unicycle extends Circle{
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("UNCircle riding");
	}
}
class Bicycle extends Circle{
	public void ride() {
		System.out.println("BICircle riding");// TODO Auto-generated method stub
		
	}
}
class Tricycle extends Circle{
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("Tricycle riding");
	}
}
public class Person {
	public void user(Circle c){
		c.ride();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Circle c=new Circle();
		Unicycle u=new Unicycle();
		Tricycle t=new Tricycle();
		Bicycle b=new Bicycle();
		p.user(c);//Circle riding
		p.user(b);//BICircle riding
		p.user(t);//Tricycle riding
		p.user(u);//UNCircle riding
		
	}

}
