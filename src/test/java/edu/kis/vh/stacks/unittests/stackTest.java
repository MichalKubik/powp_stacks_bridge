package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;

public class stackTest {

	private static final int TEST_VALUE = 4;
	private static final int EMPTY_STACK_VALUE = 0;

	@Test
	public void testPushArray() {
		StackArray stackObj = new StackArray();
		int testValue = TEST_VALUE;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testPushList() {
		StackList stackObj = new StackList();
		int testValue = TEST_VALUE;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmptyArray() {
		StackArray stackObj = new StackArray();
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(888);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testIsEmptyList() {
		StackList stackObj = new StackList();
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(888);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFullList() {
		StackList stackObj = new StackList();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(false, result); // domyślny ListArray nigdy nie zwraca true ( nigdy nie jest pełny )
	}

	@Test
	public void testIsFullArray() {
		StackArray stackObj = new StackArray();
		final int STACK_CAPACITY = 11; // zmiana EMPTY_STACK_VALUE na 0 powoduje zmniejszenie maksymalnego rozmiaru o 1
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testTopList() {
		StackList stackObj = new StackList();

		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = TEST_VALUE;
		stackObj.push(testValue);

		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testTopArray() {
		StackArray stackObj = new StackArray();

		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = TEST_VALUE;
		stackObj.push(testValue);

		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPopList() {
		StackList stackObj = new StackList();

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = TEST_VALUE;
		stackObj.push(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testPopArray() {
		StackArray stackObj = new StackArray();

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = TEST_VALUE;
		stackObj.push(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testPopFIFO() {
		StackFIFO stackObj = new StackFIFO();
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = TEST_VALUE;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testPushHanoi() {
		StackHanoi stackObj = new StackHanoi();
		int testValue = TEST_VALUE;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}
	
	// Błędy wynikały ze zmiany wartości EMPTY_STACK_VALUE w klasach Stack z -1 na 0, oraz ze zmiany domyślnego typu Stack na ListStack
}
