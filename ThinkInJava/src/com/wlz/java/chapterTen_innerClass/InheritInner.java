package com.wlz.java.chapterTen_innerClass;
class WithInner{
	class Inner{
		
	}
}
//InheritInnner继承了一个内部类
//由于内部类的构造器必须要连接到外围对象的引用
public class InheritInner extends WithInner.Inner {
	//引向外围对象的引用
	InheritInner(WithInner wi){
		//
		wi.super();
	}
}