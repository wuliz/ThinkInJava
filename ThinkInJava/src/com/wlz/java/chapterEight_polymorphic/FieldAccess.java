package com.wlz.java.chapterEight_polymorphic;

class Super {
	public int field = 0;

	public int getField() {
		return field;
	}

	public static void staticMethod() {
		System.out.println("super.staticMethod");
	}
}

class Sub extends Super {
	// 虽然覆盖了基类域，但基类域依然是存在的
	public int field = 1;

	public int getSuperField() {
		return super.getField();
	}

	public int getField() {
		return field;
	}

	public static void staticMethod() {
		System.out.println("sub.staticMethod");
	}
}

public class FieldAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup = new Sub();
		// 域（数据成员）不存在动态绑定，如果直接访问域，会在编译进行执行
		System.out.println("sup.field=" + sup.field + ",sup.getField="
				+ sup.getField());
		sup.staticMethod();// super.staticMethod
		Sub sub = new Sub();
		System.out.println("sub.field=" + sub.field + ",sub.getField()="
				+ sub.getField() + ",sub.getSuperFiled=" + sub.getSuperField());
		sub.staticMethod();// sub.staticMethod
		/*
		 * sup.field=0,sup.getField=1 
		 * super.staticMethod
		 * sub.field=1,sub.getField()=1,sub.getSuperFiled=0
		 *  sub.staticMethod
		 */
	}

}
