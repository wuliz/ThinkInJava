package com.wlz.java.chapterFour_If;

import java.util.Random;

public class Test01 {
	/*
	 * ִ�п������;�漰�Ĺؼ���
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
			int b = r.nextInt(25);//����[0,25)֮����������
			if(c<b){
				System.out.println(b+"����ǰ�����");
			}else if(c==b){
				System.out.println(b+"����ǰ�����");
			}else{
				System.out.println(b+"С��ǰ�����");
			}
			c=b;
		}*/
		
		/*while(true){
			int b = r.nextInt(25);//����[0,25)֮����������
			if(c<b){
				System.out.println(b+"����ǰ�����");
			}else if(c==b){
				System.out.println(b+"����ǰ�����");
			}else{
				System.out.println(b+"С��ǰ�����");
			}
			c=b;
		}*/
		
		/*
		 * forEach��ʹ�ã�������������������ڱ���ÿһ��Ԫ��
		 * �﷨��for(���� ����������������������)����ʾ�������������ÿһ��Ԫ��ȡ������ֵ���������з���
		 */
		
		float f[]=new float[10];
		for(int i=0;i<10;i++){
			f[i]=r.nextFloat();
		}
		
		for(float x:f){
			System.out.println(x);//��������ÿһ��
		}
		
		//String���toCharArray()����:���ַ���תΪ�ַ�����
		
		String s="Hello world";
		for(char b:s.toCharArray()){
			System.out.print(b+" ");//H e l l o   w o r l d 
		}
		
		/*
		 * return:
		 * �������ã�ָ����������ʲôֵ
		 * 			���˳���ǰ����
		 */
		
		/*
		 * break��continue
		 * break:��������ѭ��
		 * continue����������ѭ��
		 */
		
		/*
		 * switch(�������ʽ���ַ�){
		 * case �������ַ���statement��
		 * default:statement;
		 * }
		 */
	}

}
