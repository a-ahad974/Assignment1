package LinkListTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import swapNodes.LinkedList;

public class linklistSwapTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testfilling() {
		LinkedList l=new LinkedList();
		l.pushFront(6);
		l.pushFront(2);
		l.pushFront(62);
		l.pushFront(54);
		l.pushFront(43);
		
		l.display();
		
		Assert.assertEquals(43, l.getkey(0));
	}
	@Test
	public void testswapping() {
		LinkedList l=new LinkedList();
		l.pushFront(6);
		l.pushFront(2);
		l.pushFront(62);
		l.pushFront(54);
		l.pushFront(43);
		
		l.display();
		l.swap();
		Assert.assertEquals(6, l.getkey(0));
	}
	@Test
	public void testswapping2() {
		LinkedList l=new LinkedList();
		l.pushFront(6);
		l.pushFront(2);
		l.pushFront(62);
		l.pushFront(54);
		l.pushFront(43);
		
		l.display();
		l.swap();
		Assert.assertEquals(43, l.getkey(4));
	}
}
