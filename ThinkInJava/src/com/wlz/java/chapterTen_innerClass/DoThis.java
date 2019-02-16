package com.wlz.java.chapterTen_innerClass;

public class DoThis {
void f(){
	System.out.println("DoThis.f()");
}
class Inner{
	public DoThis outer(){
		//返回外部类：.this的使用
		return DoThis.this;
	}
}
//创建一个静态内部类
static class inner2{
	
}
public Inner inner(){
	return new Inner();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoThis dt = new DoThis();
		DoThis.Inner dti = dt.inner();
		//返回外部类对象后调用外部类函数
		dti.outer().f();
		//.new的使用
		Inner in = dt.new Inner();
		in.outer().f();
		
		//静态内部类对象的创建
		DoThis.inner2 i=new DoThis.inner2();
		
		
	}

}
