package com.wlz.java.chapterEleven_holdObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class SimpleIteratoration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while(it.hasNext()){
			Pet p = it.next();
			System.out.println(p.id()+" :"+p+" ");
		}
		for(Pet p:pets){
			System.out.println(p.id()+" :"+p+" ");
		}
		//������Ҳ����ɾ��Ԫ��
		//ɾ��ǰ����Ԫ��
		it=pets.iterator();
		for(int i=0;i<6;i++){
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}

}
