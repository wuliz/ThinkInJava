package com.wlz.java.chapterEighteen_IOSystem;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinFileWrite {
public static void WriteFile(){
	
	FileOutputStream fos=null;//����д�ֽ�
	DataOutputStream dos=null;//�����������͵��ֽ�ת��
	BufferedOutputStream bos=null;//����д�ֽ����ݵ�������
	
	try {
		fos=new FileOutputStream("d:\\FileTest\\abc.dat");
		bos=new BufferedOutputStream(fos);
		dos=new DataOutputStream(bos);
		dos.writeUTF("a");//��a��utf������ʽд��
		dos.writeInt(20);//�ĸ��ֽڵ����ֱ���
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
