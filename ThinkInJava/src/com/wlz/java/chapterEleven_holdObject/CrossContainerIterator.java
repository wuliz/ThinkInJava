package com.wlz.java.chapterEleven_holdObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CrossContainerIterator {
	public static void display(Iterator<Pet> it) {
		while(it.hasNext()){
			Pet p=it.next();
			System.out.print(p.id()+":"+p+" ");
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pet> pets = Pets.arrayList(8);
		LinkedList<Pet> petsll = new LinkedList<Pet>(pets);
		HashSet<Pet> petshs = new HashSet<Pet>(pets);
		TreeSet<Pet> petsts = new TreeSet<Pet>(pets);
		display(pets.iterator());
		display(petsll.iterator());
		display(petshs.iterator());
		display(petsts.iterator());
		new ArrayList<String>().iterator();
	}

}
