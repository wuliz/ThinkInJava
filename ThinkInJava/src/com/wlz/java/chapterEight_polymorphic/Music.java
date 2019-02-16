package com.wlz.java.chapterEight_polymorphic;
class Instrument{
	public void play(Note n){
		System.out.println("Instrumet.play()");
	}
}
class Wind extends Instrument{
	public void play(Note n){
		System.out.println("Wind.play()");
	}
}
class Brass extends Instrument{
	public void play(Note n){
		System.out.println("brass.paly()");
	}
}
public class Music {
	//��������ת�ʹ���ͬ�ĵ�����
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Wind i){
		i.play(Note.MIDDLE_C);
	}
	public static void tune(Brass i){
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute=new Wind();
		tune(flute);//Wind.play()
		//wind����ת�Ϳ��ܻ���С�ӿڣ��������Instrument��ȫ���ӿڸ�խ
		Brass b=new Brass();
		tune(b);//brass.paly()
		tune(flute);//brass.paly()
		
	}

}
