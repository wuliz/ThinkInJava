package com.wlz.java.chapterSixteen_Array;
class ClassParameter<T>{
	public T[] f(T[] arg){
		return arg;
	}
	
}
class MethodParamter<T>{
	public T[] f(T[] arg){
		return arg;
	}
}
public class ClassParameterizedArrayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ints={1,2,3,4,5};
		Double[] doubles={1.1,2.2,3.3,4.,5.5};
		Integer[] ints2=new ClassParameter<Integer>().f(ints);
		Double[] doubles2=new MethodParamter<Double>().f(doubles);
		
		
	}

}
