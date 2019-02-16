package com.wlz.java.chapterEight_polymorphic;

public class Test01 {

	
	public static void main(String[] args){
		/*
		 * 多态：允许对象的作为本身的类型或基类型来处理
		 * 消除类型之间的耦合关系
		 * 
		 */
		/*
		 * 1、再论向上转型：将某个对象的引用视为是为对其基类的引用
		 * /wind向上转型可能会缩小接口，但不会比Instrument的全部接口更窄
		 * 如果不用向上转型会怎么样？如果Instrment有多个导出类，那就要编写多个方法来处理不同的导出类
		 * 示例：Music类.person类
		 * 但是向上转型后，编译器是如何知道它调用的具体类型，从而得到正确的结果呢？
		 * 
		 *1.1方法调用绑定
		 *前期绑定：再运行执行，也就是编译阶段，就确定调用的方法（static final（private属于final方法）都是前期绑定）
		 *后期绑定：再运行时根据类型找到相应的方法（对象中实际上存在类型信息）（java的所有方法是通过动态绑定的，这对实现多态提供了很大的便利）
		 *总结：后期绑定（多态）会根据实际上new出来的类型来找对应的方法
		 *示例：Shapes
		 *Shape s=new Circle()
		 *1.3可扩展性
		 *使用多态的话，后期在基类中添加其他方法或添加扩展类，都不会使程序有问题
		 *1.4：如果基类存在私有方法是不能被继承的，但可以自己覆盖该方法
		 *1.5：域与静态方法（注意：子类对象实际上包含了父类对象）
		 *域：虽然方法是动态绑定的，但如果你直接访问域（数据成员）则会在编译器进行解析，(但一般情况下，我们不会直接访问域)
		 *静态方法：如果方法是静态的，也不具备多态性
		 *示例（FieldAccess类）
		 */
		/*
		 * 3、构造器和多态
		 * 构造顺序（加载类（静态成员和静态代码块）>main入口函数>成员对象（继承又内向外扩展（加载类）））
		 * 3.2继承与清理示例（Forg类）
		 * 3.3构造器内部多态方法的行为
		 */
		
		/*
		 * 4、协变返回类型
		 * 示例：（CovariantReturn）
		 */
		/*
		 * 5用继承进行设计
		 * 状态模式（示例：Transmogrigy类）（当对象的状态改变时，同时改变它的行为）
		 * 5.1纯继承与扩展：导出类的方法都是基类有的，进行覆盖，is-a的关系（这样两者拥有完全相同的接口）
		 * 如果是扩展导出类，向上转型（会丢失具体的类型信息）后则不能访问扩展方法（这样就不适合进行向上转型）
		 * 5.2向下转型：向下转型是不安全的，因为我们无法确定一个几何型是不是六边形
		 * 示例（RTTI类）
		 */
		
		
		
	}
}
