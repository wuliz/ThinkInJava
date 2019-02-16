package com.wlz.java.chapterSeventeen_Container;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Dog implements Comparable{
	String name;
	int age;

	Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		System.out.println("Dog hashcode()");
		return age;
	}

	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Dog equals()");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		System.out.println("Dog compareTo()");
		return this.age>((Dog)(o)).age?1:(this.age==((Dog)o).age?0:1);
	}
}


public class Test {
	public static void main(String[] args) {
		//hashSet∞¥’’hashcode≈≈–Ú
		Set<Dog> s = new HashSet<Dog>();
		for (int i = 0; i < 5; i++) {
			s.add(new Dog(i + "dog", i));
		}
		s.add(new Dog(3+"dog",3));
		System.out.println(s);
		
		TreeSet<Dog> tr = new TreeSet<Dog>();
		for (int i = 0; i < 5; i++) {
			tr.add(new Dog(i + "dog", i));
		}
		tr.add(new Dog(3+"dog",3));
		System.out.println(tr);
		
		HashMap<Integer, Dog> hm = new HashMap<Integer,Dog>();
		for(int i=0;i<5;i++){
			hm.put(i, new Dog(i + "dog", i));
		}
		hm.put(3, new Dog(3 + "dog", 5));
		System.out.println(hm);
		HashMap< Dog,Integer> hms = new HashMap<Dog,Integer>();
		for(int i=0;i<5;i++){
			hms.put(new Dog(i + "dog", i),i);
		}
		hms.put(new Dog(3 + "dog", 3),3 );
		System.out.println(hms);
	}
}
