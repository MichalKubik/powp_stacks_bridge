package edu.kis.vh.stacks.list;

public class Node {

	private int value;		
	private Node prev;		
	private Node next;
	// odwołania do pól w StackList.java zostały zastąpione przez metody typu get i set

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
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
