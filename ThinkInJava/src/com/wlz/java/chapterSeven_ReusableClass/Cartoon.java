package com.wlz.java.chapterSeven_ReusableClass;
class Art{
	/*Art(){
		System.out.println("Art contructor");
	}*/
	Art(int i){
		System.out.println("art contruteor"+i);
	}
}

class Drawing extends Art{
	/*Drawing(){
		System.out.println("Drawing contructor");
	}*/
	Drawing(int i){
		super(i);
		System.out.println("drawing contruteor"+i);
	}
}
public class Cartoon extends Drawing {
	/*Cartoon(){
		System.out.println("Catroon contructor");
	}*/
	Cartoon(int i){
		super(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cartoon c = new Cartoon();
		Cartoon c=new Cartoon(10);
		/*Art contructor
		Drawing contructor
		Catroon contructor*/
	}

}
