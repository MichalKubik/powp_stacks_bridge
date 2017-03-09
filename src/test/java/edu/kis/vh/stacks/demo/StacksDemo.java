package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	private static final int STACK_SIZE = 15;

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(),
				factory.getFIFOStack(), factory.getHanoiStack()};
		
		for (int i = 1; i < STACK_SIZE; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);
			
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < STACK_SIZE; i++)
			stacks[3].push(rn.nextInt(20));
		
		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}
//		19-27
		System.out.println("total rejected is "
				+ ((StackHanoi) stacks[3]).reportRejected());
		
	}

}