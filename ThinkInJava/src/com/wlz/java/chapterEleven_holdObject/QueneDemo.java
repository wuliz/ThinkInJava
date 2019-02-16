package com.wlz.java.chapterEleven_holdObject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueneDemo {
	public static void printQ(Queue queue) {
		while (queue.peek() != null) {
			//remove():����
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for(int i=0;i<10;i++){
			//offer()��Ԫ�ز嵽��β�����
			queue.offer(rand.nextInt(i+10));
		}
		printQ(queue);
		Queue<Character> qu = new LinkedList<Character>();
		for(char c:"BRAONFSRLJGSI".toCharArray()){
			qu.offer(c);
		}
		printQ(qu);
	}
}
