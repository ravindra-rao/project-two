package com.testprograms;

import com.assignment.ArrayStack;

public class TestArrayStack {

	public static void main(String[] args) {
		//ieEmpty isFull push pop top popAll
		ArrayStack arrayStack = new ArrayStack();
		System.out.println(arrayStack.isEmpty());
		System.out.println(arrayStack.isFull());
		arrayStack.push(1);
		arrayStack.push(2);
		System.out.println(arrayStack.top());
		System.out.println(arrayStack.isFull());
		arrayStack.push(3);
		System.out.println(arrayStack.top());
		System.out.println(arrayStack.isFull());
		arrayStack.pop();
		System.out.println(arrayStack.top());
		System.out.println(arrayStack.isFull());
		
		

	}

}
