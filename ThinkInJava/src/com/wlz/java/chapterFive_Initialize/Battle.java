package com.wlz.java.chapterFive_Initialize;
class Insect{
	private int i=9;
	protected int j;
	Insect(){
		System.out.println("i="+i+",j="+j);
		j=39;
	}
	private static int x1=printInit("static Insect.x1.initialized");
	 static int printInit(String string) {
		// TODO Auto-generated method stub
		 System.out.println(string);
		return 47;
	}
}

public class Battle extends Insect {
	private int k=printInit("Bettle.k initizlized");
	public Battle(){
		System.out.println("k="+k);
		System.out.println("j="+j);
	}
	private static int x2=printInit("statc battel.x2 initialize");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("battel constructor");
		Battle b = new Battle();
		/*
		 * �������ɺ��ٴ�������
		 * ������������Battle��ʱ����������Insect���࣬�ȼ���Insect,�����ȴ�ӡ��һ��
		 * Ȼ�����Battle,���־�̬��Ա����ӡ�ڶ���
		 * Ȼ��ִ����ں�������ӡ������
		 * ��������ʱ��������չ���ȴ���������󣨳�Ա�ȳ�ʼ������ִ�й��캯����
		 * 
		 */
	}

}
