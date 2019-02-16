package com.wlz.java.chapterFifteen_genericity;

import java.util.ArrayList;
import java.util.Random;

class Product{
	private final int id;
	private String description;
	private double price;
	public Product(int Idnumber,String des,double price){
		id=Idnumber;
		description=des;
		this.price=price;
		System.out.println(toString());
	}
	public String toString(){
		return id+":"+description+",price:$"+price;
	}
	public void priceChange(double change){
		price+=change;
	}
	public static Generator<Product> generator=new Generator<Product>(){
		private Random rand=new Random(47);
		public Product next(){
			return new Product(rand.nextInt(1000),"Test",Math.round(rand.nextDouble()*1000.0)+0.99);
		}
	};
}
class Shelf extends ArrayList<Product>{
	public Shelf(int nProducts){
		//Generators.fill(this,Product.generator,nProducts)
	}
}
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic Pu
	}

}
