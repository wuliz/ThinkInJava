package com.wlz.java.chapterSeven_ReusableClass;
class Amphibian{
	public void swim(){
		System.out.println("��Ӿ");
	}
	public void walk(){
		System.out.println("����");
	}
	//˽�з������ܱ��̳�
	private void test(){
		
	}
}
public class Frog extends Amphibian{
	public void swim(){
		System.out.println("������Ӿ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amphibian f=new Frog();
		f.walk();
		f.swim();
		
	}	

}
