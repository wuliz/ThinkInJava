package com.wlz.java.chapterThree_Operator;
import static net.mindview.util.Print.*;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello!");//hello!
		print("hello!");//hello!
		/*
		 * 使用java操作符
		 * 1、加号和一元的正号+
		 * 2、减号和一元的符号-
		 * 3、乘号*
		 * 4、除号/（整数相除取整，低精度向高精度看齐）
		 * 5赋值=
		 * 6、求模%
		 * 
		 * 注意：基本所有操作符只能操作基本类型
		 * 例外的操作符是 =、==、！=
		 * 除此之外 String 类支持“+”“+=”（字符串连接和字符串转换）
		 */
		
		String a="123";
		String b="456";
		String c = a+b;
		//字符串拼接
		System.out.println(c);//123456
		//字符串转换，将其他类型转为String再拼接
		System.out.println(c+5);//1234565
		System.out.println(c+true);//123456true
		
		/*
		 * 操作符的优先级：先乘除后加减
		 * 1、赋值运算符=：将右值赋值给左值，右值可以说常数、变量、表达式（只要它能生成一个值就想），左值必须是一个明确的已命名的变量（必须有一个物理空间存放右边的值），不能赋值给常量
		 */
		//基本类型的赋值(值传递)
		
		int x=4;
		int y=x;//就是将x的内容复制给y
		
		//引用类型的赋值：就是将一个对象引用复制给了另一个引用，那么这两个引用就指向了同一个堆的对象
		
		/*
		 * 自增自减运算符 ++ --
		 * 先运算再赋值 和先赋值再运算
		 */
		/*
		 * 关系操作符 大于> 小于< 大于等于>= 小于等于<= 等于==
		 * 
		 */
		
		//对象之间的笔记 不能用==（使用基本类型） 引用类型用equals(),
		
		Integer i=new Integer(12);
		Integer j=new Integer(12);
		System.out.println(i==j);//false:比较的是引用
		System.out.println(i.equals(j));//true:比较的是内容
		
		/*
		 * 逻辑操作符：（短路与）&& || ！
		 */
		
		/*
		 * 直接常量：
		 * 后缀：L(l)long、F(f)float、D(d)double
		 * 前缀：0x(十六进制)，0（八进制）
		 * Integer和Long的静态方法：toBinaryString():可以将直接常量转为进制表示
		 * 
		 */
		long t=0xaff9L;
		long e=0752L;
		
		System.out.println(Long.toBinaryString(t));//1010111111111001
		System.out.println(Long.toBinaryString(e));//111101010
		
		/*
		 * 按位操作符 & | ~
		 */
		 int test1=0b101010;
		 int test2=0b010101;
		 System.out.println(test1);//42
		 System.out.println(test2);//21
		 System.out.println(test1&test2);//0
		 System.out.println(Long.toBinaryString(test1|test2));//111111
		 System.out.println(Long.toBinaryString(~test1));//1111111111111111111111111111111111111111111111111111111111010101
		 System.out.println((~test1));//-43
		 
		 /*
		  * 移位操作符：<<  >>也是 操作二进制
		  */
		 
		 /*
		  * 三元操作符： Boolean-exp?value0:value1
		  * if布尔表达式为真 执行value0 否则执行value1
		  */
		 
		 /*
		  * 类型转换：低位与高位做运算，结果是高位
		  * 强制类型转换
		  */
		 
		 float xx=1.11f;
		 int xxi=(int)xx;
		 System.out.println(xxi);//1:会进行截尾
		 
		 /*
		  * java八种基本类型：整型：byte short int long
		  * 				浮点型：float double
		  * 				字符型：char
		  * 				布尔型：boolean
		  */
		 
	}

}
