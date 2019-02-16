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
		 * 到目前为止，程序都是按顺序执行得
		 * 并发：
		 * 再操作系统上，单CPU多任务，是通过CPU时间片轮转进行进程间得切换，一个可执行文件对应一个进程，系统中得进程一般来说不存在资源共享，彼此独立
		 * 而Java中得线程指的是，在一个进程中（程序）存在多个线程（多个并发任务）（时间片轮转），让线程看起来像并发执行得
		 * ，并发通常是提高运行在单处理器上程序得性能
		 * ）
		 * 
		 * 2、定义任务
		 * 线程可以驱动任务，这需要Runnable接口来提供，只需实现Runnable接口得run方法即可
		 *示例（LightOff.java）
		 *使用Executor管理线程
		 *示例（TestThreadPool.java）
		 *从任务中产生返回值（任务实现Callable接口）
		 *示例（CallableDemo.java)
		 *休眠sleep()
		 *SleepingTask.java
		 *线程优先级
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
