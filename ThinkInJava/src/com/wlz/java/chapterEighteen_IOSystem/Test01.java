package com.wlz.java.chapterEighteen_IOSystem;

public class Test01 {
	/*
	 * 1、File类 File类关心的是在磁盘上文件的存储. File类描述的是一个文件或文件夹。（文件夹也可以称为目录）
	 * 文件包含很多的信息:如文件名、创建修改时间、大小、可读可写属性等。 示例（FileTest.java）
	 * 文件遍历、属性访问、文件移动等基本操作
	 */

	/*
	 * 2、目录实用工具示例（Directory.java）
	 */

	/*
	 * 2、输入和输出 ：Java语言定义了许多类专门负责各种方式的输入或者输出，这些类都被放在java.io包中。其中，
	 * 所有输入流类都是抽象类InputStream(字节输入流)，或者抽象类Reader(字符输入流)的子类；
	 * 而所有输出流都是抽象类OutputStream(字节输出流)或者Writer(字符输出流)的子类。
	 * 【首先需要明白的是：流是干什么的？？？（为了永久性的保存数据） 根据数据流向的不同分为输入流和输出流； 根据处理数据类型的不同分为字符流和字节流；
	 * 】 【然后需要明白的是输入模式和输出模式是谁流向谁：
	 * InputStream(字节输入流)和Reader(字符输入流)通俗的理解都是读（read）的。
	 * OutputStream(字节输出流)和Writer(字符输出流)通俗的理解都是写(writer)的。 】
	 */
	
	/*
	 * javaIO包
	 * 文件系统和Java系统是两套系统
	 * Java读写文件，只能以数据流的形式进行读写
	 * Java.io包中
	 * 节点类：直接对文件进行读写
	 * 包装类：转化类（字节、字符、数据类型的转化类）、装饰类（装饰节点类Buffer：缓存区）
	 * 注意：（文件和Java是两套平行的系统，由于文件可能很大，Java不能一口气将文件都加载到内存，只能以流的形式分批读取）
	 * 
	 * Java中的数据有数据类型之分
	 * 文件中的数据只按字节保存
	 * 因此程序将变化保存到文件需要转化
	 * 节点类：直接操作文件夹
	 * InputStream、 OutputStream）（字节）
	 * .FileInputStream、FileOutputStram，
	 * Reader，Writer(字符)
	 * .FileReader、.FileWriter
	 * 字节的类以Stream结尾，字符类一般以er结尾
	 * 转换类：字符到字节之间的转化
	 * InputStreamReader:文件读取字节，转化为Java能理解的字符（4个字节转为int）
	 * OutputStreamWrite:Java将字符转化为字节输入到文件中
	 * 装饰类：装饰节点类
	 * DataInputStream，DataOutputStream :封装数据流（）
	 * BufferedInputStream,BufferOutputStream:缓存字节流（硬盘的读取文件速度很慢，在cpu中开辟缓存区，提高读取速度）
	 * 
	 * BufferedReader,BufferedWriter:缓存字符流
	 */
	
	/*
	 * 文本文件读写
	 * 1、文件类型：
	 * -一般文本文件（若干行字符构成的文件），如txt等
	 * -一般二进制文件，如数据文件dat
	 * -带特殊格式的文本文件，如xml
	 * -带特殊格式的二进制文件，如doc,ppt等
	 * 2、文件是数据的一个容器
	 * 3、文件可以存放大量的数据
	 * 4、文件很大，注定Java只能以流的形式依次处理
	 * 
	 */
	/*
	 * 从Java角度理解读写操作
	 * -输出：数据从Java到文件中，写操作
	 * -输入：数据从文件到Java中，读操作
	 * 
	 */
	/*
	 * 写文件
	 * -先创建文件，写入数据，关闭文件
	 * -FileOutputStream(往文件写字节),OutPutStreamWriter（字节和字符的转化）,BufferedWriter（写缓冲区类，加速写操作）
	 *-	BufferWriter
	 *==write
	 *==newLine
	 *-try resource语句，自动关闭资源（如果文件没有关闭，别人则不能写数据）
	 *-关闭最外层的数据流，将会把其上所有 的数据流关闭
	 *示例（TxtFileWrite.java）
	 */
	/*
	 * 读文件
	 * -先打开文件，逐行读入数据，关闭文件
	 * -FileInputStream.InputStreamReader,BufferedReader
	 * -BufferedReader
	 * .readline
	 * -try resource语句，自动关闭资源
	 * -关闭最外层的数据流，将会把其上所有的数据流关闭
	 * 查看例子TxtFileRead.java
	 */
	
	/*
	 * 二进制文件读写
	 * 狭义上讲：二进制文件（采用字节编码，非字符编码的文件）
	 * 广义上讲：一切文件都是二进制文件
	 * 用记事本无法打开/阅读
	 * 二进制文件的读写
	 * -输出数据到文件中
	 * -从文件中读取数据
	 */
	/*
	 * 写文件
	 * -创建文件、写入数据、关闭文件
	 * -FileOutputStream、BufferedOutputStream,DataOutputStream
	 * -DataOutputStrream
	 * .flush
	 * .write/writeBoolean/writeByte/writeChars/writeDouble/writeInt/WriteUTF
	 * try-resource语句，自动关闭资源
	 * 示例（BinFileWrite.java）
	 */
	/*
	 * 读文件
	 * -先打开文件，读入数据，关闭文件
	 * -FileInputStream,BufferredInputStream,DataInputStream 
	 * -DataInputStream 
	 * .read/readBoolean/readChar/readDouble/readFloat/readInt/readUTF
	 * try resource的使用
	 * 示例（BinFileRead.java）
	 */
	/*
	 * 理解节点类，转换类和装饰类
	 *读写的顺序要一致
	 *尽量使用try resource关闭资源文件
	 */
	
	/*
	 * zip文件的读写
	 * 压缩包：zip,rar,gz
	 * java zip包支持Zip和Gzip包的压缩和解压
	 * zip文件操作类：Java。util.zip包中
	 * -java.io.inputStream，java.io.outputStream的子类
	 * -ZipInputStream,ZipOutputStream压缩文件输入/输出流
	 * -ZipEntry压缩项
	 * 
	 * 
	 * 压缩
	 * 单个/多个压缩
	 * -打开输出zip文件
	 * -添加一个zipEntry（压缩包内的一个文件）
	 * -打开一个输入文件，读数据，向ZIpEntry写数据，关闭输入文件
	 * -重复以上两个步骤，写入多个文件到zip文件中
	 * 关闭zip文件
	 * 查看SimpleFileZip.java和MultiplyFileZip.java
	 */
	
	/*
	 * 解压
	 * 单个/多个解压
	 * 打开输入的zip文件
	 * 获取下一个zipEntry
	 * 新建一个目标文件，从ZipEntry读取数据，向目标文件写入数据
	 * 关闭目标文件
	 * 重复以上两个步骤，从zip包中读取数据到多个目标文件
	 * 关闭zip文件
	 * 查看SingleFileUnzip.java和MultipleFileUnzip.java
	 */
	static int $=11;
	public static void main(String args[]){
		System.out.println($);
	}
	
}
