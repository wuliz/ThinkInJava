package com.wlz.java.chapterTen_innerClass;

public class DoThis {
void f(){
	System.out.println("DoThis.f()");
}
class Inner{
	public DoThis outer(){
		//�����ⲿ�ࣺ.this��ʹ��
		return DoThis.this;
	}
}
//����һ����̬�ڲ���
static class inner2{
	
}
public Inner inner(){
	return new Inner();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoThis dt = new DoThis();
		DoThis.Inner dti = dt.inner();
		//�����ⲿ����������ⲿ�ຯ��
		dti.outer().f();
		//.new��ʹ��
		Inner in = dt.new Inner();
		in.outer().f();
		
		//��̬�ڲ������Ĵ���
		DoThis.inner2 i=new DoThis.inner2();
		
		
	}

}
