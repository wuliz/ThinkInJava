package com.wlz.java.chapterEleven_holdObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrintingContainers {
	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;

	}

	static Map fill(Map<String, String> map) {
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "spot");
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//默认打印行为，使用容器提供的toString()方法
		//展示了Java中的两种容器：collection 和Map(在与两种容器的槽不同)
		//List（输出顺序和存入顺序相同）
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		//Set,相同的只保存一项（输出与存储的顺序不同）
		//HashSet使用相当复杂的方式存储顺序，可以最快的获取元素，你关心的是某个对象是不是HashSet里面的成员，不关心它的顺序，
		//如果顺序很重要，可以使用TreeSet,按照比较结果升序保存对象
		//LinkedhashSet:按照顺序保存对象
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		//Map：同一个键的保存一项，后面的替代前面的
		//HashMap:提供最快的查找
		//TreeMap:按比较结果升序
		//LinkedHashMap:保留查找速度并按插入顺序存储
		//保存顺序不是插入顺序，因为HashMap使用一种非常块的方法存储
		System.out.println(fill(new HashMap<String, String>()));
		System.out.println(fill(new TreeMap<String, String>()));
		System.out.println(fill(new LinkedHashMap<String, String>()));
		/*
		 * [rat, cat, dog, dog] [rat, cat, dog, dog] [cat, dog, rat] [cat,
		 * dog,rat] [rat, cat, dog] {cat=Rags, dog=spot, rat=Fuzzy}
		 * {cat=Rags,dog=spot, rat=Fuzzy} {rat=Fuzzy, cat=Rags, dog=spot}
		 */
	}

}
