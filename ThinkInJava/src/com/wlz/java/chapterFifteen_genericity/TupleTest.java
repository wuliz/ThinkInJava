package com.wlz.java.chapterFifteen_genericity;
class Amphibian{
	
}
class Vehicle{
	
}
public class TupleTest {
static TwoTuple<String,Integer> f(){
	return new TwoTuple<String,Integer>("hi",47);
}
static ThreeTupe<Amphibian,String,Integer> g(){
	return new ThreeTupe<Amphibian,String,Integer>(new Amphibian(),"hi",47);
}
static FourTupe<Vehicle,Amphibian,String,Integer> h(){
	return new FourTupe<Vehicle,Amphibian,String,Integer>(new Vehicle(),new Amphibian(),"hi",47);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(g());
		System.out.println(h());
	}

}
