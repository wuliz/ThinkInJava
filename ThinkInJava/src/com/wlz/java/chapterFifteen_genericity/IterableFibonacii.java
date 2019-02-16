package com.wlz.java.chapterFifteen_genericity;

import java.util.Iterator;

public class IterableFibonacii extends Fibonacii implements Iterable<Integer> {
	private int n;
	public IterableFibonacii(int count){
		this.n=count;
	}
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>(){
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return n>0;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				n--;
				return IterableFibonacii.this.next();
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
public static void main(String[] args){
	for(int i:new IterableFibonacii(18)){
		System.out.print(i+" ");
	}
}
	

}
