package com.wlz.java.chapterEighteen_IOSystem;

import java.io.File;
import java.io.IOException;

public class FileAttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("d:\\FileTest");
		if(!f.exists()){
			f.mkdir();
		}
		File ff = new File("d:\\FileTest\\read.txt");
		if(!ff.exists()){
			try {
				ff.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//����ļ����������
		System.out.println("is file "+ff.isFile());
		System.out.println("name "+ff.getName());
		System.out.println("parent "+ff.getParent());
		System.out.println("path "+ff.getParent());
		System.out.println("Size "+ff.length()+"bytes");
		System.out.println("last modity time "+ff.lastModified());
		
		//����dĿ¼�µ�������Ϣ
		File d = new File("d:\\");
		File[] listFiles = d.listFiles();
		for(File fd:listFiles){
			System.out.println(fd.getPath());
		}
		//ɾ���ļ�
		ff.delete();
		//ɾ��Ŀ¼
		f.delete();
	}

}
