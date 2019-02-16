package com.wlz.java.chapterEighteen_IOSystem;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StoringAndRecover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//基本数据类型（字符串）流类
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("d:\\FileTest\\abc.txt")));
		out.writeDouble(3.14159);
		//
		out.writeUTF("that was pi");
		out.writeDouble(1.41413);
		out.writeUTF("square root of 2");
		out.close();
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("d:\\FileTest\\abc.txt")));
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
	}

}
