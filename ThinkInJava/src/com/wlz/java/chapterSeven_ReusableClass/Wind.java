package com.wlz.java.chapterSeven_ReusableClass;
class Instrument{
	public void play(){
		System.out.print("在演奏");
	}
	static void tune(Instrument i){
		i.play();
	}
}
public class Wind extends Instrument{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind w=new Wind();
		//可以将wind类的对象传给Instrument的引用
		Instrument.tune(w);
	}

}
