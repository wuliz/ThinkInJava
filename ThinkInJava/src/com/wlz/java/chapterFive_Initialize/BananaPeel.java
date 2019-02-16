package com.wlz.java.chapterFive_Initialize;
class Banan{
	void peel(int i){
		
	}
}
class Aprioc{
	void pick(){
		
	}
	void pit(){
		//无需添加this
		pick();
	}
}

class Left{
	int i;
	Left comment(){
		i++;
		//需要返回当前对象的引用
		return this;
	}
	void print(){
		System.out.println(i);
	}
}

public class BananaPeel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banan a=new Banan(),
			b=new Banan();
		a.peel(1);
		b.peel(2);
		
		//如果只有一个peel方法，它是如何知道是被谁调用的呢
		//发送消息给对象，编译器内部做了这样的工作
		//Banan(a,1)
		//Banan(b,1)
		//但这是内部做的处理，我们不能直接这样用
		
		//假如你希望获取当前对象的引用，有一个专门的关键字 this(表示调用方法的那个对象)
		//方法内部调用当前类的另一个方法，无需加this,编译器会自动添加，只有明确需要指明this对象的时候再使用
		Left l=new Left();
		//由于返回当前对象的引用，所以可以一直执行该类的方法
		l.comment().comment().comment().print();//3
	}

}
