package com.wlz.java.chapterFive_Initialize;

class Book{
	boolean check=false;
	Book(boolean checkout){
		check=checkout;
	}
	void checkIn(){
		check=false;
	}
	//���ڴ����ʱ������ø÷���
	protected void finalize() throws Throwable{
		
			System.out.println("error:checkout");
		
			System.out.println(this.check);
			super.finalize();
		
	}
}
public class TerminationCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book naval =new Book(true);
		naval.checkIn();
		new Book(true);
		System.gc();

	}

}
