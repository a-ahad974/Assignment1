package LinkListTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CircularLinkedList.CircularLinkedList;
import junit.framework.Assert;

public class CircularLinklistTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void listfilling() {
		CircularLinkedList cl=new CircularLinkedList();
		cl.pushFront(10);
		cl.pushFront(3);
		cl.pushFront(8);
		cl.pushFront(9);
		cl.pushBack(20);
		cl.display();
	
		Assert.assertEquals(8, cl.getkey(1));
		
	}

	@Test
	public void listdeletionfromfront() {
		CircularLinkedList cl=new CircularLinkedList();
		cl.pushFront(10);
		cl.pushFront(3);
		cl.pushFront(8);
		cl.pushFront(9);
		cl.popFront();
		cl.display();
	
		Assert.assertFalse(10==cl.getkey(0));
		
	}
	
	@Test
	public void listdeletionfromback() {
		CircularLinkedList cl=new CircularLinkedList();
		cl.pushFront(10);
		cl.pushFront(3);
		cl.pushFront(8);
		cl.pushFront(9);
		cl.pushBack(20);
		cl.popBack();
		cl.display();
		
		Assert.assertFalse(20==cl.getkey(4));
		
	}
}
