package com.wlz.java.twentyOne_concurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LightOff {
public void run(){
	try{
		while(countDown-->0){
			System.out.println(status());
			TimeUnit.MILLISECONDS.sleep(100);
	}
	}catch(InterruptedException e){
		System.err.println("Interrupted");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<5;i++){
			exec.execute(new SleepingTask());
			
		}
		exec.shutdown();
	}

}
