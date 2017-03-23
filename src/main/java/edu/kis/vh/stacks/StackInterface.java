package edu.kis.vh.stacks;

public interface StackInterface {

	public int INT = 0;
	// dzieki realizacji zadania 1.10, wystarczy zmienic wartosc tylko raz

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}