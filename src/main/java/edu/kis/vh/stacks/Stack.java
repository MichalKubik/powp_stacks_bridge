package edu.kis.vh.stacks;

public class Stack {

	private static final int INT = -1;
	private static final int ITEMS_SIZE = 12;

	private int[] items = new int[ITEMS_SIZE];	

	private int total = INT;
	
	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
		items[++total] = i;
	}
	
	public boolean isEmpty() {
		return total == INT;
	}
		
	public boolean isFull() {
		return total == ITEMS_SIZE - 1;
	}
			
	public int top() {
		if (isEmpty())
			return INT;
		return items[total];
	}
				
	public int pop() {
		if (isEmpty())
			return INT;
		return items[total--];
	}
				
}
