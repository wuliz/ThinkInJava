package com.wlz.java.chapterFifteen_genericity;

import java.util.Iterator;
import java.util.Random;

interface Generator<T>{
	T next();
}
class Coffee{
	private static long counter=0;
	private final long id=counter++;
	public String toString(){
		return getClass().getSimpleName()+" "+id;
	}
	
}
class Lattee extends Coffee{
	
}
class Mocha extends Coffee{
	
}
class Capuccino extends Coffee{
	
}
class Americano extends Coffee{
	
}
class Breve extends Coffee{
	
}
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {

	private Class[] types={Lattee.class,Mocha.class,Capuccino.class,Americano.class,Breve.class};
	private static Random rand=new Random(47);
	public CoffeeGenerator(){
		
	}
	private int size=0;
	public CoffeeGenerator(int sz){
		this.size=sz;
	}
	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
		// TODO Auto-generated method stub
		
	}
	class CoffeeIterator implements Iterator<Coffee>{
		int count=size;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
		return count>0;
		}

		@Override
		public Coffee next() {
			// TODO Auto-generated method stub
			count--;
			return CoffeeGenerator.this.next();
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
	}

	@Override
	public Coffee next() {
		// TODO Auto-generated method stub
		try{
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		}catch(Exception e){
			throw new RuntimeException();
		}
	}
	public static void main(String[] args){
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i=0;i<5;i++){
			System.out.println(gen.next());
		}
		//
		for(Coffee c:new CoffeeGenerator(5)){
			System.out.println(c);
		}
	}

}
