package StackTestCases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import StackImplementation.MyStack;
import junit.framework.Assert;

public class MystackTesting {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void Sizetest() throws Exception {
		 MyStack stack = new MyStack(5);
		 stack.push(4);
		 stack.push(3);
		 stack.push(6);
		 stack.push(76);
		 stack.push(32);
		
		 Assert.assertEquals(5, stack.size());
	}
	
	@Test
	public void Poptest() throws Exception {
		 MyStack stack = new MyStack(5);
		 stack.push(4);
		 stack.push(3);
		 stack.push(6);
		 stack.push(76);
		 stack.push(32);
		 Assert.assertEquals(32, stack.pop());
	}

	@Test
	public void Toptest() throws Exception {
		 MyStack stack = new MyStack(5);
		 stack.push(4);
		 stack.push(3);
		 stack.push(6);
		 stack.push(76);
		 stack.push(32);
		stack.displayStack();
		 Assert.assertEquals(32, stack.top());
	}
}
