package com.wlz.java.chapterSeventeen_Container;

public class AssociativeArray<K, V> {
	private Object[][] pairs;
	private int index;

	public AssociativeArray(int lenght) {
		pairs = new Object[lenght][2];
	}

	public void put(K key, V value) {
		if (index >= pairs.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		pairs[index++] = new Object[] { key, value };
	}

	@SuppressWarnings("unchecked")
	public V get(K key) {
		for (int i = 0; i < index; i++) {
			if (key.equals(pairs[i][0]))
				return (V) pairs[i][1];
		}
		return null;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < index; i++) {
			result.append(pairs[i][0].toString());
			result.append(":");
			result.append(pairs[i][1].toString());
			if (i < index - 1) {
				result.append("\n");
			}

		}
		return result.toString();
	}
public static void main(String[] args){
	AssociativeArray<String, String> map = new AssociativeArray<String,String>(3);
	map.put("sky", "blue");
	map.put("grass", "green");
	map.put("ocean", "dancing");
	try{
		map.put("extra", "object");
	}catch(Exception e){
		System.out.println("too many object");
	}
	System.out.println(map);
	System.out.println(map.get("sky"));
	
	//使用这种存储结构导致查找时非常的慢
}
}
