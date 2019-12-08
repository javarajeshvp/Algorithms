package com.vp.ds.queue;

import java.util.LinkedList;

public class QueueTest {
	public static void main(String[] args) throws InterruptedException {

		int time = 8;
		//java.util.Queue<Integer> queue = new LinkedList<Integer>();

		Queue myQueue = new Queue();

		// queue.add(i);
		myQueue.add(10);
		myQueue.add(20);
		myQueue.add(30);
		myQueue.add(40);
		myQueue.add(50);

		myQueue.display();

		while (!myQueue.isEmpty()) {
			System.out.println(myQueue.remove());
			Thread.sleep(1000);
		}

	}
}