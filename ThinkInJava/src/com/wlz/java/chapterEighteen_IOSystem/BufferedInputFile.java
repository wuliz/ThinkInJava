package com.wlz.java.chapterEighteen_IOSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class BufferedInputFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//
		//���ڶ�ȡ�ļ�����FileReader
		//���ڻ��棺BufferedReader(�ַ�)
		BufferedReader br=new BufferedReader(new FileReader("d:\\FileTest\\abc.txt"));
		String s;
		StringBuilder sb=new StringBuilder();
		while((s=br.readLine())!=null){
			sb.append(s+"\n");
		}
		br.close();
		System.out.println(sb.toString());
		memory();
	}
	public static void memory() throws IOException{
		String s="���helloyouareright  hei";
		StringReader sr = new StringReader(s);
		int c=0;
		while((c=sr.read())!=-1){
			System.out.print((char)c);
		}
	}

}
