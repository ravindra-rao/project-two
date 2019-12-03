package com.testprograms;

public interface Stack {
	public boolean isEmpty();
		//return true if the stack is empty, false otherwise
	public boolean isFull();
		//return true if the stack is full, false otherwise
	public void push(Object obj) throws StackException;
		//push obj onto the stack
	public Object pop() throws StackException;
		//return and remove the top element of the stack
		//throws STackException if the stack is empty
	public Object top() throws StackException; 
		//return the top element of the stack;
		//throws STackException if the stack is empty
	public void popAll(); 
		//remove all the items from the stack
		
}
