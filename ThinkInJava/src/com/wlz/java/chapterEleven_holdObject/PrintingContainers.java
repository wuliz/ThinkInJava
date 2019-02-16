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
		//Ĭ�ϴ�ӡ��Ϊ��ʹ�������ṩ��toString()����
		//չʾ��Java�е�����������collection ��Map(�������������Ĳ۲�ͬ)
		//List�����˳��ʹ���˳����ͬ��
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		//Set,��ͬ��ֻ����һ������洢��˳��ͬ��
		//HashSetʹ���൱���ӵķ�ʽ�洢˳�򣬿������Ļ�ȡԪ�أ�����ĵ���ĳ�������ǲ���HashSet����ĳ�Ա������������˳��
		//���˳�����Ҫ������ʹ��TreeSet,���ձȽϽ�����򱣴����
		//LinkedhashSet:����˳�򱣴����
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		//Map��ͬһ�����ı���һ���������ǰ���
		//HashMap:�ṩ���Ĳ���
		//TreeMap:���ȽϽ������
		//LinkedHashMap:���������ٶȲ�������˳��洢
		//����˳���ǲ���˳����ΪHashMapʹ��һ�ַǳ���ķ����洢
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
