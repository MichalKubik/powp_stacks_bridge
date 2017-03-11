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
	
	private class Node {

		private final int value;		
		private Node prev;		
		private Node next;
		// odwołania do pól w StackList.java zostały zastąpione przez metody typu get i set

		public Node(int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
	}

}
