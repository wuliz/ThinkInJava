package com.wlz.java.twentyOne_concurrence;
class Sleeper extends Thread{
	private int duration;
	public Sleeper(String name,int sleepTime){
		super(name);
		duration=sleepTime;
		start();
	}
	public void run(){
		try{
			sleep(duration);
		}catch(InterruptedException e){
			System.out.println(getName()+"was interrupted.isInterrupted()"+isInterrupted());
			return ;
		}
		System.out.println(getName()+"has awakened");
	}
}
class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name,Sleeper sleeper){
		super(name);
		this.sleeper=sleeper;
		start();
	}
	public void run(){
		try{
			sleeper.join();
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}
		System.out.println(getName()+"join completed");
	}
}
public class Joining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleeper sleepy = new Sleeper("sleepy",1500);
		Sleeper grumpy=new Sleeper("grumpy",1500);
		Joiner dopey = new Joiner("Dopey",sleepy);
		Joiner doc = new Joiner("doc",grumpy);
	}

}