package LinkListTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CircularLinkedList.CircularLinkedList;
import LinkedList.LinkedList;
import junit.framework.Assert;

public class linklistTest {

	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void listfilling() {
		LinkedList l = new LinkedList();
		l.pushFront(10);
		l.pushFront(3);
		l.pushFront(8);
		l.pushFront(9);
		l.pushBack(20);
		l.display();
		
		Assert.assertEquals(8, l.getkey(1));
		
	}

	@Test
	public void listdeletionfromfront() {
		LinkedList l = new LinkedList();
		l.pushFront(10);
		l.pushFront(3);
		l.pushFront(8);
		l.pushFront(9);
		l.popFront();
		l.display();
		
		Assert.assertFalse(10==l.getkey(0));
		
	}
	
	@Test
	public void listdeletionfromback() {
		LinkedList l = new LinkedList();
		l.pushFront(10);
		l.pushFront(3);
		l.pushFront(8);
		l.pushFront(9);
		l.pushBack(20);
		l.popBack();
		l.display();
		System.out.println("csdsdcdv "+l.getkey(3));
		Assert.assertFalse(20==l.getkey(3));
		
	}
	
	@Test
	public void simplepop() {
		LinkedList l = new LinkedList();
		l.pushFront(10);
		l.pushFront(3);
		l.pushFront(8);
		l.pushFront(9);
		l.pushBack(20);
		l.pop(0);
		l.display();
		System.out.println("csdsdcdv "+l.getkey(1));
		Assert.assertFalse(9==l.getkey(1));
		
	}
}
