package com.wlz.java.chapterNighteen_enumType;

import java.util.Random;
enum Activity{
	A,B,C,D,E,F;
}
public class Enums {
private static Random r=new Random(47);
public static <T extends Enum<T>> T random(Class<T> ec){
	return random(ec.getEnumConstants());
}
public static <T> T random(T[] t){
	return t[r.nextInt(t.length)];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++){
			System.out.println(Enums.random(Activity.class));
		}
	}

}
