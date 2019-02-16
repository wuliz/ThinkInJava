package com.wlz.java.chapterEleven_holdObject;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Cymric;
import typeinfo.pets.Hamster;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(47);
		List<Pet> pets=Pets.arrayList(7);
		System.out.println("1:"+pets);
		Hamster h=new Hamster();
		pets.add(h);
		System.out.println("2:"+pets);
		System.out.println("3:"+pets.contains(h));
		pets.remove(2);
		Pet p=pets.get(2);
		System.out.println("4:"+p+" "+pets.indexOf(p));
		Cymric cymric = new Cymric();
		System.out.println("5:"+pets.indexOf(cymric));
		System.out.println("6"+pets.remove(cymric));
		
		System.out.println("7:"+pets.remove(p));
		System.out.println("8"+pets);
		pets.add(3,new Mouse());
		System.out.println("9:"+pets);
		List<Pet> sub=pets.subList(1,4);
		System.out.println("subList:"+sub);
		System.out.println("10"+pets.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sort sublist:"+sub);
		
	}

}
