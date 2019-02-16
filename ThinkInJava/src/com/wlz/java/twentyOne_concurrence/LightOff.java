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
			//���Խ�cpu��һ���߳�ת�Ƶ���һ���߳�
			Thread.yield();
		}
	}
	//������Ҳ��һ���߳�
	public static void main(String[] args){
		//���������������֮��������������κ��߳�����
		/*LightOff loff = new LightOff();
		loff.run();*/
		//��Ҫʵ���̣߳��������ʽ�ý�һ�����񸽵��߳���
		Thread t = new Thread(new LightOff());
		//Ϊ�߳�ִ�б���ó�ʼ������
		//t.start();
		//System.out.println("waiting for lightOff");
		
		//���洴��������̣߳�����ִ��
		for(int i=0;i<5;i++){
			Thread t2 = new Thread(new LightOff());
			t2.start();
		}
	}

}
