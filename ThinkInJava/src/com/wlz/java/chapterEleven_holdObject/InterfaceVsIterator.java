package com.wlz.java.chapterEleven_holdObject;

import java.util.*;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class InterfaceVsIterator {
public static void display(Iterator<Pet> it){
	while(it.hasNext()){
		Pet p = it.next();
		System.out.print(p.id()+" :"+p+" ");
	}
	System.out.println();
}
public static void display(Collection<Pet> pets){
	for(Pet p:pets){
		System.out.print(p.id()+":"+p+" ");
	
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pet> pList = Pets.arrayList(8);
		Set<Pet> petset = new HashSet<Pet>(pList);
		LinkedHashMap<String, Pet> petmap = new LinkedHashMap<String,Pet>();
		String[] names="Ralph,eric,robin,lacey,brithe,sam,spoot,fluffy".split(",");
		for(int i=0;i<names.length;i++){
			petmap.put(names[i], pList.get(i));
		}
		display(pList);
		display(petset);
		display(pList.iterator());
		display(petset.iterator());
		System.out.println(petmap);
		System.out.println(petmap.keySet());
		display(petmap.values());
		display(petmap.values().iterator());
	}

}
