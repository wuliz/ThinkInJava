package com.wlz.java.chapterEighteen_IOSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class SingleFileUzip {
	public static void main(String args[]) throws Exception {
		// 待解压文件，需要从zip文件打开输入流，读取到Java中
		File zipfile = new File("d:\\FileTest\\aaa.zip");// 定义压缩文件名称
		// 定义压缩文件输入流
		ZipInputStream zis = null;
		zis = new ZipInputStream(new FileInputStream(zipfile));// 定义压缩输入流
		ZipEntry entry = zis.getNextEntry();// 得到一个压缩实体
		System.out.println("压缩实体名称：" + entry.getName());
		// 新建目标文件，需要从目标文件打开输出流，数据从Java流入
		File outfile = new File("d:\\FileTest\\A.java");
		if (!outfile.exists()) {
			System.out.println("新建文件" + outfile.getName());
			outfile.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(outfile);
		int temp = 0;
		// read从文件读取一个或者多个字节到Java中，读到文件末尾返回-1
		while ((temp = zis.read()) != -1) {
			fos.write(temp);
		}
		zis.close();
		fos.close();
	}
}
