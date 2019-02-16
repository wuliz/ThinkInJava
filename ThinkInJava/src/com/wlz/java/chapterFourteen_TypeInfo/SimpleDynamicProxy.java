package com.wlz.java.chapterFourteen_TypeInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("*****proxy:"+proxy.getClass()+".method:"+method+".args:"+args);
		if(args!=null){
			for(Object arg:args){
				System.out.println(" "+arg);
			}
		}
		return method.invoke(proxied, args);
	}
	public DynamicProxyHandler(Object x){
		this.proxied=x;
	}
	
}
public class SimpleDynamicProxy {
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealObject real = new RealObject();
		consumer(real);
		
		Interface proxy=(Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));
		consumer(proxy);
	}

}
