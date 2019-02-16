package com.wlz.java.chapterTen_innerClass;

interface Contents {
	int value();
}

interface Destination {
	String readLabel();
}

class Parcel4 {
	//�ⲿ���ܷ���˽���ڲ���
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
		//���ܷ���˽���ڲ���
		//p.new PContens();
		
	}

}
