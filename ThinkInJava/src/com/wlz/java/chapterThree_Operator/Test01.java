package com.wlz.java.chapterThree_Operator;
import static net.mindview.util.Print.*;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello!");//hello!
		print("hello!");//hello!
		/*
		 * ʹ��java������
		 * 1���Ӻź�һԪ������+
		 * 2�����ź�һԪ�ķ���-
		 * 3���˺�*
		 * 4������/���������ȡ�����;�����߾��ȿ��룩
		 * 5��ֵ=
		 * 6����ģ%
		 * 
		 * ע�⣺�������в�����ֻ�ܲ�����������
		 * ����Ĳ������� =��==����=
		 * ����֮�� String ��֧�֡�+����+=�����ַ������Ӻ��ַ���ת����
		 */
		
		String a="123";
		String b="456";
		String c = a+b;
		//�ַ���ƴ��
		System.out.println(c);//123456
		//�ַ���ת��������������תΪString��ƴ��
		System.out.println(c+5);//1234565
		System.out.println(c+true);//123456true
		
		/*
		 * �����������ȼ����ȳ˳���Ӽ�
		 * 1����ֵ�����=������ֵ��ֵ����ֵ����ֵ����˵���������������ʽ��ֻҪ��������һ��ֵ���룩����ֵ������һ����ȷ���������ı�����������һ������ռ����ұߵ�ֵ�������ܸ�ֵ������
		 */
		//�������͵ĸ�ֵ(ֵ����)
		
		int x=4;
		int y=x;//���ǽ�x�����ݸ��Ƹ�y
		
		//�������͵ĸ�ֵ�����ǽ�һ���������ø��Ƹ�����һ�����ã���ô���������þ�ָ����ͬһ���ѵĶ���
		
		/*
		 * �����Լ������ ++ --
		 * �������ٸ�ֵ ���ȸ�ֵ������
		 */
		/*
		 * ��ϵ������ ����> С��< ���ڵ���>= С�ڵ���<= ����==
		 * 
		 */
		
		//����֮��ıʼ� ������==��ʹ�û������ͣ� ����������equals(),
		
		Integer i=new Integer(12);
		Integer j=new Integer(12);
		System.out.println(i==j);//false:�Ƚϵ�������
		System.out.println(i.equals(j));//true:�Ƚϵ�������
		
		/*
		 * �߼�������������·�룩&& || ��
		 */
		
		/*
		 * ֱ�ӳ�����
		 * ��׺��L(l)long��F(f)float��D(d)double
		 * ǰ׺��0x(ʮ������)��0���˽��ƣ�
		 * Integer��Long�ľ�̬������toBinaryString():���Խ�ֱ�ӳ���תΪ���Ʊ�ʾ
		 * 
		 */
		long t=0xaff9L;
		long e=0752L;
		
		System.out.println(Long.toBinaryString(t));//1010111111111001
		System.out.println(Long.toBinaryString(e));//111101010
		
		/*
		 * ��λ������ & | ~
		 */
		 int test1=0b101010;
		 int test2=0b010101;
		 System.out.println(test1);//42
		 System.out.println(test2);//21
		 System.out.println(test1&test2);//0
		 System.out.println(Long.toBinaryString(test1|test2));//111111
		 System.out.println(Long.toBinaryString(~test1));//1111111111111111111111111111111111111111111111111111111111010101
		 System.out.println((~test1));//-43
		 
		 /*
		  * ��λ��������<<  >>Ҳ�� ����������
		  */
		 
		 /*
		  * ��Ԫ�������� Boolean-exp?value0:value1
		  * if�������ʽΪ�� ִ��value0 ����ִ��value1
		  */
		 
		 /*
		  * ����ת������λ���λ�����㣬����Ǹ�λ
		  * ǿ������ת��
		  */
		 
		 float xx=1.11f;
		 int xxi=(int)xx;
		 System.out.println(xxi);//1:����н�β
		 
		 /*
		  * java���ֻ������ͣ����ͣ�byte short int long
		  * 				�����ͣ�float double
		  * 				�ַ��ͣ�char
		  * 				�����ͣ�boolean
		  */
		 
	}

}
