package com.wlz.java.chapterTwo_O;

import java.util.Date;

public class FirstJava {
	// 所有的Java标准库可以在jdk的src下找到
	// 只有lang包下的类不需要导入可以直接使用（默认导入每一个类中）
	// public指可由外部调用的方法，main方法的参数用来存储命令行参数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System类是是属于lang包下的，System有一个静态的PrintStream类型的out对象成员，而PrintStream类中，有println()方法
		System.out.println("hello its");// hello its
		// 这里用到了Date类型，Date类不存在lang包中，所以需要导入，这里创建了一个Date类型的对象
		System.out.println(new Date());// Mon Jan 21 16:51:51 CST 2019
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
		/*
		 * -- listing properties -- java.runtime.name=Java(TM) SE Runtime
		 * Environment
		 * sun.boot.library.path=D:\MyEcplise\binary\com.sun.java.jdk7...
		 * java.vm.version=24.45-b08 java.vm.vendor=Oracle Corporation
		 * java.vendor.url=http://java.oracle.com/ path.separator=;
		 * java.vm.name=Java HotSpot(TM) 64-Bit Server VM
		 * file.encoding.pkg=sun.io user.script= user.country=CN
		 * sun.java.launcher=SUN_STANDARD sun.os.patch.level=
		 * java.vm.specification.name=Java Virtual Machine Specification
		 * user.dir=D:\myeclipse project\ThinkInJava
		 * java.runtime.version=1.7.0_45-b18
		 * java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
		 * java.endorsed.dirs=D:\MyEcplise\binary\com.sun.java.jdk7...
		 * os.arch=amd64 java.io.tmpdir=C:\Users\ADMINI~1\AppData\Local\Temp\
		 * line.separator=
		 * 
		 * java.vm.specification.vendor=Oracle Corporation user.variant=
		 * os.name=Windows 8 sun.jnu.encoding=GBK
		 * java.library.path=D:\MyEcplise\binary\com.sun.java.jdk7...
		 * java.specification.name=Java Platform API Specification
		 * java.class.version=51.0 sun.management.compiler=HotSpot 64-Bit Tiered
		 * Compilers os.version=6.2 user.home=C:\Users\Administrator
		 * user.timezone=Asia/Shanghai
		 * java.awt.printerjob=sun.awt.windows.WPrinterJob file.encoding=GBK
		 * java.specification.version=1.7 user.name=Administrator
		 * java.class.path=D:\myeclipse project\ThinkInJava\bin;...
		 * java.vm.specification.version=1.7 sun.arch.data.model=64
		 * java.home=D:\MyEcplise\binary\com.sun.java.jdk7...
		 * sun.java.command=com.wlz.java.chapterTwo_O.FirstJava
		 * java.specification.vendor=Oracle Corporation user.language=zh
		 * awt.toolkit=sun.awt.windows.WToolkit java.vm.info=mixed mode
		 * java.version=1.7.0_45
		 * java.ext.dirs=D:\MyEcplise\binary\com.sun.java.jdk7...
		 * sun.boot.class.path=D:\MyEcplise\binary\com.sun.java.jdk7...
		 * java.vendor=Oracle Corporation file.separator=\
		 * java.vendor.url.bug=http://bugreport.sun.com/bugreport/
		 * sun.cpu.endian=little sun.io.unicode.encoding=UnicodeLittle
		 * sun.desktop=windows sun.cpu.isalist=amd64 Administrator
		 * D:\MyEcplise\binary
		 * \com.sun.java.jdk7.win32.x86_64_1.7.0.u45\bin;C:\WINDOWS
		 * \Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files
		 * (x86)\Common
		 * Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS
		 * ;C:\WINDOWS\System32
		 * \Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;
		 * D:\java\jdk1.7.0_80\
		 * bin;D:\java\jdk1.7.0_80\jre\bin;D:\mysql-8.0.11-winx64
		 * \mysql-8.0.11-winx64
		 * \bin;D:\MySQL\bin;C:\WINDOWS\System32\OpenSSH\;D:\
		 * svnClient\bin;D:\svnServer
		 * \bin;E:\gradle-4.10-bin\gradle-4.10\bin;%CATALINA_HOME
		 * %\bin;%CATALINA_HOME
		 * %\lib;D:\apache-maven-3.5.4-bin\apache-maven-3.5.4
		 * \bin;C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps;;.
		 */

	}

}
