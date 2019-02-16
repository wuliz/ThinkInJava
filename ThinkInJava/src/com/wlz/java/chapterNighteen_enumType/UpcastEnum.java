package com.wlz.java.chapterNighteen_enumType;
enum Serach{
	HITHER,YOU;
}
public class UpcastEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enum e=Serach.HITHER;
		for(Enum em:e.getClass().getEnumConstants()){
			System.out.println(em);
		}
	}

}
