package com.wlz.java.chapterEight_polymorphic;
class Userful{
	void f(){
		
	}
	void g(){
		
	}
}
class MoreUserful extends Userful{
	void f(){
		
	}
	void g(){
		
		
	}
	void u(){
		
	}
}
public class RTTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userful[] arr={new Userful(),new MoreUserful()};
		//arr[1].u()���������
		((MoreUserful)arr[1]).u();
		((MoreUserful)arr[0]).u();//ת��ʧ�ܣ��׳��쳣
	}

}
