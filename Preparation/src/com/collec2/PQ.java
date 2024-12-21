package com.collec2;

import java.util.PriorityQueue;

public class PQ {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(20);
		pq.add(65);
		pq.add(55);
		pq.add(10);
		pq.offer(65);
		pq.offer(80);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.remove(65));
		System.out.println(pq);
	}
}
