package com.wlz.java.chapterEighteen_IOSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class SingleFileZip {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 定义要压缩的文件
		File file = new File("d:\\FileTest\\abc.txt");
		// 定义压缩文件名称
		File zipfile = new File("d:\\FileTest\\single2.zip");

		// 定义文件的输入流
		FileInputStream fis = new FileInputStream(file);
		// 声明压缩流对象
		ZipOutputStream zipout = null;
		zipout = new ZipOutputStream(new FileOutputStream(zipfile));
		zipout.putNextEntry(new ZipEntry(file.getName()));
		zipout.setComment("single file zip");
		// 压缩过程
		int temp = 0;
		while ((temp = fis.read()) != -1) {// 读取内容
			zipout.write(temp);// 压缩输出
		}
		fis.close();// 关闭输入流
		zipout.close();// 关闭输出流
		System.out.println("simple file zip done.");
		
		mutipleZip();
	}

	// 多个文件压缩
	public static void mutipleZip() throws Exception {
		// 定义要压缩的文件夹
		File f = new File("d:\\FileTest\\aaa");
		// 定义压缩文件名称
		File zipfile = new File("d:\\FileTest\\aaa.zip");
		// 定义文件的输入流
		FileInputStream fis = null;
		// 声明压缩流对象
		ZipOutputStream zipout = null;
		zipout = new ZipOutputStream(new FileOutputStream(zipfile));
		zipout.setComment("mutiple file zip");
		File[] files = f.listFiles();
		for(int i=0;i<files.length;i++){
			fis=new FileInputStream(files[i]);
			zipout.putNextEntry(new ZipEntry(f.getName()+File.separator+files[i].getName()));
			System.out.println("正在压缩"+files[i].getName());
			int temp = 0;
			while ((temp = fis.read()) != -1) {// 读取内容
				zipout.write(temp);// 压缩输出
			}
			fis.close();
		}
		zipout.close();System.out.println("mutiple zip done");
	}
	
}
