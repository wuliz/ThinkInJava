package com.wlz.java.chapterTen_innerClass;

interface Selector {
	boolean end();

	Object current();

	void next();
}

// ађСа
public class Sequence {
	private Object[] items;
	private int next = 0;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}

	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == items.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if (i < items.length)
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence s = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			s.add(Integer.toString(i));
		}
		Selector select = s.selector();
		while (!select.end()) {
			System.out.println(select.current());
			select.next();
		}
		/*
		 * 0 1 2 3 4 5 6 7 8 9
		 */
	}

}
