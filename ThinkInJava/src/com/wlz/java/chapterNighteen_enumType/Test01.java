package com.wlz.java.chapterNighteen_enumType;

public class Test01 {
public static void main(String[] args){
	//1、基本enum特性
	//示例：EnumClass.java
	//静态导入enum类：不需要指定命名空间，就是说 Sherud.HAS可以之间用HAS
	
	//2、在enum中添加新方法
	//加常量描述并获取
	//重写toString方法
	
	/*
	 * 3、Switch中的enum
	 * 一般来说，Switch只能接受整数值，而枚举类型天生具备整数值得次序
	 * 一般来说，我们需要使用enum类型修饰enum实例，但在case中不用
	 * 示例（TrafficLight.java）
	 */
	/*
	 * 4、values()得神秘之处
	 * 所有得enum类继承于Enum类，但Enum并没有Values（）方法
	 * 由于values方法是由编译器插入到enumd定义得static方法，如果你将enum实例向上转型，那么values方法则不能访问，但我们可以通过class对象取得enum实例
	 * 示例（UpcastEnum.java）
	 */
	/*
	 * 实现，而非继承
	 * enum是继承了Enum类（抽象类）
	 * 所有enum不能再继承其他类
	 * 
	 */
	/*
	 * 随机选取
	 * 示例（Enums.java ）
	 */
	
	/*
	 * 7、使用接口组织枚举
	 */
}
}
