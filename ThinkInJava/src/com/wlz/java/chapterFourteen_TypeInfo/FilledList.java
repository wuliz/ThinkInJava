package com.wlz.java.chapterFourteen_TypeInfo;

import java.util.ArrayList;
import java.util.List;

class CountedInteger {
	private static long counter;
	private final Long id = counter++;

	public String toString() {
		return Long.toString(id);
	}
}

public class FilledList<T> {
	private Class<T> type;

	public FilledList(Class<T> type) {
		this.type = type;
	}

	public List<T> create(int nElements) {
		List<T> result = new ArrayList<T>();
		try {
			for (int i = 0; i < nElements; i++) {
				result.add(type.newInstance());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
		System.out.print(fl.create(15));
	}

}
