package com.wlz.java.chapterTwo_O;

public class O {
		
		 public static void main(String[] args){
			 /*
				 *一切都是对象
				 */
			
				//尽管Java是基于c++的，但Java是一种更纯粹的面向对象程序设计语言
				
				//杂合型语言支持多种编码风格：如c++,因为c++是向后兼容C的，又或者JavaScript，支持面向对象也支持面向过程的编码方式
				
				//1、用引用操作对象
				/*
				 * 每一种编程语言都有自己操作内存中元素的方式，有时候，你需要注意处理的数据是什么类型，你是直接操作元素，还是通过某种特定的语法间接操作内存中的对象（C和C++用到了指针）
				 * 标识符实际上是对象的一个引用
				 * 你可以通过这个引用操作对象，但引用和对象是不一样的，引用和对象之间存在关联，所以你可以通过引用操作对象，但引用可以独立存在，对象也可以在内存单独存在
				 * 
				 */
			
				//2、必须由你创建所有对象
				String a=new String("helloworld");
				/*
				 * 创建一个引用a,创建了一个String类型的对象，然后将对象和引用之间建立联系
				 */
				/*2.1存储到什么地方
				 * 程序运行时，内存中的数据是怎么分配的呢？
				 * 寄存器：最快的存储区（处理器内部），你不能直接访问，由内部控制分配
				 * 堆栈：（仅次于寄存器，位于RAM中），存储对象引用（引用存放的实际是对象的地址），和基本类型（存放变量的值）
				 * 堆：（通用内存此RAM中），存储对象，分配空间和清理占用更多时间
				 * 常量存储：直接存放程序代码内部
				 * 非RAM存储：数据存活于程序之外，程序没有运行也存在，（流对象和持久化对象），存放于其他媒介上，需要时恢复常规的RAM的对象
				 * 
				 * 2.2基本类型
				 * 基本类型是特别小的，简单的变量，创建基本类型的变量不是引用，直接存放“值”，并放于堆栈中
				 * 八种基本类型：boolean,byte,char,short,int,float,double,long(每一种基本类型都有对应的包装类型)
				 */
				//可以创建基本类型，也可创建包装类型
				 char c='x';
				 //相应的包装类型
				 Character cd=new Character(c);
				 Character cdx=new Character('c');//16位=2字节，一个字节可以存放一个英文，一个中文占两个汉字
				 System.out.println(cdx);
				 //JavaSe5 自动包装功能，可以将基本类型转为包装类
				 Character c_t='b';
				 //也可以反转
				 char c_d=c_t;
				 
				 //高精度类型
				 /*
				  * java提供了两个用于高精度计算的类：BigInteger和BigDecimal,大体属于包装类，没有对应的基本类型
				  * BigInteger(用于任意精度的整数)、BigDecimal(用于任意精度的小数，货币计算)
				  */
				 //2.3java中的数组
				 /*
				  * c和c++的数组：即内存块，访问内存块之外的的数组，会产生意料不到的结果
				  * java中的数组：数据确保初始化，不能访问范围之外的内存（检查数组下标为代价）
				  * 创建数组对象时，实际上创建了一个数组的引用，数组中存放的对象都会被初始化（null）,不能使用一个引用null的对象，运行时会报错
				  *数组还可以用来存放基本类型
				  */
				 
				 //3、永远不需要销毁对象
				 /*
				  * 3.1作用域（用{}表示）
				  */
				 {
					 int i_a=5;
					 //不能访问b
					 {
						 int i_b=6;
						 //可以访问i_a和i_b
					 }
				 }
				 /*
				  * 3.2对象的作用域
				  */
				 {
					 String s_a=new String("helloworld");
				 }
				 //引用s_a在作用域终点就消失了，但s指向的对象仍然占内存空间
				 //那如何回收还在堆中的String对象呢
				 //java有一个垃圾回收器，用来监视new的对象，一旦对象不再被引用，会释放该对象所在的内存空间
				 
				 /*
				  * 4创建新的数据类型：类
				  * 一切都是对象（对象拥有状态(字段)和行为（方法）），谁来规定对象的状态和行为（class）
				  */
				 /*
				  * 4.1字段和方法
				  * 一旦你定义了一个类，就可以在该类中添加字段（数据成员）和方法（成员寒素），字段可以是基本类型和引用类型，
				  */
				 O o=new O();
				 DataOnly d=o.new DataOnly();
				 System.out.println(d);//com.wlz.java.chapterTwo_O.O$DataOnly@2542880d(返回的是对象的地址)
				 //可以对成员变量进行赋值（成员变量的访问权限都是包访问权限）
				/* d.d=2;
				 d.b=false;
				 System.out.println(d.d);//2.0
				 */		
				 System.out.println("i:"+d.i+" x:"+d.x+" d："+d.d+" b:"+d.b+" bb:"+d.bb+" s:"+d.s+" l:"+d.l);
				 //i:0 x: d：0.0 b:false bb:0 s:0 l:0
				 //基本成员默认值
				 /*
				  * 若类的数据成员是基本类型，即使没有初始化，Java也会确保它获得默认值
				  * boolean:false
				  * char:'\u0000'(null)
				  * byte:(byte 0)
				  * short:(short 0)
				  * int:0
				  * long:0L
				  * float:0.0f
				  * double:0.0d
				  */
				 
				 //注意：如果是某个方法内没有初始化变量，则不会有初始值
				 
				 
				 /*
				  * 5方法、参数和返回值
				  * java中的方法决定对象可以接收什么样的消息。
				  * 方法的组成:名称、参数、返回值
				  */
				 //方法的基本格式：见137行
				 //java中的方法只能作为类的一部分创建，只能通过对象调用
				 
				 /*
				  * 5.1参数列表
				  * 参数列表表示对象可以接收什么样的消息：采用的也是对象形式或者基本数据类型
				  * 
				  * 返回值：代表程序结束、其次返回一个值。
				  */
				 
				 /*
				  * 6构建第一个java程序
				  * 如何防止类名冲突
				  * 唯一的域名反转/包名/类名
				  */
				 /*
				  * 6.2运用其他构件（类）
				  * 如果在同一个源文件内，则直接使用(同一个包内)
				  * 如果在不同文件内，则使用import来导入
				  * 6.3 static关键字
				  * static修饰的变量唯一的，
				  *static修饰的方法称为类方法，修饰的数据称为类数据。代表数据和方法不依赖于特定的对象
				  */
				 StaticTest t=new StaticTest();
				 StaticTest t2=new StaticTest();
				 System.out.println(t.i);//17
				 System.out.println(t2.i);//17
				 //可以直接用类型来操作类成员
				 StaticTest.i++;
				 System.out.println(t.i);//18
				 System.out.println(t2.i);//18
				 //由此可见，i所在的内存空间是同一块
				//如果static作用于方法差别就没那么大，就是可以在不创建对象的前提下调用
				 
				 /*
				  * 7你的第一个java程序(见FirstJava类)
				  * 编译和运行：
				  * 要运行java程序，首先要有Java开发环境（这里使用的的sun提供的jdk Java开发人员工具包）
				  * 安装jdk后，设定路径，能找到javac和java两个文件
				  * javac是用于编译Java文件的
				  * java是用于运行Java字节码文件的
				  */
				 
				 /*
				  *8注释和嵌入式文档
				  *注释的两种方式：//或
				  */
				 
				 /*
				  * 8.1注释文档
				  */
				 
				 /*
				  * 9编码风格
				  * 驼峰命名法
				  * 类名首字母大写
				  */
		}
		
		 class DataOnly{
			 int i;
			 char x;
			 double d;
			 boolean b;
			 byte bb;
			 short s;
			 long l;
			 float f;
			 
		 }
		 //x对象所占的字节数：String类的每个字符尺寸都是16或2个字节
		
		/**
		 * @param x
		 * @return
		 */
		int funname(String x){
			 return x.length()*2;
		 }
}
