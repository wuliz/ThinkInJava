package com.wlz.java.chapterEighteen_IOSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//获取输入流
		BufferedReader bd = new BufferedReader(new StringReader("hello world\nhow are you"));
		//获取输出流
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("d:\\FileTest\\abc.txt")));
		int lineCount=1;
		String s;
		while((s=bd.readLine())!=null){
			
			pw.println((lineCount++)+":"+s);
			pw.close();
		}
		
	}

}
