package edu.kis.vh.stacks;

public class StackArray implements StackInterface {
	private static final int INT = -1;
	private static final int ITEMS_SIZE = 12;

	private int[] items = new int[ITEMS_SIZE];	

	private int total = INT;
	
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
		items[++total] = i;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == INT;
	}
		
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == ITEMS_SIZE - 1;
	}
			
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return INT;
		return items[total];
	}
				
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return INT;
		return items[total--];
	}
}
