package com.testprograms;

public interface Queue {
	public boolean isEmpty();
	public boolean isFull();
	public void enqueue(Object x) throws QueueException;
	public Object dequeue() throws QueueException;
	public Object peek() throws QueueException;
}
