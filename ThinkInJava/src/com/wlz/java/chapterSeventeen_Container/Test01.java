package com.wlz.java.chapterSeventeen_Container;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����������о�
		
		//Collection�Ĺ��ܷ���
		
		//ע�⣺
		/*
		 * ,
		 */
		List<Integer> asList = Arrays.asList(1,2,3);
		//ע�⣺����õ���list�ĵײ�������ʵ�ֵģ�����ĳ����ǿɱ�ģ����������ݽ�����ɾ�Ĳ������ᱨ�쳣
		//asList.add(5);
		//���ｫ�õ�һ����ͨ������
		List<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		al.add(5);
		
		/*
		 * Set�ʹ洢˳��
		 * Set���к�Collectionһ���Ľӿ�
		 * Set�е�Ԫ�ز������ظ�������һ��Ҫ����equals������֤�����һ����
		 * HashSet��Ϊ���ٲ��Ҷ���Ƶ�Set,����Set��Ԫ�ر�����hashCode()
		 * TreeSet,�ײ�Ϊ���ṹ�����򣬴����Ԫ�ر���ʵ��Comparable�ӿ�(����CompareTo()�Ľ�����򱣴�)
		 * LinkedHashset:�����ղ���˳�򱣴棩
		 * ʾ����TypesForSets.java��
		 */
		/*
		 * ���Map(ӳ���Ҳ�й�������)�����濴ӳ���ļ�ʵ��
		 * ʾ����AssociativeArray.java��
		 * ȱ�㣺�����ٶ��ر���
		 * 
		 * 1������
		 * map��set��һ����������
		 * Map�в�������ͬ�ļ������Դ������Ԫ��ҲҪʵ��equals����
		 * HashMap��ʹ��ɢ�б�洢�������ٶȿ飬���Դ������Ԫ����Ҫʵ��HashCode()
		 * TreeMap,����ĳ��˳�����У����Դ������Ԫ����Ҫʵ��Comparable�ӿ�
		 */
		Class<Integer> a=int.class;
		try {
			Constructor<Integer> c = a.getConstructor(Integer.class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str1 = new String("111");
		String str2 = new String("222");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		/*
		 * 48657
48657
		 */
		//Properties
		//�̳���hashtable
		//���Խ�kv�Ա������ļ���
		/*
		 * �����������������ļ�
		 * ���ļ����ص�load����
		 * д���ļ��е�store����
		 * ��ȡ���ԣ�getProperty
		 * �������ԣ�setProperty
		 * ʾ����PropertiesTest.java��
		 */
		
	}

}
