package com.wlz.java.chapterThirteen_String;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//字符串：字符串是计算机设计中最常见的行为
		
		/*
		 * 1、不可变String
		 * String保存的是一个不可变的字符串，每当我们看似修改一个字符串，其实是将该字符串引用指向了一个新的字符串
		 */
		
		/*
		 * 2、重载“+”与StringBulider
		 * String a= a+"123"
		 * 解析:将a字符串与“123”进行连接，给一个新的String对象，用a引用这个对象
		 * 那如果有很多的重复操作怎么办：这样会使程序不断的创建String对象，如果没有及时回收，会存在内存占用的问题
		 * 那Java虚拟机会怎么做？
		 * 编译器内部会创建一个StringBulider对象，StringBuilder是可变字符串，调用它的append()方法进行字符串连接
		 * 那StringBulider和StringBuffer有什么区别？
		 * StirngBuilder是线程不安全的，StringBuffer是线程安全的
		 * JVM内存划分（运行时数据区）：
		 * Java栈
		 * 堆
		 * 本地方法栈
		 * 方法区
		 * 程序计数器：
		 */
		/*
		 * 3、无意识的递归
		 * 每一个类都继承Object，输出类时，会默认调用它的toString方法
		 * 如果你想返回对象的内存地址怎么办：重写toString,并返回this
		 */
		/*
		 * 4、String上的操作
		 * 详情见API
		 */
		
		/*
		 * 5、格式化输出(C语言的printf函数)
		 * 5.2、SyStem.out.format()
		 * 示例：SimpleFormat.java
		 * 5.3、Formatter类
		 * 示例：Turtle.java
		 * 5.4、格式化说明符
		 */
		
		/*
		 *6、正则表达式
		 *一种文本处理工具，可以构造复杂的文本模式
		 *以某种方式描述字符串（如果一个字符串包含了这些东西，那它就是我要找的）
		 *6.1：基础
		 * 了解正则表达式的语法
		 * 6.2：创建正则表达式
		 * 
		 */
		
	}

}
