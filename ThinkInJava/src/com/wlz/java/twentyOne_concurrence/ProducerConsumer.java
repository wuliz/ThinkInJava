package com.wlz.java.twentyOne_concurrence;

class WoTou {
	static int count = 0;
	int id;

	WoTou(int id) {
		count++;
		this.id = id;
	}
}

class SyncStack {
	int index;
	WoTou[] arr = new WoTou[6];

	public synchronized void push(WoTou w) {
		if (index == arr.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		this.notify();
		arr[index++] = w;
	}

	public synchronized WoTou pop() {
		if (index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		this.notify();
		index--;
		return arr[index];
	}
}

class Producer implements Runnable {

	SyncStack s = null;

	Producer(SyncStack s) {
		this.s = s;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			WoTou w = new WoTou(i);
			s.push(w);
			System.out.println("生产了第"+w.count+"个窝头");
		}
	}

}

class Consumer implements Runnable {
	SyncStack s = null;

	Consumer(SyncStack s) {
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			WoTou w = s.pop();
			System.out.println("消费了了第"+w.count+"个窝头");
		}
	}

}

public class ProducerConsumer {

	public void main(String[] args) {
		SyncStack s = new SyncStack();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
	}
}
