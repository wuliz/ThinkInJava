package com.wlz.java.chapterTen_innerClass;

public abstract class Event {
	private long eventTime;
	protected final long delayTime;

	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}

	public void start() {
		eventTime = System.nanoTime() + delayTime;//�Ӷ��󴴽���ʱ�̿�ʼ��ʱ��
	}

	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}

	public abstract void action();
	//��������ǲ�֪��event����ʲô������ǽӿ���ʵ�ֵķ��룬����Դ����������ʵ��event
	
}
