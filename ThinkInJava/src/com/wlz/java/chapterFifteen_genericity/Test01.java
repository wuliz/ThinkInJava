package com.wlz.java.chapterFifteen_genericity;

public class Test01 {
	public static void main(String[] args) {
		// 泛型：参数化类型
		//
		
		/*
		 * 2、简单泛型
		 * 持有单个对象的类（示例：Automobile）
		 * 缺点：重用性不好
		 * Object:可以不指定类型，但如果转换成错误类型会报错
		 * 示例：Holder2.java
		 * 我们使用泛型，在编译时进行检查
		 * 示例：Holder3.java
		 * 2.1、一个元组类库
		 * 一般情况下，一个类中不确定的类型只有一个，我们使用泛型，如果有两个类型都是不确定的呢？？
		 * 使用元组
		 * 示例（TwoTuple.java）
		 * TupleTest.java
		 * 2.2、一个堆栈类
		 * 虽然Java中的stack是用LinkedList实现的，但我们可以不用LinkedList实现
		 * 示例（LinkedStack.java）
		 * 泛型的使用
		 * 示例（RandomList.java）:一个存放任意类型的容器
		 */
		/*
		 * 3、泛型接口
		 * 泛型也可以应用于接口
		 * 示例（CoffeeGenerator.java）
		 * 生成斐波那契数列（示例：Fabonacci.java）
		 * 示例（IterableFibonacii.java）:使用迭代器得到斐波那契数列
		 */
		
		/*
		 * 4、泛型方法：
		 * 泛型可以应用于类上，也可以应用于方法上
		 * 应用于类的泛型可以应用在数据成员和成员函数
		 * 应用于方法上的类可以不是泛型类
		 * 示例（GenericMethod.java）
		 * 杠杆利用类型推断
		 * 示例（New.java）
		 * 4.2、可变参数于泛型方法
		 * 泛型和可变参数可以共存
		 * 示例（GenreicVarargs.java）
		 */
		
		/*
		 * 5、匿名内部类
		 * 
		 */
		
		/*
		 * 6、构造复杂模型
		 * 构造一个零售店（包含走廊，商品，货架）
		 * 示例（Store.java）
		 * 
		 */
		/*
		 * 7、擦出的神秘之处
		 * 你不能判断List<Integer>().class和List<String>().class,它们是相同的类型
		 * 在泛型代码内部，无法获取任何有关泛型参数的信息
		 * Java的泛型是使用擦出实现的，上面两种类型是相同的类型，擦出成她们的原生类型，即List类型
		 * 在泛型中，不能调用具体类的方法，因为，Java编译器是不能识别的
		 * 如果需要用到具体类的方法，则不建议用泛型，用多态来实现可能更合适一些
		 * 泛型参数类型会进行编译器检查
		 */
		/*
		 * 8、擦除的补偿
		 * 任何需要知道确切类型的操作都无法进行
		 * 泛型中不能有数组（都是用集合来代替）
		 * 但可以定义数据的引用
		 */
		/*
		 * 9、边界
		 * 泛型是不能访问具体类型的方法的，不过我们可以给泛型加一个边界
		 * 
		 * 
		 */
		
		/*
		 * 泛型总结：
		 * 泛型可以应用于类
		 * class Type<T>{
		 * public T i;
		 * public T f(T obj){
		 * return obj;
		 * }
		 * }
		 * Type<interger> i=new Type<integer>();
		 * i.f(15);
		 * 
		 * 泛型只应用于方法
		 * class Type{
		 * public <T> T f(T x){
		 * return x;
		 * }
		 * }
		 * Type t=new Type();
		 * t.f(11);
		 */
		/*
		 * 后面的几节没看
		 */
	}
}
