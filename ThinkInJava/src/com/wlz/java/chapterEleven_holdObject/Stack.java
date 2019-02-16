package com.wlz.java.chapterEleven_holdObject;

import java.util.LinkedList;

//如果我们引用了java内的stack，则要确定路径防止冲突
//<T>告诉编译器这是一个参数化类型
public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();

	public void push(T v) {
		storage.addFirst(v);
	}

	public T peek() {
		return storage.getFirst();
	}

	public T pop() {
		return storage.removeFirst();
	}

	public boolean empty() {
		return storage.isEmpty();
	}

	public String toString() {
		return storage.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		for (String s : "My dog has fleas".split(" ")) {
			stack.push(s);
		}
		while (!stack.empty()) {
			System.out.println(stack.pop());
			/*
			 * fleas has dog My
			 */
		}
	}

}
