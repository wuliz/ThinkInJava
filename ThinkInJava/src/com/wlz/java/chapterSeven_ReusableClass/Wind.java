package com.wlz.java.chapterSeven_ReusableClass;
class Instrument{
	public void play(){
		System.out.print("������");
	}
	static void tune(Instrument i){
		i.play();
	}
}
public class Wind extends Instrument{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind w=new Wind();
		//���Խ�wind��Ķ��󴫸�Instrument������
		Instrument.tune(w);
	}

}
