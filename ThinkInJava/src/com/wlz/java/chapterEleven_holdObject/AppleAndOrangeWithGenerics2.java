package com.wlz.java.chapterEleven_holdObject;

import java.util.ArrayList;

class Apple1{
	private static long counter;
	private final long id=counter++;
	public long id(){
		return id;
	}
}
class Orange1{
	
}
public class AppleAndOrangeWithGenerics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple1> apples=new ArrayList<Apple1>();
		for(int i=0;i<3;i++){
			apples.add(new Apple1());
			
		}
		//apples.add(new Orange());使用泛型后会规定容器的存储类型，编译器错误
		for(int i=0;i<apples.size();i++){
			((Apple1)(apples.get(i))).id();
		}
	}

}
