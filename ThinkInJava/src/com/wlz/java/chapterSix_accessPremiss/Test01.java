package com.wlz.java.chapterSix_accessPremiss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * ����Ȩ�޿���
		 */
		/*
		 * ʹ��������� ��ʽ��1import,2ָ��·��
		 */
		//����
		FileInputStream in=new FileInputStream("ab.txt");
		//ָ��·��
		java.util.Date date=new java.util.Date();
		
		//ʲô����£�һ��Ҫ�õڶ�����������������������������ͬ���ࣩ
		//��ʱ�������Ͳ���ȷ��
		
		/*
		 * 2Java����Ȩ�����δ�
		 * ������Ȩ�ޣ�ֻҪ��ͬһ�����ڶ���Ķ�������Է��ʱ��������Ȩ�޵ĳ�Ա
		 * publicȨ�ޣ������Է��ʣ�Ĭ�Ϲ�������public����Ȩ��
		 * private:˽�з���Ȩ�ޣ�ֻҪ������ķ������Է���
		 * ������IceCream��
		 * protected:�̳з���Ȩ�ޣ�Ҳ���а�����Ȩ��
		 * 
		 * �ܽ᣺1��������Ȩ�������ࣺ���ܱ�����������̳к�����
		 * 		       ������Ȩ�����γ�Ա�����ܱ��������ڴ����Ķ���ֱ�ӷ���
		 * 		2��public:�����ࣺ���Ա��������������úͼ̳�
		 * 		   public �����γ�Ա�����Ա����еط������ĸ���Ķ���ֱ�ӷ���
		 * 		3��private:�����ࣨ������������
		 * 			private:���γ�Ա��ֻҪ��Ա�������Է���
		 * 		4��protected:���γ�Ա�����а�����Ȩ�޺ͼ̳�
		 */
		
		/*
		 * 3�ӿ���ʵ��
		 * ������ʵ�����غͳ�Ա�������أ�ֻ�����ṩ���ʽӿڣ�����ģʽ������װ
		 * 1����֤�ڲ��İ�ȫ�ԣ������޸�
		 * 2�����ӿ���ʵ�ַ���
		 */
	}

}
