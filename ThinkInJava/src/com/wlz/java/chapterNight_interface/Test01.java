package com.wlz.java.chapterNight_interface;

import java.io.InputStream;
import java.util.Scanner;

public class Test01 {
public static void main(String[] args){
	/*
	 * 多态是实现了接口与实现的一种方式
	 * 接口和内部类提供了一种将接口与实现分离的更加结构化的方式
	 */
	/*
	 * 1、抽象类和抽象方法:是接口和类的一种中庸之道
	 * 在第八章中，Instrument类本身并没什么意义，只要为了给它的导出类提供一个通用接口
	 * 通用接口建立一种基本形式，依次表示所有导出类的公有部分，另一种说法是将Instrment称为抽象基类，简称抽象类
	 * 像Instrment的对象基本没有意义，它只是表示一个接口，其实可以不需要有实际内容
	 * Instrment的对象没有意义，Java提供了一种机制可以阻止创建这样的对象
	 * 抽象方法：仅有声明，没有函数体 public abstract void name();
	 * 如果一个类包含一个或多个抽象方法，该类必须限定为抽象类（否则编译器会报错）
	 * 如果一个类是抽象类，则不能创建对象（编译器会报错）
	 * 抽象类的作用是提供接口
	 * 如果一个类继承抽象类，必须实现抽象方法，否则这个类也是抽象类
	 * abstract关键词的使用
	 * 改写Instument(示例：Music4.java)
	 * 
	 */
	/*
	 * 2、接口：interface
	 * abstract关键词允许人们在类中创建一个或多个的抽象方法，提供接口部分
	 * interface是一个完全抽象的类，没有提供任何的实现
	 * 实现接口的类看起来都和接口一样（实现接口的类也可以向上转型）
	 * 接口中的方法是public的，默认public
	 * 接口只要常量和抽象方法
	 * 实现接口的子类必须实现抽象方法，子类也可以扩展其他方法
	 */
	
	/*
	 * 3、完全解耦
	 * 只要一个方法操作的是类而非接口，那么你就只能使用这个类及其子类。如果你想将这个方法应用到不再继承结构的就不行
	 * 接口可以放宽这一要求
	 */
	
	/*
	 * 4、Java中得多重继承
	 * 用接口实现多重继承
	 * 导出类只能继承一个基类，但可以实现多个接口
	 * 抽象类和接口的选择
	 * 
	 */
	
	/*
	 * 5、通过继承扩展接口
	 * 示例：（HorrorSHow类）
	 * 一个接口可以继承一个接口生成一个新接口
	 * 一个类可以实现多个接口并继承一个类
	 * 只要类是接口的实现就可以使用向上转型
	 * 组合时名字冲突:
	 * （如果一个接口和一个类中有相同的方法，则不能被同时继承和实现）
	 * （如果两个接口中有相同的方法，实现方法时会只实现其中一个）
	 */
	/*
	 * 6、适配接口
	 * Scanner 类的构造器public Scanner(InputStream source) 接收的是一个接口类型，构造函数返回的是一个InputStreamReader对象，InputStreamReader构造器接收一个InputStream对象
	 */
	
	/*
	 * 7\接口中的域
	 * 接口中的域都是自动static和final的
	 * 你可以定义一个常量组的类，除此以外，也可以使用enum
	 * 示例（Month）
	 * 7.1初始化接口中的域
	 * 接口的域一直存储在接口的静态存储域中，不会改变
	 * 示例（RandVals类和TestRandVals类）
	 */
	int x=Month.APRIL;
	//Month.FEBRUARY=4;//The final field Month.FEBRUARY cannot be assigned
	
	/*
	 * 8、嵌套接口（接口可以嵌套在其他类或接口中）
	 */
	
	/*
	 * 9、接口与工厂
	 * 接口是实现多重继承的主要途径
	 * 工厂模式（示例:Factories\Games）
	 * 
	 */
}
}
