package com.wlz.java.chapterFourteen_TypeInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Pet;

public abstract class PetCreateor {
	private Random rand=new Random(47);
	public abstract List<Class<? extends Pet>> types();
	public Pet randomPet(){
		int n=rand.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	public Pet[] createArray(int size){
		Pet[] result=new Pet[size];
		for(int i=0;i<size;i++){
			result[i]=randomPet();
		}
		return result;
		
	}
	public ArrayList<Pet> arrayList(int size){
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}

}
