package com.wlz.java.chapterEight_polymorphic;
//��ʳ��
class Grain{
	public String toString(){
		return "Grain";
	}
}
//С��
class Wheat extends Grain{
	public String toString(){
		return "Wheat";
	}
}
//��
class Mill{
	Grain process(){
		return new Grain();
	}
}
//С���
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
