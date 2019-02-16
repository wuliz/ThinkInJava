package com.wlz.java.chapterFourteen_TypeInfo;

import java.util.ArrayList;
import java.util.List;

import typeinfo.pets.Pet;

public class ForNameCreator extends PetCreateor {
	private static List<Class<? extends Pet>> types=new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames={
		"typeinfo.pets.Mutt","typeinfo.pets.EgyptianMau","typeinfo.pets.Manx","typeinfo.pets.Cymric","typeinfo.pets.Rat","typeinfo.pets.Mouse","typeinfo.pets.Hamster"
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static void loader(){
		try{
			for(String name:typeNames){
				types.add((Class<? extends Pet>)Class.forName(name));
			}
		}catch(ClassNotFoundException e){
			throw new RuntimeException(e);
		}
		
	}
	static{
		loader();
	}
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}

}
