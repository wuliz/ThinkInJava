package com.wlz.java.chapterSeven_ReusableClass;
class Amphibian{
	public void swim(){
		System.out.println("游泳");
	}
	public void walk(){
		System.out.println("行走");
	}
	//私有方法不能被继承
	private void test(){
		
	}
}
public class Frog extends Amphibian{
	public void swim(){
		System.out.println("青蛙游泳");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian f=new Frog();
		f.walk();
		f.swim();
		
	}	

}
