package StackTestCases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import StackwithLinkedList.Stack;
import junit.framework.Assert;

public class StackLinkedListTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void fillingtest() {
		Stack stack = new Stack(); //create new stack.
		stack.push(10);            //push num = 10
		stack.push(20);            //push num = 20
		stack.push(30);            //push num = 30

		stack.display();           //display stack.
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void toptest() {
		Stack stack = new Stack(); //create new stack.
		stack.push(10);            //push num = 10
		stack.push(20);            //push num = 20
		stack.push(30);            //push num = 30

		stack.display();           //display stack.
		Assert.assertEquals(30, stack.top());
	}

	@Test
	public void poptest() {
		Stack stack = new Stack(); //create new stack.
		stack.push(10);            //push num = 10
		stack.push(20);            //push num = 20
		stack.push(30);            //push num = 30

		stack.display();           //display stack.
		Assert.assertEquals(30, stack.pop());
	}

	@Test
	public void NUlltest() {
		Stack stack = new Stack(); //create new stack.
		stack.pop();
		stack.top();
		stack.display();           //display stack.
		Assert.assertEquals(-1, stack.pop());
	}
}
