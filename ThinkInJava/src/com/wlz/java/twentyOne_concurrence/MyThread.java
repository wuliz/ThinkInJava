package com.wlz.java.twentyOne_concurrence;

public class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name=name;
	}
public void run(){
	
	for(int i=0;i<1000;i++){
		System.out.println("name:"+name+","+i+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		t1.start();t2.start();
	}

}
