package com.wlz.java.chapterFour_If;

import java.util.Random;

public class Test01 {
	/*
	 * 执行控制语句;涉及的关键词
	 * if...else
	 * while()
	 * do..while()
	 * for
	 * return 
	 * break;
	 * switch
	 * 
	 */
	public static void main(String[] arg){
		for(int i=0;i<=100;i++){
			System.out.print(i+" ");
		}
		int c=0;
		
		Random r=new Random();
		/*for(int i=0;i<25;i++){
			int b = r.nextInt(25);//返回[0,25)之间的随机数；
			if(c<b){
				System.out.println(b+"大于前面的数");
			}else if(c==b){
				System.out.println(b+"等于前面的数");
			}else{
				System.out.println(b+"小于前面的数");
			}
			c=b;
		}*/
		
		/*while(true){
			int b = r.nextInt(25);//返回[0,25)之间的随机数；
			if(c<b){
				System.out.println(b+"大于前面的数");
			}else if(c==b){
				System.out.println(b+"等于前面的数");
			}else{
				System.out.println(b+"小于前面的数");
			}
			c=b;
		}*/
		
		/*
		 * forEach的使用：用于数组和容器，便于遍历每一个元素
		 * 语法：for(类型 变量名：数组名或容器名)：表示将数组或容器的每一个元素取出，赋值给变量进行访问
		 */
		
		float f[]=new float[10];
		for(int i=0;i<10;i++){
			f[i]=r.nextFloat();
		}
		
		for(float x:f){
			System.out.println(x);//输出数组的每一项
		}
		
		//String类的toCharArray()方法:将字符串转为字符数组
		
		String s="Hello world";
		for(char b:s.toCharArray()){
			System.out.print(b+" ");//H e l l o   w o r l d 
		}
		
		/*
		 * return:
		 * 两种作用：指定方法返回什么值
		 * 			：退出当前方法
		 */
		
		/*
		 * break和continue
		 * break:跳出本层循环
		 * continue：跳出本次循环
		 */
		
		/*
		 * switch(整数表达式或字符){
		 * case 整数或字符：statement；
		 * default:statement;
		 * }
		 */
	}

}
