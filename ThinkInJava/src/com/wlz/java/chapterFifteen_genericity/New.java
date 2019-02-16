package com.wlz.java.chapterFifteen_genericity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class New {
public static <K,V> Map<K,V> map(){
	return new HashMap<K,V>();
}
public static <T> List<T> list(){
	return new ArrayList<T>();
}
public static <T> LinkedList<T> llist(){
	return new LinkedList<T>();
}
public static <T> Set<T> set(){
	return new HashSet<T>();
}
public static <T> Queue<T> queue(){
	return new LinkedList<T>();
}
	public static void main(String[] args) {
		//
		// TODO Auto-generated method stub
		Map<String,List<String>> sls = New.map();
		List<String> ls=New.list();
		LinkedList<String> lls=New.llist();
		Set<String> ss=New.set();
		Queue<String> qs=New.queue();
		//显示指明类型
		List<String> l = New.<String>list();
		
	}

}
