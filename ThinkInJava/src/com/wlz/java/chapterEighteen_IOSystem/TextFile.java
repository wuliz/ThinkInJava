package com.wlz.java.chapterEighteen_IOSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String>{
	public static String read(String fileName){
		StringBuilder sb =new StringBuilder();
		try{
			BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));
			try{
				String s;
				while((s=in.readLine())!=null){
					sb.append(s);
					sb.append("\n");
				}
			}finally{
				in.close();
			}
		}catch(Exception e){
			throw new RuntimeException();
		}
		return sb.toString();
	}
	public static void write(String filename,String text){
		try {
			PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile());
			try{
				out.print(text);
			}finally{
				out.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public TextFile(String filename,String splitter){
		super(Arrays.asList(read(filename).split(splitter)));
		if(get(0).equals(""))
			remove(0);
	}
	public TextFile(String filename){
		this(filename,"\n");
	}
	public void write(String filename){
		try{
			PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile());
			try{
				for(String item:this){
					out.println(item);
				}
			}finally{
				out.close();
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gile=read("d\\FileTest\\abc.txt");
		write("d\\FileTest\\abc.txt","changed");
		TextFile text = new TextFile("d\\FileTest\\abc.txt");
		text.write("d\\FileTest\\abc.txt");
		TreeSet<String> words = new TreeSet<String>(new TextFile("TextFile,java","\\W+"));
		System.out.println(words.headSet("a"));
	}

}
