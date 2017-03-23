package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;

public class StackHanoi extends Stack {

	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(StackArray stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(StackList stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}

	int getTotalRejected() {
		return totalRejected;
	}
}
