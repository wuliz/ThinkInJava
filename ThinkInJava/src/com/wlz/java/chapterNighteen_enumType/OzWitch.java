package com.wlz.java.chapterNighteen_enumType;

public enum OzWitch {
	//สตภýบอร่ส๖
WEST("west"),NORTH("FLINDA,the god");
private String description;
private OzWitch(String description){
	this.description=description;
}
public String getDescription(){
	return this.description;
}
public static void main(String[] args){
	for(OzWitch w:OzWitch.values()){
		System.out.println(w.getDescription());
	}
}
}
