package com.wlz.java.chapterFive_Initialize;
class Bow{
	int x;
	static int y;
	Bow(int i){
		System.out.println("y="+y);
		System.out.print("x="+x);
		System.out.println("Bow"+i);
	}
	void fun(){
		System.out.print(y);
	}
	static void test(){
		/*System.out.print(x);
		fun()*/
		System.out.println("test");
	}
}
public class Dog {
	public static void main(String[] args){
		Bow.test();
	}
	//static Bow b=new Bow(4);

}
