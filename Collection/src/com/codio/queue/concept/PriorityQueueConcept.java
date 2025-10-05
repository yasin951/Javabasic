package com.codio.queue.concept;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new PriorityQueue<>();//Priority queue does not allowed null
		
		q.offer(2);//in that priority queue contain least(small) element in head of queue
		q.offer(5);
		q.offer(9);
		q.offer(5);
		q.offer(1);
		q.offer(3);
		q.offer(1);
		q.offer(4);
		q.offer(4);
		q.poll();
		q.poll();
		
		System.out.println(q);//ordered is not fix but small element in head of queue
		
		
		

	}

}
