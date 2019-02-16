package com.wlz.java.chapterFive_Initialize;

public class Test01 {
	String a;
	Test01() {
		System.out.println(this.a);//null
		this.a = "1111";
	}
	
	void f(){
		int i;
		//i++;这里会出现红线提示，强制初始化
	}
	public static void main(String[] args){
		//初始化与实例化本来是两个概念，但在Java中利用构造函数实现了初始化和实例化
		Test01 t=new Test01();
		System.out.println(t.a);//1111
		
		//2方法重载
		//2.1：区分重载方法
		//方法名相同，参数列表不同（参数个数、参数类型、甚至参数位置）（构造器重载就是函数重载的一种实现）
		Test02.println(5, "hello");
		Test02.println("hello", 5);
		//2.2涉及基本类型的重载
		
		//3默认构造器
		/*
		 * 如果你的类没有写构造器的话，编译器会默认创建一个构造器
		 * 没有构造器就不能创建对象，如果你自己定义了构造器，则编译器不会为你生成构造器
		 * 见DefaultConstructor类
		 */
		
		/*
		 * 4、this关键词（见BananaPeel）（作为函数返回）
		 * 见PassingThis(作为参数传递)
		 * 
		 * 4.1在构造器中调用构造器器
		 * this的两种含义：当前对象、构造器调用（见Flower）
		 * 
		 * 4.2static的含义
		 * static（静态方法），static方法是属于类的，所以就是没有this的方法
		 * 在static方法内不能调用非静态方法和非静态成员。反过来是可以的
		 */
		
		/*
		 * 5、清理：终结处理和垃圾回收
		 * Java的垃圾回收机制只会清理new出来的对象，那那些不是new出来的对象如何清理？
		 * finalize的使用（见TerminationCondition类）
		 * 
		 * 5.4垃圾回收机制如何工作？
		 */
		
		/*
		 * 6、成员初始化
		 * 类成员都会进行初始化、但方法内的具备变量必须自己初始化，未初始化会报语义错误
		 * 
		 * 6.1指定初始化
		 * int i=15;
		 * 
		 * 7、构造器初始化
		 * int i;
		 * ClassName(){
		 * i=15
		 * }
		 * 注意：i先自动初始化为0，再变为7；
		 * 
		 * 7.1初始化顺序：先执行成员初始化，再执行构造函数
		 * 7.2静态数据初始化
		 * 注意：静态成员初始化必须在第一次使用到该类对象时、构造器实际上是静态方法
		 * 初始化静态成员>非静态成员>构造函数
		 * 当mian函数执行时，必须先加载当前类，通过也会初始化静态成员
		 *对象的创建过程(构造器是静态方法),
		 *静态方法被访问时：Java解析器要找到类路径，以定位到Dog.class
		 * 载入Dog.class,这时候，静态化所以动作会执行
		 * 当new Dog()对象时，在堆上分配空间
		 * 分配空间后，空间的数据清零，同时初始化成员变量
		 * 执行构造器
		 * 
		 * 7.3显示静态成员初始化（允许将多个静态初始化动作组成一个特殊的静态语句：静态块）
		 * 静态代码块：第一次载入该类使用时，就会执行静态代码块
		 * 总结：静态成员和静态代码块，都会在载入类名.class后初始化和运行
		 * 
		 * 7.4非静态成员初始化（与静态成员初始化比少了static，new 类名（）时调用）
		 * {
		 * 
		 * }
		 * 示例（NoStatic类）
		 */
		
		/*
		 * 8、数组初始化
		 * 数组：数组是存放同一类型（基本类型和引用类型）的集合
		 * 数组：Java中的数组不允许指定长度
		 */
		
		int[] arr={1,2,1,2,3};
		int ar[]={1,3,6,6,9};//C++的语法，Java也可以用这种方式
		
		//如果不确定数组里面的内容怎么办,可以使用new
		int[] arr1=new int[20];
		
		//如果要创建一个保存对象类型的数组
		Integer[] arr2=new Integer[20];
		
		//初始化对象数组，两种方式
		Integer[] arr3={new Integer(20),new Integer(30)};
		Integer[] arr4=new Integer[]{new Integer(20),new Integer(30)};
		
		for(Integer i:arr3){
			System.out.println(i);//20 30
		}
		T[] arr5=new T[20];//不会给成员初始化
		
		/*
		 * 8.1可变参数列表：参数的个数是不确定的，但Java会自动将实参填充到一个数据内
		 * 示例：（VarargType类）
		 */
		
		/*
		 * 9、枚举类型：enum关键字
		 * 1、创建一个enum类（见Spicness.java）
		 * 2、得到该类型的引用
		 * 枚举类型实际上是一个类，输出枚举对象时，编译器会调用toString()方法
		 * 除此之外，枚举类型还有ordinal()方法：输出enum常量的声明顺序
		 */
		Spicness s=Spicness.HOT;
		System.out.println(s);//HOT
		
		for(Spicness d:Spicness.values()){
			System.out.println(d);
		}
		
		for(Money m:Money.values()){
			System.out.print(m+" ");//ONE FIVE TEN TRENTY FIVITY HANDRUD 
		}
		}
	class T{
		String i;
		T(String x){
			i=x;
			System.out.println(i);
		}
	}
}
