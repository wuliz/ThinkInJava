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
		// ����Ҫѹ�����ļ�
		File file = new File("d:\\FileTest\\abc.txt");
		// ����ѹ���ļ�����
		File zipfile = new File("d:\\FileTest\\single2.zip");

		// �����ļ���������
		FileInputStream fis = new FileInputStream(file);
		// ����ѹ��������
		ZipOutputStream zipout = null;
		zipout = new ZipOutputStream(new FileOutputStream(zipfile));
		zipout.putNextEntry(new ZipEntry(file.getName()));
		zipout.setComment("single file zip");
		// ѹ������
		int temp = 0;
		while ((temp = fis.read()) != -1) {// ��ȡ����
			zipout.write(temp);// ѹ�����
		}
		fis.close();// �ر�������
		zipout.close();// �ر������
		System.out.println("simple file zip done.");
		
		mutipleZip();
	}

	// ����ļ�ѹ��
	public static void mutipleZip() throws Exception {
		// ����Ҫѹ�����ļ���
		File f = new File("d:\\FileTest\\aaa");
		// ����ѹ���ļ�����
		File zipfile = new File("d:\\FileTest\\aaa.zip");
		// �����ļ���������
		FileInputStream fis = null;
		// ����ѹ��������
		ZipOutputStream zipout = null;
		zipout = new ZipOutputStream(new FileOutputStream(zipfile));
		zipout.setComment("mutiple file zip");
		File[] files = f.listFiles();
		for(int i=0;i<files.length;i++){
			fis=new FileInputStream(files[i]);
			zipout.putNextEntry(new ZipEntry(f.getName()+File.separator+files[i].getName()));
			System.out.println("����ѹ��"+files[i].getName());
			int temp = 0;
			while ((temp = fis.read()) != -1) {// ��ȡ����
				zipout.write(temp);// ѹ�����
			}
			fis.close();
		}
		zipout.close();System.out.println("mutiple zip done");
	}
	
}
