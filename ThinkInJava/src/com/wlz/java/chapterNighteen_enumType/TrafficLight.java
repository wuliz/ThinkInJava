package com.wlz.java.chapterNighteen_enumType;
enum Signal{
	GREEN,YELLOW,RED;
}
public class TrafficLight {
Signal color=Signal.GREEN;
public void change(){
	switch(color){
	case RED:color=Signal.GREEN;break;
	case GREEN:color=Signal.YELLOW;break;
	case YELLOW:color=Signal.RED;break;
	}
}
public String toString(){
	return "the traffic light is"+color;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight tl = new TrafficLight();
		for(int i=0;i<7;i++){
			System.out.println(tl);
			tl.change();
		}
	}

}
