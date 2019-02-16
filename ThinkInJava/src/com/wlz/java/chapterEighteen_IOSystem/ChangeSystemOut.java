package com.wlz.java.chapterEighteen_IOSystem;

import java.io.PrintWriter;

public class ChangeSystemOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter out = new PrintWriter(System.out,true);
		out.println("hello");
	}

}
