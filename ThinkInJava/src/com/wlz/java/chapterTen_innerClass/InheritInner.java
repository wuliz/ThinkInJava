package com.wlz.java.chapterTen_innerClass;
class WithInner{
	class Inner{
		
	}
}
//InheritInnner�̳���һ���ڲ���
//�����ڲ���Ĺ���������Ҫ���ӵ���Χ���������
public class InheritInner extends WithInner.Inner {
	//������Χ���������
	InheritInner(WithInner wi){
		//
		wi.super();
	}
}