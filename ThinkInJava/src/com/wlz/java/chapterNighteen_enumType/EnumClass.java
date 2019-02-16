package com.wlz.java.chapterNighteen_enumType;
enum Shrubbery{
	GROuD,CRAWING,CRWILING,HANGING
}
public class EnumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Shrubbery s:Shrubbery.values()){
			System.out.println(s+"ordinal:"+s.ordinal());
			System.out.println(s.compareTo(Shrubbery.CRWILING));
			System.out.println(s.equals(Shrubbery.CRWILING));
			System.out.println(s==Shrubbery.CRWILING);
			System.out.println(s.getDeclaringClass());
			System.out.println(s.name());
			System.out.println("______________________________________________");
		}
	}

}
