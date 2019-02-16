package com.wlz.java.chapterEighteen_IOSystem;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class BinFileRead {
public static void FileRead(){
	try(DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream("d:\\FileTest\\abc.txt")))){
		String a,b;
		int c,d;
		a=dis.readUTF();
		c=dis.readInt();
		d=dis.readInt();
		b=dis.readUTF();
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}catch(Exception e){
		e.printStackTrace();
	}
}
public static void read(String string) throws Exception{
	BufferedInputStream in = new BufferedInputStream(new FileInputStream(string));
	try{
		byte[] data=new byte[in.available()];
		in.read(data);
		System.out.println(Arrays.toString(data));
	}finally{
		in.close();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileRead();
		try {
			read("d:\\FileTest\\abc.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
