package com.wlz.java.chapterTen_innerClass;
interface Counter{
	int next();
}
//�ֲ��ڲ���������ڲ���ıȽ�
public class LocalInnerClass {
	private int count=0;
	Counter getCounter(final String name){
		class LocalCounter implements Counter{
			public LocalCounter(){
				System.out.println("LocalCounter");
			}
			public int next(){
				System.out.println(name);
				return count++;
			}
		}
		return new LocalCounter();
	}
	Counter getCounter2(final String name){
		return new Counter(){
			//�����ڲ���Ĺ�������������
			{
				System.out.println("LocalCounter");
			}
			public int next(){
				System.out.println(name);
				return count++;
			}
		};
	}

}
