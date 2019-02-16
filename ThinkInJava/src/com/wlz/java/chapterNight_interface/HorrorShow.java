package com.wlz.java.chapterNight_interface;
interface Monster{
	void menace();
}
interface DangerousMonster extends Monster{
	void destory();
}
//ÖÂÃüµÄ
interface Lethal{
	void kill();
	void menace();
}
class DragonZiliza implements DangerousMonster{
	public void destory(){
		
	}
	public void menace(){
		
	}
}
class test{
	int menace(){
		return 0;
	}
}
interface Vampire extends DangerousMonster,Lethal{
	void drinkBlood();
}
class VeryVampire implements Vampire{

	@Override
	public void destory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menace() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drinkBlood() {
		// TODO Auto-generated method stub
		
	}
	
}

public class HorrorShow {
	static void u(Monster b){
		b.menace();
	}
	static void v(DangerousMonster d){
		d.menace();
		d.destory();
	}
	static void w(Lethal l){
		l.kill();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DangerousMonster b=new  DragonZiliza();
			u(b);
			v(b);
			Vampire vial=new VeryVampire();
			u(vial);
			v(vial);
			w(vial);
		
	}

}
