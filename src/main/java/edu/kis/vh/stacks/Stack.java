package edu.kis.vh.stacks;

/**
 * Stack class implementation.
 * @author Michał Kubik
 *
 */
public class Stack {

	private static final int INT = -1;
	private static final int ITEMS_SIZE = 12;

	private int[] items = new int[ITEMS_SIZE];	

	private int total = INT;
	
	/**
	 * Returns total amount of items in stack.
	 * @return amount of items in stack.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Adds new item to the stack.
	 * @param i item to add.
	 */
	public void push(int i) {
		if (!isFull())
		items[++total] = i;
	}
	
	/**
	 * Returns <code>true</code> if this stack is empty.
	 * @return <code>true</code> if stack is empty.
	 */
	public boolean isEmpty() {
		return total == INT;
	}
		
	/**
	 * Returns <code>true</code> if this stack is full.
	 * @return <code>true</code> if stack is full.
	 */
	public boolean isFull() {
		return total == ITEMS_SIZE - 1;
	}
			
	/**
	 * Returns latest item on stack. <br>
	 * If stack is empty, method will return <code> -1 </code>.
	 * @return <code> -1 </code> if stack is empty; <br>
	 * 			latest item on stack otherwise.
	 */
	public int top() {
		if (isEmpty())
			return INT;
		return items[total];
	}
				
	/**
	 * Returns and deletes latest item on stack. <br>
	 * If stack is empty, method will return <code> -1 </code>.
	 * @return <code> -1 </code> if stack is empty; <br>
	 * 			latest item on stack otherwise
	 */
	public int pop() {
		if (isEmpty())
			return INT;
		return items[total--];
	}
				
}
