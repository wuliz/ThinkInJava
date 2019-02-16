package com.wlz.java.chapterSix_accessPremiss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * 访问权限控制
		 */
		/*
		 * 使用类的两种 方式：1import,2指定路径
		 */
		//导入
		FileInputStream in=new FileInputStream("ab.txt");
		//指定路径
		java.util.Date date=new java.util.Date();
		
		//什么情况下，一定要用第二种情况？（如果导入了两个类名相同的类）
		//这时编译器就不能确定
		
		/*
		 * 2Java访问权限修饰词
		 * 包访问权限，只要是同一个包内定义的对象则可以访问本身包访问权限的成员
		 * public权限：都可以访问，默认构造器是public访问权限
		 * private:私有访问权限：只要类里面的方法可以访问
		 * 案例：IceCream类
		 * protected:继承访问权限：也具有包访问权限
		 * 
		 * 总结：1、包访问权限修饰类：不能被其他包的类继承和引用
		 * 		       包访问权限修饰成员：不能被其他包内创建的对象直接访问
		 * 		2、public:修饰类：可以被所以其他类引用和继承
		 * 		   public ：修饰成员：可以被所有地方创建的该类的对象直接访问
		 * 		3、private:修饰类（不会这样做）
		 * 			private:修饰成员：只要成员函数可以访问
		 * 		4、protected:修饰成员：具有包访问权限和继承
		 */
		
		/*
		 * 3接口与实现
		 * 将具体实现隐藏和成员变量隐藏，只向外提供访问接口，这种模式叫做封装
		 * 1、保证内部的安全性，不能修改
		 * 2、将接口与实现分离
		 */
	}

}
