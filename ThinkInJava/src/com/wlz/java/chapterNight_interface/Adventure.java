package com.wlz.java.chapterNight_interface;
interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
interface Canfly{
	void fly();
}
class ActionCharacter{
	public void fight(){
		
	}
}
class Hero extends ActionCharacter implements CanFight,CanSwim,Canfly{
	public void swim(){
		
	}
	public void fly(){
		
	}
}
public class Adventure {
	public static void t(CanFight x){
		x.fight();
	}
	public static void u(CanSwim x){
		x.swim();
	}
	public static void v(Canfly x){
		x.fly();
	}
	public static void w(ActionCharacter x){
		x.fight();
	}
	public static void main(String[] args){
		Hero o=new Hero();
		t(o);
		u(o);
		v(o);
		w(o);
		
	}

}
