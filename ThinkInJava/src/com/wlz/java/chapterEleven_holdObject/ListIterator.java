package com.wlz.java.chapterEleven_holdObject;

import java.util.ArrayList;
import java.util.List;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> pets = Pets.arrayList(8);
		java.util.ListIterator<Pet> it = pets.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+" "+it.nextIndex()+","+it.previousIndex()+";");
		}
		System.out.println();
		
		while(it.hasPrevious()){
			System.out.print(it.previous().id()+" ");
		}
		System.out.println();
		System.out.println(pets);
		it = pets.listIterator(3);
		while(it.hasNext()){
			it.next();	
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}

}
