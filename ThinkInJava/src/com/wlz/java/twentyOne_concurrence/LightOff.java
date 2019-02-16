package com.wlz.java.twentyOne_concurrence;

public class LightOff implements Runnable {
	protected int countDown=10;
	private static int taskCount=0;
	private final int id=taskCount++;
	public LightOff(){
		
	}
	public LightOff(int countDown){
		this.countDown=countDown;
	}
	public String status(){
		return "#"+id+"("+(countDown>0?countDown:"Lightoff!")+").";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(countDown-->0){
			System.out.print(status());
			//可以将cpu从一个线程转移到另一个线程
			Thread.yield();
		}
	}
	//主函数也是一个线程
	public static void main(String[] args){
		//这个方法并无特殊之处，它不会产生任何线程能力
		/*LightOff loff = new LightOff();
		loff.run();*/
		//，要实现线程，你必须显式得将一个任务附到线程上
		Thread t = new Thread(new LightOff());
		//为线程执行必需得初始化操作
		//t.start();
		//System.out.println("waiting for lightOff");
		
		//下面创建了五个线程，并发执行
		for(int i=0;i<5;i++){
			Thread t2 = new Thread(new LightOff());
			t2.start();
		}
	}

}
