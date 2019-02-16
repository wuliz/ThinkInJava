package com.wlz.java.chapterEleven_holdObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import typeinfo.pets.Cymric;
import typeinfo.pets.Mutt;
import typeinfo.pets.Pet;

class Person{
	private String name;

	Person(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
}
public class MapOfList {
public static Map<Person,List<? extends Pet>> petPeople=new HashMap<Person,List<? extends Pet>>();
static{
	petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"),new Mutt("spot")));
	petPeople.put(new Person("Kate"), Arrays.asList(new Cymric("MElsieolly"),new Mutt("spot")));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(petPeople.keySet());//返回一个Set集合
		System.out.println(petPeople.values());//返回collection集合
		for(Person p:petPeople.keySet()){
			System.out.print(p.toString()+"has:");
			for (Pet e:petPeople.get(p)){
				System.out.print(e+" ");
			}
		}
	}

}
