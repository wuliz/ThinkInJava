package com.wlz.java.chapterEighteen_IOSystem;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class FormatMemoryInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ÄãºÃ hello";
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(a.getBytes()));
		try{
			while(true){
				System.out.println((char)dis.readByte());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
