package com.wlz.java.chapterEighteen_IOSystem;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinFileWrite {
public static void WriteFile(){
	
	FileOutputStream fos=null;//负责写字节
	DataOutputStream dos=null;//负责数据类型到字节转换
	BufferedOutputStream bos=null;//负责写字节数据到缓冲区
	
	try {
		fos=new FileOutputStream("d:\\FileTest\\abc.dat");
		bos=new BufferedOutputStream(fos);
		dos=new DataOutputStream(bos);
		dos.writeUTF("a");//將a以utf编码形式写入
		dos.writeInt(20);//四个字节的数字保存
		dos.writeInt(180);
		dos.writeUTF("b");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			dos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteFile();
	}

}
