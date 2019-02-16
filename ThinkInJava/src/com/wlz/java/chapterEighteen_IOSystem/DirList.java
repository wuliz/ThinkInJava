package com.wlz.java.chapterEighteen_IOSystem;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path=new File(".");
		String[] list;
		if(args.length==0){
			list=path.list();
		}
		else{
			list=path.list(new DirFliter(".java"));
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem:list){
			System.out.println(dirItem);
		}
	}
	

}
class DirFliter implements FilenameFilter{
	private Pattern pattern;
	public DirFliter(String regex){
		pattern=Pattern.compile(regex);
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return pattern.matcher(name).matches();
	}
	
}