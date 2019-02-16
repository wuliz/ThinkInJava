package com.wlz.java.chapterNighteen_enumType;

import java.lang.reflect.*;
import java.util.Set;
import java.util.TreeSet;

enum Explore{
	HERD,THERE;
}
public class Reflection {
public static Set<String> analyze(Class<?> enumclass){
	System.out.println("interface:");
	for(Type t:enumclass.getGenericInterfaces()){
		System.out.println(t);
	}
	System.out.println("Base:"+enumclass.getSuperclass());
	System.out.println("Methods:");
	Set<String> methods=new TreeSet<String>();
	for(Method m:enumclass.getMethods()){
		methods.add(m.getName());
	}
	System.out.println(methods);
	return methods;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> exploremethods = analyze(Explore.class);
		Set<String> enumMethods = analyze(Enum.class);
		System.out.println(exploremethods.containsAll(enumMethods));
		System.out.println(exploremethods.removeAll(enumMethods));
		System.out.println(exploremethods);
	}

}
