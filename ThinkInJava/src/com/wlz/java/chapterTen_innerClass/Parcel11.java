package com.wlz.java.chapterTen_innerClass;

public class Parcel11 {
	private static class ParcelContents implements Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	protected static class ParcelDestination implements Destination {
		private String lebal;

		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return lebal;
		}

		private ParcelDestination(String whereto) {
			lebal = whereto;
		}

		public static void f() {
		}

		static int x = 10;

		static class AnotherLevel {
			public static void f() {

			}

			static int x = 10;
		}
	}
	public static Destination destination(String s){
		return new ParcelDestination(s);
		
	}
	public static Contents contents(){
		return new ParcelContents();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contents c=contents();
		Destination d = destination("taldjal");
	}

}
