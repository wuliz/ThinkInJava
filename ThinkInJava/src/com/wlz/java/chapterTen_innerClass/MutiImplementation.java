package com.wlz.java.chapterTen_innerClass;
class D{
	
}
abstract class E{
	
}
class Z extends D{
	E makeE(){
		return new E(){
			
		};
	}
}
public class MutiImplementation {
static void takesD(D d){
	
}
static void takesE(E e){
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Z z = new Z();	
	takesD(z);
	takesE(z.makeE());
	}

}
