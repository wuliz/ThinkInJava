package com.wlz.java.twentyOne_concurrence;

public class TestDeadLock implements Runnable{
public int flag=1;
static Object o1=new Object();
static Object o2=new Object();
public void run(){
	System.out.println("flag="+flag);
	if(flag==1){
		synchronized(o1){
			try{
				Thread.sleep(5000);
			}catch(Exception e){
				e.printStackTrace();
			}
			synchronized(o2){
				System.out.println("1");
			}
		}
	}
	if(flag==0){
		synchronized(o2){
			try{
				Thread.sleep(5000);
			}catch(Exception e){
				e.printStackTrace();
			}
			synchronized(o1){
				System.out.println("0");
			}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDeadLock t1 =new TestDeadLock();
		TestDeadLock t2 = new TestDeadLock();
		t1.flag=1;
		t2.flag=0;
		new Thread(t1).start();
		new Thread(t2).start();
	}

}
