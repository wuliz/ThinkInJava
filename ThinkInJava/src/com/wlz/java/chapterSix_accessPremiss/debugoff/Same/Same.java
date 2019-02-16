package com.wlz.java.chapterSix_accessPremiss.debugoff.Same;

import com.wlz.java.chapterSix_accessPremiss.debug.PC1;

class PCson extends PC1{
	
}
public class Same {
	public static void main(String[] args) {
		//如果PC1类的构造器不是public访问权限，不能在其他包中创建该类对象
		//PC1 pc1 = new PC1();这里会包红线
		//System.out.print(pc1.x);//娶不到x,因为x是包访问权限
		
		PCson p=new PCson();
		//System.out.println(p.x+" "+p.y);//不能访问x,因为x是包访问权限，不同包继承时不能直接包访问权限的成员
	}
}
