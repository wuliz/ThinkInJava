package com.wlz.java.chapterEleven_holdObject;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 通常情况下，我们不能确定程序运行时会有多少个对象，甚至有时都不知道其确定的类型（这里我们用引用指向对象） 虽然有数组（数组长度是不可变的）
		 * java提供了一套容器库（List Set Quene Map 集合类）
		 * Set对于每一个值只保存一次，Map允许对象关联，最重要的，容器的长度是可变的，你不用担心容量
		 */

		/*
		 * 1泛型和类型安全的容器 容器内部保存的都是Object类型，向下转型不正确则会曝出异常
		 * 如果我们不知道容器中存放的是什么，则很容易出现这种问题 示例（AppleAndOrangeWithGenerics.java）
		 * 如果我们使用泛型的话，则可以避免这个问题 示例（AppleAndOrangeWithGenerics2.java）
		 */

		/*
		 * 2、基本概念 Java容器类库的用途是保存对象，分为两种概念
		 * Collection集合：一个独立元素的序列，List必须按顺序保存，Set不能有重复元素，Quene按照排队规则确定对象的产生顺序
		 * Map集合：一组成对的键值对对象，允许使用键查找值（从某种意义上讲，ArrayList是将数字和对象进行了关联）
		 * 
		 * 所有的Collection都可以使用foreach语法 List可以存放相同的元素，Set不能 示例（SimpleCollection）
		 */
		/*
		 * 3、添加一组元素 Arrays.asList()和Collections.addAll()的使用（这两个是工具类）
		 * 注意，尽管通过Arrays
		 * .asList返回的是一个list对象，但它的底层还是数组实现的，所以不能调用add()或delete这样的方法，
		 * 示例（AddingGroup.java） 示例（AsListInterference.java）
		 */
		/*
		 * 4、容器的打印 Collection: List: ArrayList LinkedList Set: HashSet TreeSet
		 * LinkedHashSet Map: HashMap TreeMap LinkedHashMap
		 * 示例（PrintingContainer.java）里面有介绍不同容器的差异
		 */

		/*
		 * 5、List ArrayList:随机访问元素，增删速度很慢（数组） LinkedList:增删速度很快，查找很慢（链表）
		 * 一些方法的使用： 请查看API 示例（ListFeatures.java）
		 */

		/*
		 * 6、迭代器 作用：取出容器中的元素 迭代器（一种设计模式）是一个对象：遍历并选择序列中的对象
		 * Inteator;(collection中有iterator()方法返回) next()返回下一个对象
		 * hasNext():检查是否还有下一个对象 remove():将最新返回的对象删除 与foreach遍历比较
		 * 第一：不需要知道容器的元素类型和容器的长度 第二：可以删除元素 示例（SimpleIterator.java）
		 * 迭代器统一了对容器的访问方式
		 * 示例（CrossContainerIterator.java)
		 * 
		 * 6.1:ListIterator(是Iterator的子接口，只能用于List类的访问，可以双向移动)
		 * 通过list的listIterator()获得 可以替换元素set()
		 * 示例（ListIterator.java）
		 */

		/*
		 * 7、LinkedList
		 * 实现List接口，插入删除更高效
		 * 添加了可以作用域栈、队列、双向队列的方法
		 * 示例（LinkedListFeature.java）
		 */
		/*
		 * 8、Stack栈
		 * 特点：先进后出
		 * LinkedList实现了栈的所有功能方法，可以将LinkedList作为栈用
		 * 但有时候，我们需要一个真正的栈(只包含栈应该有的方法)
		 * java中栈的实现
		 * 示例（Stack.java）
		 * push()
		 * pop()
		 */
		
		/*
		 * 9、Set(不保存重复的元素)
		 * 查找是Set中最重要的操作，通常使用于测试归属性
		 * Set具有跟Collection一样的接口
		 * 
		 * HashSet使用了散列表（查询速度块）
		 * LinkedHashSet(使用了散列表，还是用了链表保证插入顺序)
		 * 对结果排序，可以使用TreeSet
		 * 示例（SetOfInteger.java)
		 * set中很重要的方法：contains()，测试set的归属性
		 */
		
		/*
		 * 10、Map（一种对象映射另一种对象）
		 * 简单使用示例（Statistics.java）
		 * 你可以使用map保存更复杂的数据结构，比如一个人拥有多个宠物
		 * Map<Person,List<Pet>
		 */
		
		/*
		 * 11、Quene(队列，先进先出)
		 * 队列在并发编程中很重要
		 * LinkedList实现了Quene接口，因此LinkedList可以作为Quene的实现
		 * offer()
		 * remove();
		 * 示例（QueueDemo.java）
		 * 11.1、PriorityQueue优先队列，队列中以一种排序方式存储
		 * 11.2、Collection和Iterator
		 * Collection是描述所有序列容器的共性的跟接口
		 * 示例（InterfaceVsIterator.java)
		 */
		/*
		 * 13、Foreach与迭代器
		 * Foreach能够遍历集合，是因为集合实现了Interable接口，只要实现该接口，就能返回一个iterator的实例，在用foreach遍历集合时，集合会默认返回iterator对象，
		 */
		
		/*
		 * 总结：
		 * 1、数组可以存储基本类型和引用类型，长度固定，类型确定，可以使用forEach
		 * 2、Collection保存单一的元素，Java泛型可以指定容器中存储的元素类型，不再需要类型转换，不能存储基本类型，容量可变
		 * 3、Map保存相关联的键值对，
		 * 4、list是按存储顺序存储的，是数组的增强
		 */
		
	}

}
