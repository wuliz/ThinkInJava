package com.wlz.java.chapterNighteen_enumType;

public enum SpaceShop {
SOUNT,HSA,BAT;
public String toString(){
	String id=this.name();
	String lower=id.substring(1).toLowerCase();
	return id.charAt(0)+lower;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(SpaceShop s:SpaceShop.values()){
	System.out.println(s);
}
	}

}
