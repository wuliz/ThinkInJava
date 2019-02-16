package com.wlz.java.twentyOne_concurrence;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskWithResult implements Callable<String>{
	private int id;
	TaskWithResult(int id){
		this.id=id;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++){
			System.out.println("this "+id+":i"+i);
		}
		return "result of TaskWithResult"+id;
	}
	
}
public class CallableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		//����̷߳��صö���Future(�ڲ���ŵ���String����)
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i=0;i<10;i++){
			//ִ���̣߳������ؽ������
			results.add(exec.submit(new TaskWithResult(i)));
		}
		//�õ��̷߳��صý����ȡ��
		for(Future<String> fs:results){
			try {
				System.out.println(fs.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				return;
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}finally{
				exec.shutdown();
			}
		}
	}

}
