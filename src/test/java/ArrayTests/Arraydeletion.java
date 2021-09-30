package ArrayTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ArrayDeletion.ArrayDeletion;
import junit.framework.Assert;

public class Arraydeletion {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
	
		ArrayDeletion arrd=new ArrayDeletion();
		int [] array = {65,77,4,8,0,1};
		
		arrd.display(array);
		arrd.deletion(array,0);
		arrd.display(array);
			
		Assert.assertFalse(65==arrd.getvalue(array, 0));
	}
	

}
