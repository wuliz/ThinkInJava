package com.wlz.java.chapterTen_innerClass;

public class Parcel5 {
	public Destination destination(String s){
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereto){
				label=whereto;
			}
			public String readLabel(){
				return label;
			}
		}
		return new PDestination(s);//�ڷ����ڷŻؾֲ��ڲ������
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel5 p=new Parcel5();
		Destination x = p.destination("heel");
	}

}
