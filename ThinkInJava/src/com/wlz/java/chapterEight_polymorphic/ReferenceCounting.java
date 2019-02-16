package com.wlz.java.chapterEight_polymorphic;

class Shared{
	private int refcount=0;
	
	private static int counter=0;
	private final long id=counter++;
	public Shared(){
		System.out.println("creating "+this);
	}
	public void addRef(){
		refcount++;
	}
	protected void dispose(){
		if(--refcount==0){
			System.out.println("disposing"+this);
		}
	}
	public String toString(){
		return "shared"+id;
	}
}
class Composing{
	private Shared shared;
	private static long counter=0;
	private final long id=counter++;
	public Composing(Shared s){
		System.out.println("Creating "+this);
		this.shared=s;
		this.shared.addRef();
	}
	protected void dispose(){
		System.out.println("disposing"+this);
		this.shared.dispose();
	}
	public String toString(){
		return "composing"+this;
	}
}
public class ReferenceCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared shared=new Shared();
		Composing[] composing={new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared)};
		for(Composing c:composing){
			c.dispose();
		}
	}

}
