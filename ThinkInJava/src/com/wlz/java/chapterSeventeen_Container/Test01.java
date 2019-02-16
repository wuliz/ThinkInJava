package com.wlz.java.chapterSeventeen_Container;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//容器的深入研究
		
		//Collection的功能方法
		
		//注意：
		/*
		 * ,
		 */
		List<Integer> asList = Arrays.asList(1,2,3);
		//注意：这里得到的list的底层是数组实现的，数组的长度是可变的，不能像数据进行增删的操作，会报异常
		//asList.add(5);
		//这里将得到一个普通的容器
		List<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		al.add(5);
		
		/*
		 * Set和存储顺序
		 * Set具有和Collection一样的接口
		 * Set中的元素不允许重复，所以一定要定义equals方法保证对象的一致性
		 * HashSet，为快速查找而设计的Set,存入Set的元素必须有hashCode()
		 * TreeSet,底层为树结构，有序，存入的元素必须实现Comparable接口(依照CompareTo()的结果排序保存)
		 * LinkedHashset:（按照插入顺序保存）
		 * 示例（TypesForSets.java）
		 */
		/*
		 * 理解Map(映射表也叫关联数组)，下面看映射表的简单实现
		 * 示例（AssociativeArray.java）
		 * 缺点：查找速度特别慢
		 * 
		 * 1、性能
		 * map和set有一定的相似性
		 * Map中不能有相同的键，所以存入键的元素也要实现equals方法
		 * HashMap，使用散列表存储，查找速度块，所以存入键的元素需要实现HashCode()
		 * TreeMap,按照某种顺序排列：所以存入键的元素需要实现Comparable接口
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
		//继承于hashtable
		//可以将kv对保存在文件里
		/*
		 * 适用于少量的配置文件
		 * 从文件加载的load方法
		 * 写入文件中的store方法
		 * 获取属性：getProperty
		 * 设置属性：setProperty
		 * 示例（PropertiesTest.java）
		 */
		
	}

}
