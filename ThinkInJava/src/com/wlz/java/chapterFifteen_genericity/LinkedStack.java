package com.wlz.java.chapterFifteen_genericity;

public class LinkedStack<T> {
	private static class Node<U>{
		U item;
		Node<U> next;
		Node(){
			this.item=null;
			this.next=null;
		}
		Node(U item,Node<U> next){
			this.item=item;
			this.next=next;
		}
		boolean end(){
			return item==null&&next==null;
		}
	}
	private Node<T> top=new Node<T>();
	public void Push(T item){
		top=new Node<T>(item,top);
	}
	public T pop(){
		T result=top.item;
		if(!top.end())
			top=top.next;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack<String> lss = new LinkedStack<String>();
		for(String s:"Phsakjf or sund!".split(" ")){
			lss.Push(s);
		}
		String s;
		while((s=lss.pop())!=null){
			System.out.println(s);
		}
	}

}
