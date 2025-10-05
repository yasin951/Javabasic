package com.codio.queue.concept;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayDeque<Integer> q = new ArrayDeque<>();//Null is not allowed
        
       q.offer(10);
       q.offer(4);
       q.offer(8);
       q.offer(5);
       q.offer(5);
       q.offer(7);
       
       q.poll();
       q.pollLast();//arraydeque have this method that why it is double-ended queue
       
       System.out.println(q);
       
	}

}
