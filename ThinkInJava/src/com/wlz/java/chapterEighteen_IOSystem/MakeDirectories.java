package com.wlz.java.chapterEighteen_IOSystem;

import java.io.File;

public class MakeDirectories {
private static void usage(){
	System.exit(1);
}
private static void fileData(File f){
	System.out.println("absolute path:"+f.getAbsolutePath()+"\ncan read£º"+f.canRead()+"\ncan write"+f.canWrite()+"\nget name"+f.getName()+"\nget parent"+f.getParent()+"\nget path:"+f.getPath()+"\nlength:"+f.length()+"\n lastmodified"+f.lastModified());
	if(f.isFile()){
		System.out.println("it is a file");
	}
	if(f.isDirectory()){
		System.out.println("it is a directory");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<1){
			usage();
		}
		File old = new File("d:\\temp2.txt"),rname=new File("d:\\tomcat");
		old.renameTo(rname);
		fileData(old);
		fileData(rname);
		return;
		
	}
	

}
