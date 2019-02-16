package com.wlz.java.chapterEighteen_IOSystem;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 检验指定路径下是否存在指定的目录或者文件.
		File f = new File("d:\\tomcat");
		System.out.println(f.exists());// true;
		// File对象是否是目录
		System.out.println(f.isDirectory());// false
		// File对象是否是文件
		System.out.println(f.isFile());// true;

		// 结论：File对象也可以表示不存在的文件。其实代表了一个抽象路径
		// 构建一个File类的实例并不会在机器上创建一个文件.不管文件是否存在都可以创建任意文件名的File实例,可以调用File实例的exists方法判断文件或目录是否存在

		// 1:创建File对象需要导包, import java.io.File

		// 2:File对象没有无参数构造.创建对象需要传参.

		// 根据API文档提示,传入一个文件的字符串路径. String path="c:/a.txt";

		// (a.txt 文件在c盘下已经存在)
		
		//File类中常用的方法：
		//创建该路径的新文件
		if(f.exists()){
			System.out.println("文件已存在！");
		}
		else{
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//获取文件内的目录信息：返回字符串
		System.out.println(Arrays.toString(f.list()));
		//获得文件夹得子文件对象数组
		File[] files = f.listFiles();
		for(File f1:files){
			System.out.println(f1.getName());
		}
		String[] l = f.list(new FilenameFilter(){
			 private String tag=".exe";
	            @Override
	            public boolean accept(File dir, String name) {
	                return name.endsWith(tag);
	            }
		});
		
		System.out.println(Arrays.toString(l));
	}

}
class FFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
