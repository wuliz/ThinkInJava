package com.wlz.java.chapterFourteen_TypeInfo;

public class GenericClassReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class intClass=int.class;
		Class<Integer> genericIntClass=int.class;
		genericIntClass=Integer.class;
		intClass=double.class;
		//���ָ����class������ĳһ�����class���󣬾Ͳ������������������class���󣬱���������м��
		
		//genericIntClass=double.class;
		
		//����ͨ���
		//ʹ��ͨ�������������뾯�棬Ч���Ͳ���ͨ�����һ���ģ��൱������߱����������Լ���ָ�����͵ģ�����������
		Class<?> inclass=int.class;
		inclass=double.class;
		//�涨Ϊĳһ���ͻ�������
		Class<? extends Number> iClass=int.class;
		iClass=double.class;
		iClass=Long.class;
	}

}
