package com.wlz.java.chapterFourteen_TypeInfo;
class Candy{
	static{
		System.out.println("Candy loading");
	}
}
class Gum{
	static{
		System.out.println("Gum loading");
	}
}
class Cookie{
	static{
		System.out.println("cookie loading");
	}
}


public class SweetSjop {
	static{
		System.out.println("Sweetshop loading");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("inside main");
		new Candy();
		System.out.println("after create candy");
			try {
				//所有的class对象都属于这个Class类
				//Class.forName获得这个类的class对象引用
				//加载类并获得该类的class引用
				Class.forName("com.wlz.java.chapterFourteen_TypeInfo.Gum");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("could't find gum");
			}
		
			
		System.out.println("Class.forName(Gum)");
		new Cookie();
		new Gum();
		System.out.println("create cookie");
		new Cookie();
	}

}
