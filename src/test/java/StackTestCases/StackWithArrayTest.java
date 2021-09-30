package StackTestCases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import StackwithArray.Stack;
import junit.framework.Assert;

public class StackWithArrayTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void fillingtest() {
		Stack stack = new Stack();
		
		stack.push(10); //push num=10
		stack.push(20); //push num=20
		stack.push(30); //push num=30
		stack.display();//display stack.
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void Poptest() {
		Stack stack = new Stack();
		
		stack.push(10); //push num=10
		stack.push(20); //push num=20
		stack.push(30); //push num=30
		stack.display();//display stack.
		Assert.assertEquals(30, stack.pop());
	}
	
	

}
