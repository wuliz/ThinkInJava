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
			bw.write("��ô����");
			bw.newLine();
			bw.write("ecundtak.^^");
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();// �ر����һ���࣬�Ὣ���еĵײ����ر�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// ʹ��Try resource,���Զ��ر���Դ��д�� try(){}catch{}
	public static void WriteFile2() throws FileNotFoundException {

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("d:\\FileTest\\abc.txt")))) {
			
			bw.write("��ô������ĺ�����");
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
