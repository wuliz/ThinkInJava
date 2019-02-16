package com.wlz.java.chapterTwenty_annotation;

public class PasswordUtil {
	@Usercase(description = "passwordmust contain one numeric", id = 47)
	public boolean validDatePassword(String pwd){
		return pwd.matches("\\w*\\d\\w*");
	}
	@Usercase( id = 48)
	public String encryptPassword(String pwd){
		return new StringBuilder(pwd).reverse().toString();
	}
}
