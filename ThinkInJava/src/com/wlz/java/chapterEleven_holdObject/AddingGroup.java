package com.wlz.java.chapterEleven_holdObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,1,4,5));
		Integer[] moreInts={6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection,11,12,13,14,15);
		Collections.addAll(collection, moreInts);
		//����ͨ��Arrays.asList���ص���һ��list���󣬵����ĵײ㻹������ʵ�ֵģ����Բ��ܵ���add()��delete�����ķ�����
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(1, 99);
		//list.add(21);//��������ʱ�쳣
		for(Integer i:collection)
		System.out.println(i);
	}

}
