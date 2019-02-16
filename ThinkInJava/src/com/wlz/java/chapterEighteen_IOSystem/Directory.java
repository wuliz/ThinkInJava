package com.wlz.java.chapterEighteen_IOSystem;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class Directory {
	public static File[] local(File file, final String regex) {
		return file.listFiles(new FilenameFilter() {
			Pattern filePattern = Pattern.compile(regex);
 
			public boolean accept(File arg0, String arg1) {
				return filePattern.matcher(arg1).matches();
			}
		});
	}
 
	public static File[] local(String path, final String regex) {
		return local(new File(path), regex);
	}
 
	public static class TreeInfo implements Iterable<File> {
		public List<File> files = new ArrayList<File>();
		public List<File> dirs = new ArrayList<File>();
 
		public Iterator<File> iterator() {
			return files.iterator();
		}
 
		public void addAll(TreeInfo other) {
			files.addAll(other.files);
			dirs.addAll(other.dirs);
		}
 
		public String toString() {
			String fileStr = Arrays.asList(this.files).toString();
			String dirStr = Arrays.asList(this.dirs).toString();
			return "files :" + fileStr + "\n dirs :" + dirStr;
		}
	}
 
	public static TreeInfo recursDirs(File file, String regex) {
		TreeInfo treeInfo = new TreeInfo();
		File[] fileList = file.listFiles();
		for (File thisFile : fileList) {
			if (thisFile.isDirectory()) {
				treeInfo.dirs.add(thisFile);
				treeInfo.addAll(recursDirs(thisFile, regex));
			} else {
				if(thisFile.getName().matches(regex)){
					treeInfo.files.add(thisFile);
				}
			}
		}
		return treeInfo;
	}
 
	public static TreeInfo walk(File file, String regex) {
		return recursDirs(file, regex);
	}
 
	public static TreeInfo walk(String path, String regex) {
		return walk(new File(path), regex);
	}
 
	public static void main(String[] args) {
		 File[] fileList = local("D:\\tomcat", "[\\w|.]*");
		System.out.println(fileList.length);
		 System.out.println(Arrays.asList(fileList));
		System.out.println(recursDirs(new File("D:\\tomcat"), "[\\w|.]*"));
	}
}
