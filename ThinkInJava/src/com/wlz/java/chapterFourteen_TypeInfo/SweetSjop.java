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
				//���е�class�����������Class��
				//Class.forName���������class��������
				//�����ಢ��ø����class����
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
