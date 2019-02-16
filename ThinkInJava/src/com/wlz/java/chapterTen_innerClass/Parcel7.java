package com.wlz.java.chapterTen_innerClass;

class Parcel8{
	class MyContents implements Contents{
		private int i = 11;

		public int value() {
			return i;
		}
	}
	public Contents contents(){
		return new MyContents();
	}
}
//Parcel8和Parcel7其实是一样的
public class Parcel7 {
	public Contents contents() {
		//这里创建了一个匿名内部类，该内部类实现了Contents类，并返回实例
		return new Contents() {
			private int i = 11;

			public int value() {
				return i;
			}
		};
	}

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		System.out.println(c.value());// 11
	}
}
