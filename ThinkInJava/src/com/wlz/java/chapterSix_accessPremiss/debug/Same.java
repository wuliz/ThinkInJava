package com.wlz.java.chapterSix_accessPremiss.debug;
class PCson extends PC1{
	
}
public class Same {
public static void main(String[] args){
	PC1 pc1 = new PC1();
	System.out.println(pc1.x);//0,同包则可以访问
	System.out.print(pc1.z);//0,同包可以访问
	PCson p=new PCson();
	System.out.println(p.x+" "+p.y);
	
}
}
