package com.wlz.java.chapterNight_interface;
//如果要用a类中的b接口，需要引入
import com.wlz.java.chapterNight_interface.A.B;

class A{
	interface B{
		void f();
	}
}
class BImp implements B{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}
	
}
class BImp2 implements B{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}
	
}
interface C{
	void f();
}
class CTmp implements C{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}
	
}
class CTmp2 implements C{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}
	
}
interface D{
	void f();
}

public class NestingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
