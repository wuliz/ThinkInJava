package com.wlz.java.chapterTwenty_annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserCaseTracker {
	public static void trackUseCases(List<Integer> userCases, Class<?> cl) {
		//获得Clclass对象得所有方法
		for (Method m : cl.getDeclaredMethods()) {
			//获得方法得Usercase注解
			Usercase uc = m.getAnnotation(Usercase.class);
			if (uc != null) {
				//取得注解属性
				System.out.println(uc.id() + " " + uc.description());
				userCases.remove(new Integer(uc.id()));
			}
		}
		for (int i : userCases) {
			System.out.println("Warning:Missing user case" + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> userCases = new ArrayList<Integer>();
		Collections.addAll(userCases, 47, 48, 49, 50);
		trackUseCases(userCases, PasswordUtil.class);
	}

}
