package com.wlz.java.chapterFive_Initialize;
class Bird{
	Bird(int i){
		
	}
	Bird(double d){
		
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b=new Bird(5);//默认构造器
		
		//Bird d=new Bird()就会报错：没有匹配到没有参数的构造器
	}

}
