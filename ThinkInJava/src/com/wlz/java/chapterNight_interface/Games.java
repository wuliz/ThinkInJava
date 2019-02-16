package com.wlz.java.chapterNight_interface;
interface Game{
	boolean move();
}
class Checkers implements Game{
	private int moves=0;
	private static final int MOVES=3;
	public boolean move(){
		System.out.println("Checkers mober"+moves);
		return ++moves!=MOVES;
	}
}

public class Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
