package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {

	private StackList stack;
	
	public Stack(StackList stack) {
		super();
		this.stack = stack;
	}

	public Stack(){
		stack = new StackList();
	}

	public void push(int i) {
		stack.push(i);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int top() {
		return stack.top();
	}

	public int pop() {
		return stack.pop();
	}
	

	
}
