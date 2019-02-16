package com.wlz.java.chapterFourteen_TypeInfo;

public class GenericClassReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class intClass=int.class;
		Class<Integer> genericIntClass=int.class;
		genericIntClass=Integer.class;
		intClass=double.class;
		//如果指定了class引用是某一个类的class对象，就不能让它引用其他类的class对象，编译器会进行检查
		
		//genericIntClass=double.class;
		
		//利用通配符
		//使用通配符不会产生编译警告，效果和不加通配符是一样的，相当于你告诉编译器是我自己不指定类型的，不是我忘了
		Class<?> inclass=int.class;
		inclass=double.class;
		//规定为某一类型或其子类
		Class<? extends Number> iClass=int.class;
		iClass=double.class;
		iClass=Long.class;
	}

}
