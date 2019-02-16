package com.wlz.java.chapterEighteen_IOSystem;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TxtFileRead {
	//��ȡ�ļ��е��ı�
public static void ReadFile1() throws FileNotFoundException{
	//��ȡ�ı���Ҫ��������
	FileInputStream fis = new FileInputStream("d:\\FileTest\\abc.txt");//�ڵ���
	InputStreamReader isw = new InputStreamReader(fis);//ת����
	BufferedReader br=new BufferedReader(isw);//װ����
	String line;
	try {
		//���ж�ȡ
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//����try resource�ر���Դ
public static void ReadFile2() throws FileNotFoundException{
	String line;
	try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("d:\\FileTest\\abc.txt")))) {
		//���ж�ȡ
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ReadFile1();
			ReadFile2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
