package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;

public class StackFIFO extends Stack {

	private final StackList temp = new StackList();
	//StackList ze wzgledu na brak ograniczen w ilosci elementow
	
	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
			push(temp.pop());
		
		return ret;
	}

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(StackArray stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(StackList stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}
}
