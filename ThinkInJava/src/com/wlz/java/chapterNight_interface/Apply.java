package com.wlz.java.chapterNight_interface;

import java.util.Arrays;

class Processor{
	public String name(){
		//得到类名
		return getClass().getSimpleName();
	}
	Object process(Object input){
		return input;
	}
}
class Upcase extends Processor{
	String process(Object input){
		return ((String)input).toUpperCase();
	}
}
class Downcase extends Processor{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}
class Spliter extends Processor{
	public String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}
public class Apply {
	public static void process(Processor p,Object s){
		System.out.println("Using Processor"+p.name());
		System.out.println(p.process(s));
	}
	public static String s="disagreement with beief id by definition incorrect";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apply.process(new Upcase(), s);
		process(new Downcase(),s);
		process(new Spliter(),s);
	}

}
