package com.wlz.java.chapterEighteen_IOSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class SingleFileUzip {
	public static void main(String args[]) throws Exception {
		// ����ѹ�ļ�����Ҫ��zip�ļ�������������ȡ��Java��
		File zipfile = new File("d:\\FileTest\\aaa.zip");// ����ѹ���ļ�����
		// ����ѹ���ļ�������
		ZipInputStream zis = null;
		zis = new ZipInputStream(new FileInputStream(zipfile));// ����ѹ��������
		ZipEntry entry = zis.getNextEntry();// �õ�һ��ѹ��ʵ��
		System.out.println("ѹ��ʵ�����ƣ�" + entry.getName());
		// �½�Ŀ���ļ�����Ҫ��Ŀ���ļ�������������ݴ�Java����
		File outfile = new File("d:\\FileTest\\A.java");
		if (!outfile.exists()) {
			System.out.println("�½��ļ�" + outfile.getName());
			outfile.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(outfile);
		int temp = 0;
		// read���ļ���ȡһ�����߶���ֽڵ�Java�У������ļ�ĩβ����-1
		while ((temp = zis.read()) != -1) {
			fos.write(temp);
		}
		zis.close();
		fos.close();
	}
}
