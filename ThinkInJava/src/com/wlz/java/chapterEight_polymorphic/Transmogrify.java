package com.wlz.java.chapterEight_polymorphic;

class Actor {
	public void act() {

	}
}

class HappyActor extends Actor {
	public void act() {
		System.out.println("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		System.out.println("SadActor");
	}
	public void test(){
		
	}
}

class State {
	private Actor a = new SadActor();

	public void performplay() {
		a.act();
	}

	public void change() {
		a = new SadActor();
	}
}

public class Transmogrify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State s = new State();
		s.performplay();
		s.change();
		s.performplay();
		/*
		 * HappyActor 
		 * SadActor
		 */
	}

}
