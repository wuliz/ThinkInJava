package com.wlz.java.chapterTen_innerClass;
interface Counter{
	int next();
}
//局部内部类和匿名内部类的比较
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
			//匿名内部类的构造器能有名字
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
