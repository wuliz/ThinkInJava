package com.wlz.java.chapterFifteen_genericity;

public class Erased<T> {
private final int SIZE=100;
public static void f(Object arg){
	/*if(arg instanceof T){
		
	}*/
	
	//擦出类型，所以不能通过编译，另外也不知道T类型中是否有默认的构造函数
	//T var=new T();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
