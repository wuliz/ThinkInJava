package com.wlz.java.chapterEighteen_IOSystem;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ָ��·�����Ƿ����ָ����Ŀ¼�����ļ�.
		File f = new File("d:\\tomcat");
		System.out.println(f.exists());// true;
		// File�����Ƿ���Ŀ¼
		System.out.println(f.isDirectory());// false
		// File�����Ƿ����ļ�
		System.out.println(f.isFile());// true;

		// ���ۣ�File����Ҳ���Ա�ʾ�����ڵ��ļ�����ʵ������һ������·��
		// ����һ��File���ʵ���������ڻ����ϴ���һ���ļ�.�����ļ��Ƿ���ڶ����Դ��������ļ�����Fileʵ��,���Ե���Fileʵ����exists�����ж��ļ���Ŀ¼�Ƿ����

		// 1:����File������Ҫ����, import java.io.File

		// 2:File����û���޲�������.����������Ҫ����.

		// ����API�ĵ���ʾ,����һ���ļ����ַ���·��. String path="c:/a.txt";

		// (a.txt �ļ���c�����Ѿ�����)
		
		//File���г��õķ�����
		//������·�������ļ�
		if(f.exists()){
			System.out.println("�ļ��Ѵ��ڣ�");
		}
		else{
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//��ȡ�ļ��ڵ�Ŀ¼��Ϣ�������ַ���
		System.out.println(Arrays.toString(f.list()));
		//����ļ��е����ļ���������
		File[] files = f.listFiles();
		for(File f1:files){
			System.out.println(f1.getName());
		}
		String[] l = f.list(new FilenameFilter(){
			 private String tag=".exe";
	            @Override
	            public boolean accept(File dir, String name) {
	                return name.endsWith(tag);
	            }
		});
		
		System.out.println(Arrays.toString(l));
	}

}
class FFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
