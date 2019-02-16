package com.wlz.java.chapterFifteen_genericity;

public class Holder3<T> {
private T a;
public Holder3(T a){
	this.a=a;
}
public void set(T a){
	this.a=a;
}
public T get(){
	return a;
}
public static void main(String[] args){
	Holder3<Holder> h3 = new Holder3<Holder>(new Holder());
	Holder h = h3.get();
	//因为检查了类型，所有不能存储除指定类型之外的类型
	//h3.set("helllo");
}
}
