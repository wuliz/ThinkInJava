package com.wlz.java.chapterEighteen_IOSystem;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TxtFileWrite {
	public static void WriteFile1() throws FileNotFoundException {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		fos = new FileOutputStream("d:\\FileTest\\abc.txt");
		;
		osw = new OutputStreamWriter(fos);
		bw = new BufferedWriter(osw);

		try {
			bw.write("我么们是");
			bw.newLine();
			bw.write("ecundtak.^^");
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();// 关闭最后一个类，会将所有的底层流关闭
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// 使用Try resource,会自动关闭资源，写法 try(){}catch{}
	public static void WriteFile2() throws FileNotFoundException {

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("d:\\FileTest\\abc.txt")))) {
			
			bw.write("我么们是你的好朋友");
			bw.newLine();
			bw.write("you are right!");
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//WriteFile1();
			WriteFile2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
