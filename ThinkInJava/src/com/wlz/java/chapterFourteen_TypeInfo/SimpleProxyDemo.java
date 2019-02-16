package com.wlz.java.chapterFourteen_TypeInfo;
//静态代理模式
interface Interface {
	void doSomething();

	void somethingElse(String arg);
}

class RealObject implements Interface {
	public void doSomething() {
		System.out.println("doSomeThing");
	}

	public void somethingElse(String arg) {
		System.out.println("somethingElse" + arg);
	}
}

class SimpleProxy implements Interface {
	private Interface proxied;

	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxy dosomething");
		proxied.doSomething();
	}

	@Override
	public void somethingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxy dosomethingElse" + arg);
		proxied.somethingElse(arg);
	}

}

public class SimpleProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}

}
