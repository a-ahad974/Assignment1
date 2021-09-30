package ArrayTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import FullArray.Array;
import junit.framework.Assert;

public class FullArrayTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Array array = new Array(); //create an array.
		array.insert(1,0);
		array.insert(2,1);
		array.insert(5,2);
		array.insert(4,3);
		array.insert(0,4);
		//array.display();
		Assert.assertEquals(true,array.linearSearch(2));
		array.delete(3);   //delete num at pos=3 from the array.
		//array.display();   //display the array.

		Assert.assertEquals(false, array.binarySearch(10,0,5));

		array.bubbleSort();//sort the array.
		array.display();   //display the array.
	}

}
