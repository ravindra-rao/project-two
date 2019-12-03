package com.testprograms;

import com.assignment.ArrayQueue;

public class TestArrayQueue {

	public static void main(String[] args) throws QueueException{
		ArrayQueue arrayQueue = new ArrayQueue();
		System.out.println(arrayQueue.isEmpty());
		System.out.println(arrayQueue.isFull());
		arrayQueue.enqueue(1);
		arrayQueue.enqueue(2);
		arrayQueue.enqueue(3);
		System.out.println(arrayQueue.isEmpty());
		arrayQueue.dequeue();
		arrayQueue.dequeue();
		arrayQueue.visitAll(arrayQueue);
		arrayQueue.enqueue(4);
		arrayQueue.enqueue(5);
		//arrayQueue.enqueue(6);
		System.out.println();
		arrayQueue.visitAll(arrayQueue);
		arrayQueue.emptyTheQueue(arrayQueue);
		arrayQueue.visitAll(arrayQueue);

	}

}
