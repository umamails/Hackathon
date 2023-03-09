package com.training.sept;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new LinkedList<>();
		q.add("Kokila");
		q.add(4);
		q.add("Ilakya");
		q.add(22.0);
		q.add("Aarthi");
		int queuesize = q.size();
		for (int i = 0; i < queuesize; i++) {
			System.out.println(q.peek());
			System.out.println(q.poll());
			System.out.println(q.peek());

		}
		System.out.println(q.peek());
	}
}