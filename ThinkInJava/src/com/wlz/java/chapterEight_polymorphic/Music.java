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
	//利用向上转型处理不同的导出类
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
		//wind向上转型可能会缩小接口，但不会比Instrument的全部接口更窄
		Brass b=new Brass();
		tune(b);//brass.paly()
		tune(flute);//brass.paly()
		
	}

}
