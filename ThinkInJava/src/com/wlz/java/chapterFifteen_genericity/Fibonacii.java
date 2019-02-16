package com.wlz.java.chapterFifteen_genericity;

public class Fibonacii implements Generator<Integer> {
	private int count=0;
	
	
	private int fib(int  n){
		if(n<2){
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return fib(count++);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacii gen = new Fibonacii();
		for(int i=0;i<18;i++){
			System.out.print(gen.next()+" ");
		}
	}
}
