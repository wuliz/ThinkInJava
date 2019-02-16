package com.wlz.java.chapterFourteen_TypeInfo;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java是怎么在运行时识别对象和类的信息的？？
		//两种方式：RTTI（编译时已经确定类型）和反射机制（运行时）
		
		/*
		 * 1、为什么需要RTTI
		 * 我们定义了一个容器来保存shape对象，编译实际上会向上转型保存为Object对象，但是在运行时，又会返回为Shape对象
		 * Java中，所有类型转换都是在运行时进行正确性检查的
		 * 尽管Java将类型转换为shape对象，但是不知道Shape对象的确定类型，是Circle还是Triangle等
		 */
		
		/*
		 * 2、Class对象
		 * Class对象：用来创建类的常规对象
		 * 每编写一个新类并编译就会产生一个Class对象，保存在同名.class文件中，
		 * 
		 * 创建对象的过程：寻找这个类的Class对象是否被加载，如果尚未加载，默认的类加载器j就会根据类名查找 类名.class加载字节码
		 * 示例（SweetShop.java）
		 * 通过Class.forName(name)获得class的引用对象后，可以调用newInstance()创建一个该class的对象，但这个类必须有默认构造器
		 * 示例（ToyTest.java）
		 * 2.1、类字面常量
		 * 通过类字面常量获取class对象
		 * 类名.class
		 * 区别：不会对类对象初始化，也就是说，不会执行static代码块，不会给static静态成员赋初值，而Class.forName()则会初始化
		 * 示例（ClassInitialztion.java）
		 * 2.2.泛化的Class引用
		 * 示例（FilledList.java）
		 * 2.3、新的转型语法
		 * class引用.cast(对象)：将一个对象转型为class引用的类型
		 */
		
		/*
		 * 3、类型转换前先做检查:确保 向下转型的类型是正确的
		 * obj instanceof 对象
		 */
		
		/*
		 * 4、注册工厂
		 */
		
		/*
		 * 5、instanceof与Class的等价性
		 * instanceof表示你是这个类或是其子类吗
		 * getClass()得到的引用对象，是表示你是这个类吗
		 * 示例（FamilyVsExactType.java）
		 */
		
		/*
		 * 6、反射：运行时的类信息
		 * 运行时得到类的信息，RIIT是编译时得到类的信息（加载时就已经存在类对象了）
		 */
		
		/*
		 * 7、动态代理
		 * 静态代理（示例：SimpleProxyDemo.java）
		 * 动态代理（示例：SimpleDynamicProxy.java）
		 */
		
		/*
		 * 8、空对象
		 */
		
		/*
		 * 9、接口与类型信息
		 */
		/*
		 * 总结：通过反射，在运行时获取类对象信息，并可以调用类中的所有信息，包括private
		 */
	}

}
