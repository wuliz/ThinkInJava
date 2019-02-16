package com.wlz.java.chapterSeventeen_Container;

import java.lang.reflect.Constructor;
import java.util.Random;

class Groundhog{
	protected int number;
	public Groundhog(int n){
		number=n;
	}
	public String toString(){
		return "Groundhog #"+number;
	}
}
class Prediction{
	private static Random rand=new Random(47);
	private boolean shadow=rand.nextDouble()>0.5;
	public String toString(){
		if(shadow)
			return "six more weeks of winter!";
		else
			return "early Spring!";
	}
}
public class SpringDelector {
public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception{
	Constructor<T> ghog = type.getConstructor(int.class);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
