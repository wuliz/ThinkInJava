package com.wlz.java.chapterEighteen_IOSystem;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TxtFileRead {
	//读取文件中的文本
public static void ReadFile1() throws FileNotFoundException{
	//读取文本需要的三各类
	FileInputStream fis = new FileInputStream("d:\\FileTest\\abc.txt");//节点类
	InputStreamReader isw = new InputStreamReader(fis);//转换类
	BufferedReader br=new BufferedReader(isw);//装饰类
	String line;
	try {
		//按行读取
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
//利用try resource关闭资源
public static void ReadFile2() throws FileNotFoundException{
	String line;
	try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("d:\\FileTest\\abc.txt")))) {
		//按行读取
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
