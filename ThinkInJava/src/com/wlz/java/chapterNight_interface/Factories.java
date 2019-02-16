package com.wlz.java.chapterNight_interface;

interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	Implementation1() {

	}

	public void method1() {
		System.out.println("Implementation1 method1");
	}

	public void method2() {
		System.out.println("Implementation1 method2");
	}
}

class ImplementationFactory implements ServiceFactory {
	public Service getService() {
		return new Implementation1();
	}
}

class Implementation2 implements Service {
	Implementation2() {

	}

	public void method1() {
		System.out.println("Implementation2 method1");
	}

	public void method2() {
		System.out.println("Implementation2 method2");
	}
}

class Implementation2Factory implements ServiceFactory {

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation2();
	}

}

public class Factories {
	public static void serviceConsumer(ServiceFactory fa) {
		Service s = fa.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serviceConsumer(new Implementation2Factory());
		serviceConsumer(new ImplementationFactory());
	}
	/*
	 * Implementation2 method1 
	 * Implementation2 method2
	 *  Implementation1 method1
	 * Implementation1 method2
	 */
}
