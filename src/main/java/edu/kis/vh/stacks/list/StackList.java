package edu.kis.vh.stacks.list;

public class StackList {

	private static final int INT = -1;
	private Node last;
	private int i;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean empty() {
		return last == null;
	}

	private boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return INT;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return INT;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	Node getLast() {
		return last;
	}

	int getI() {
		return i;
	}

}
