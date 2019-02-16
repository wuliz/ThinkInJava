package com.wlz.java.chapterTen_innerClass;

public abstract class Event {
	private long eventTime;
	protected final long delayTime;

	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}

	public void start() {
		eventTime = System.nanoTime() + delayTime;//从对象创建的时刻开始的时间
	}

	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}

	public abstract void action();
	//在这里，我们不知道event做了什么，这就是接口与实现的分离，你可以创建具体的类实现event
	
}
