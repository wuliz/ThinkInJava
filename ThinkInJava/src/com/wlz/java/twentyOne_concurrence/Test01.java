package com.wlz.java.twentyOne_concurrence;
class T{
	public void test() throws RuntimeException{
		
		int a=10/0;
	}
}
public class Test01 extends T {
	public final StringBuffer a=new StringBuffer("aaa");
	public void test(){
		int a=5/0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��ĿǰΪֹ�������ǰ�˳��ִ�е�
		 * ������
		 * �ٲ���ϵͳ�ϣ���CPU��������ͨ��CPUʱ��Ƭ��ת���н��̼���л���һ����ִ���ļ���Ӧһ�����̣�ϵͳ�еý���һ����˵��������Դ�����˴˶���
		 * ��Java�е��߳�ָ���ǣ���һ�������У����򣩴��ڶ���̣߳�����������񣩣�ʱ��Ƭ��ת�������߳̿������񲢷�ִ�е�
		 * ������ͨ������������ڵ��������ϳ��������
		 * ��
		 * 
		 * 2����������
		 * �߳̿���������������ҪRunnable�ӿ����ṩ��ֻ��ʵ��Runnable�ӿڵ�run��������
		 *ʾ����LightOff.java��
		 *ʹ��Executor�����߳�
		 *ʾ����TestThreadPool.java��
		 *�������в�������ֵ������ʵ��Callable�ӿڣ�
		 *ʾ����CallableDemo.java)
		 *����sleep()
		 *SleepingTask.java
		 *�߳����ȼ�
		 */
		Test01 ti = new Test01();
		ti.a.append("bbb");
		System.out.println(ti.a);
		String a=new String("bc");
		String b=new String("bc");
		String c="bc";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==c);
		//ti.test();
		String s1="a";
		String s2="a"+"b";
		String s3="ab";
		System.out.println(s2==s3);
		
		try {
			Class.forName("java");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		get();
	}
static void get(){
	throw new RuntimeException();
}
}
