package com.wlz.java.chapterTen_innerClass;

interface Contents {
	int value();
}

interface Destination {
	String readLabel();
}

class Parcel4 {
	//外部不能访问私有内部类
	private class PContents implements Contents {
		private int i = 11;

		public int value() {
			return i;
		}

	}

	protected class PDestination implements Destination {
		private String label;

		private PDestination(String whereto) {
			label = whereto;
		}

		public String readLabel() {
			return label;
		}
	}

	public Destination destination(String s) {
		return new PDestination(s);
	}

	public Contents contents() {
		return new PContents();
	}

}

public class TestParcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel4 p=new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("teandani");
		//不能访问私有内部类
		//p.new PContens();
		
	}

}
