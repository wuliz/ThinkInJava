package com.wlz.java.chapterTwelve_Exception;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//错误分为：编译期错误和运行时错误
		/*
		 * 编译器错误会在编写代码时就提示，运行时错误在运行时发现
		 */
		/*1、概念
		 * 异常：如果这里发现问题了，你应该处理，而不是置之不理，如果你现处的环境没有条件处理，可以提交到更高级的环境进行处理
		 */
		
		/*
		 * 2、基本异常
		 * 普通问题：当前环境能处理的问题
		 * 异常情形：当前环境不能处理，只能交给上一级环境，也就是抛出异常的情形
		 * 抛出异常的情形：
		 * 在 堆上创建异常对象，程序不能执行下去，从当前环境中弹出异常对象的引用（throw是错误对象的引用）
		 * 此时，异常处理机制接管程序，并寻找下一个恰当的地方（异常处理程序）继续执行程序，从错误状态中恢复，使程序换一种方式继续执行下去
		 * 2.1异常参数
		 * 标准异常类有两个构造器，一个是默认构造器，一个是接收参数的构造器，可以把错误信息给构造器
		 */
		
		/*
		 * 3、捕获异常：
		 * 监控区域：一段可能发送异常的代码，后面跟着处理异常的代码
		 * 
		 * 3.1、try块
		 * 如果在方法内抛出异常，这个方法将执行结束，如果不希望这个方法结束，就设置一个特殊的块来捕获异常
		 * 
		 * 3.2、异常处理程序
		 * 每个捕获的异常都该得到处理，这个处理的地方就叫异常处理程序，异常处理块紧跟try，叫做catch()
		 * 如果异常到了catch块，则视为异常得到了处理
		 */
		
		/*
		 * 4、创建自定义异常
		 * 除了Java种已有的异常类型，我们可以创建自己的异常类型
		 * 示例（InheritingException.java)
		 * 异常类继承了Throwable类，所以拥有PrintStackTrace()方法
		 * 示例（FullConStructors.java）
		 * 
		 * 4.1异常与记录日志
		 * java.util.logging工具将输出记录到日志中，这里仅做简单的介绍
		 * 示例（LoggingException.java）
		 */
		/*
		 * 5、异常说明
		 * 尽管有的方法不抛出任何异常，但他们都拥有一个默认的RunTimeException异常
		 */
		
		/*
		 * 6、捕获所以异常
		 * catch的时候用 Exception类的引用去接收抛过来的异常
		 * 6.1、栈轨迹:异常发生经过的路径或者说是经过的函数
		 * 栈轨迹记录了异常的经过路径，你可以得到栈轨迹的所有信息用StackTraceElement ste:e.getStackTrace()
		 * 示例（whoCalled.java）
		 * 6.2重新抛出异常
		 * catch(Exception e){
		 * throw e;或者 throw (Exception)e.fillInStackTrace();
		 * }
		 * 如果是第一种，异常对象没有发生变化，还是原来的信息
		 * 如果是第二种，就是将这里作为异常的发生点，没有之前的异常信息
		 * 示例（ReThrow.java）
		 * 
		 *6.3、异常链
		 */
		
		/*
		 * 7、Java标准异常
		 * Throwable用来表示任何可以抛出异常的类
		 * 它的直接子类有error(编译时异常和系统错误)和Exception（运行时异常）
		 * Java异常不全是在java.lang下定义的，比如	java.io.IOException异常类
		 * 特例：RuntimeException异常
		 * 运行异常很多，很多从该异常类继承的，这种异常或其子类抛出后不用捕获，异常信息也会输出到System.err
		 */
		
		/*
		 * 8、使用finally进行清理
		 * 无论异常是否抛出，finally子句都会执行
		 * 8.1、finally的作用
		 * 资源清理或关闭：打开的文件。网络连接、在屏幕上画的图形、外部世界的开关
		 * 
		 */
		
		/*
		 * 9、异常的限制
		 */
	
	}

}
