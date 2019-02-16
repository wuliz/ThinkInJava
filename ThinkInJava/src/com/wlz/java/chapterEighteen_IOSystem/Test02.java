package com.wlz.java.chapterEighteen_IOSystem;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1、File类：文件或文件目录
		/*
		 * 文件属性，文件目录，创建目录，移动目录
		 */
		
		/*
		 * 2、输入和输出
		 * 输入：InputStream、Reader 派生的类都有read（）方法：读取单个字节或字节数组
		 * 输出：OutputStream、Writer 派生的类都有write（）方法：用于写单个字节或数组
		 * 
		 * 2.1InputStream类型
		 * InputStream的作用是表示那些从不同数据源产生的类，这些数据包括：
		 * 字节数组
		 * String对象
		 * 文件
		 * 管道：一端输入一端输出
		 * 一个由其他种类的流产生的序列
		 * 其他数据源
		 * 每一种数据源对应一个InputStream的子类，另外FilterInputStream也是InputStream的基类
		 * ByteArrayInputStream:允许将内存缓存区当作InputStream使用，
		 * StringBufferInputStream:将String转换成InputStream(底层实现StringBuffer)
		 * FileInputStream:用于从文件读取信息
		 * PipedInputStream:实现管道化概念
		 * SequenceInputStream,将两个或多个InputStream转化成单一的Stream对象
		 * FilterInputStream:裝飾器，为其他InputStream提供有用功能
		 */
		/*
		 * 2.2OutputStream
		 * 该类决定输出去往的目标
		 * ByteArrayOutputStream:在内存创建缓存区，输出到该缓存区
		 * FileOutputStream:将信息存储到文件
		 * PipedOutputStream:管道化
		 * FilterOutputStream:抽象类，裝飾器
		 */
		/*
		 * 3、添加属性和有用的接口
		 * FilterOutputStream作为装饰器得接口，JavaIo不便的原因就是，我们需要创建许多类，才能得到我们希望的单个I/O对象
		 * FilterInputStream和FilterOutputStream用来提供裝飾器类接口以控制inputStream和OutputStream
		 * 
		 * 3.1通过FilterInputStream从InputStream读取数据
		 * DataInputStram和DataOutputStream可以读取基本类型和String对象，我们可以通过数据流将基本类型从一个地方迁移到另一个地方
		 */
		
		/*
		 * 4、Reader和writer
		 * InputStream和OutputStream面向字节
		 * Reader和writer面向字符
		 * InputStreamReader可以把InputStream（8位）转换成Reader（16位 ）
		 * OutputStreamWriter可以把OutputStream转换成Writer
		 */
		
		/*
		 * 6、IO流的典型使用方式
		 * 6.1缓冲输入文件
		 * 6.2从内存输入
		 * 示例（BufferedInputFile.java）
		 * 6.3格式化的内存输入
		 * 读取格式化数据：可以使用DataInputStream,面向字节的，我们可以用InputStream以字节的形式读取任何数据
		 * 6.4基本文件输出
		 * FileWriter可以向文件写入数据，但我们通常会使用BufferedWriter将其包装起来用以缓存输出
		 * 6.5存储和恢复数据
		 * 示例（StoringAndRecover.java）
		 * 6.7管道流
		 * PipedInputStream PipedOutputStream PipedReader PipedWriter
		 */
		
		/*
		 * 7文件读写的实用工作
		 * 
		 */
		
		/*
		 * 8标准IO
		 * 示例（标准输入流，Echo.java）
		 */
		/*
		 * 10、新I/O
		 * 
		 */
		
		/*
		 * 12、对象序列化
		 * ObjectInputStream
		 * ObjectOutputStream
		 * 将对象保存于程序生命周期之外
		 * 
		 */
		/*
		 * 13、XML
		 * 如果是对象序列化，则只能在Java中解析和存储，可以将数据转换成XML
		 * 通过XOM 来产生被转化为XML的Element对象的Person数据
		 */
		
	}

}
