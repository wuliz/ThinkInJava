package com.wlz.java.chapterEleven_holdObject;

import java.util.LinkedList;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

public class LinkedListFeatures {
public static void main(String[] args){
	LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
	System.out.println(pets);
	//返回链表的第一个元素
	System.out.println("pets.getFirst():"+pets.getFirst());
	System.out.println("pets.elements():"+pets.element());
	System.out.println("pets.peek():"+pets.peek());
	//移除第一个元素
	System.out.println("pets.remove():"+pets.remove());
	System.out.println("pets.removeFirst():"+pets.removeFirst());
	System.out.println("pets.poll():"+pets.poll());
	
	System.out.println(pets);
	//添加元素
	pets.addFirst(new Rat());
	System.out.println("after addFirst:"+pets);
	pets.offer(Pets.randomPet());
	System.out.println("after offer():"+pets);
	pets.add(Pets.randomPet());
	System.out.println("after add():"+pets);
	pets.addLast(new Hamster());
	System.out.println("after addLast():"+pets);
	System.out.println("pets.removeLast():"+pets.removeLast());
}
}
