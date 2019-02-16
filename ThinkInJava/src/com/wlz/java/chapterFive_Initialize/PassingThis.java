package com.wlz.java.chapterFive_Initialize;
class Person{
	public void eat(Apple a){
	Apple peeled=a.getPeeled();	
	System.out.print("yummy");
	}
}
class Apple{

	public Apple getPeeled() {
		// TODO Auto-generated method stub
		return Peeler.peel(this);
		
	}
	
}
class Peeler{
	static Apple peel(Apple a){
		return a;
	}
}
public class PassingThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person().eat(new Apple());

	}

}
