package com.wlz.java.chapterSix_accessPremiss;
class Sunade{
	private Sunade(){
		
	}
	static Sunade createSun(){
		return new Sunade();
	}
}
public class IceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sunade s=new Sunade();//ÌáÊ¾´íÎó
		Sunade s=Sunade.createSun();
		System.out.println(s);//com.wlz.java.chapterSix_accessPremiss.Sunade@77aaf64d
	}

}
