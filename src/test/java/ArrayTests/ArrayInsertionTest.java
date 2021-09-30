package ArrayTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ArrayInsert.ArrayInsertion;
import junit.framework.Assert;

public class ArrayInsertionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ArrayInsertion arrayi=new ArrayInsertion();
		int [] array = new int[10];
		arrayi.insert(array,10,0);
		
		Assert.assertEquals(10, array[0]);
		
		
	}
	
	@Test
	public void negtest() {
		ArrayInsertion arrayi=new ArrayInsertion();
		int [] array = new int[10];
		arrayi.insert(array,10,0);
		
		Assert.assertEquals(false, 0==array[0]);
		
		
	}
}
