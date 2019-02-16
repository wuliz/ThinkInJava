package com.wlz.java.chapterEight_polymorphic;
//粮食类
class Grain{
	public String toString(){
		return "Grain";
	}
}
//小麦
class Wheat extends Grain{
	public String toString(){
		return "Wheat";
	}
}
//机
class Mill{
	Grain process(){
		return new Grain();
	}
}
//小麦机
class WheatMill extends Mill{
	Wheat process(){
		return new Wheat();
	}
}
public class CovariantReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mill m=new Mill();
		Grain g = m.process();
		System.out.println(g);//Grain
		m=new WheatMill();
		g=m.process();
		System.out.println(g);//Wheat
	}

}
