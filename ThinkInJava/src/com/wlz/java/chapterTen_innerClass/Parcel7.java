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
//Parcel8��Parcel7��ʵ��һ����
public class Parcel7 {
	public Contents contents() {
		//���ﴴ����һ�������ڲ��࣬���ڲ���ʵ����Contents�࣬������ʵ��
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
