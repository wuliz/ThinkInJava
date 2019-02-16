package com.wlz.java.chapterSixteen_Array;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1、数组为什么特殊
		/*
		 * 三个方面：效率、类型、保存基本类型的能力
		 * 在泛型之前，容器内的类型都是当作Object类型编译，容器是没有类型的，也就是说，你是不能操作具体的类型的
		 * 这个时候，数组是可以持有某种类型的，编译时会检查 数据和ArrayList类是很像的，所以两者在转换上也是很方便的
		 */

		/*
		 * 2、数组是第一集对象 
		 * 三种Java中定义数组的方式 
		 * int[] arr1=new int[10]; 
		 * int[] arr2={1,2,3,6}; 
		 * int[] arr3=new int[]{1,2,3,4,5,6,7,22};
		 * 
		 */
		
		/*
		 * 3、返回一个数组
		 */
		
		/*
		 * 4、多维数组
		 * 多维数组的定义方式
		 * int[][] b={{1,2},{1,2,3}};(多维数组的每一项个数可以不一样)
		 * int[][] b=new int[2][3];
		 * int[][] b=new int[2][3](多维数组只要行数确定，列数可以不用确定)
		 * int[][] b=new int[][]{{1,2},{1,2,3}};
		 */
		
		/*
		 * 5、泛型与数组
		 * 一般情况下泛型类和泛型函数内的数组是不能初始化的（在泛型中不能用到确定类型）
		 * 但是你可以参数化数组本身的类型
		 */
		
		/*
		 * 6、创建测试数据
		 * 6.1：Arrays.fill():用同一个值对数组进行填充
		 * 6.2
		 */
		
		/*
		 * 7、Arrays实用功能
		 *Arrays.toString(obj[]);
		 *System.arraycopy(src, srcPos, dest, destPos, length);复制数组
		 *7.2数组的比较
		 *equals比较内容相等（数组）
		 *7.3数组元素的比较（实现Comparable接口，重写compareTo()方法）
		 *Arrays.sort(obj[]):只能应用于实现了Comparable的类的数组
		 *示例（ComType.java）
		 *Collections.reverseOrder():该方法会返回一个Comparator对象，它可以反转序列
		 *Arrays.sort(a,Collections.reverseOrder());
		 *也可以自己编写Comparator对象
		 *示例（ComparatorTest.java）
		 */
	}

}
