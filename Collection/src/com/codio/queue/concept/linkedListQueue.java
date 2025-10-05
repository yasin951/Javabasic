package com.codio.queue.concept;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */
public class linkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new LinkedList();//queue is worked on FIFO // duplicate is allowed in all queue
		
		q.offer("yasin");
		q.offer("Mirza");//add in queue 
		q.offer("56");
		q.offer("56");
		q.offer(132);
		q.offer(null);//Allow Null in Linked List Queue
		
		q.poll();//remove in queue
		
		
		System.out.println(q.peek());//showing next element of queue 
		System.out.println(q);

	}

}
