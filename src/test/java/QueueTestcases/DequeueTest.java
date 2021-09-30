package QueueTestcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import DequeueImplementation.Dequeue;
import junit.framework.Assert;

public class DequeueTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Dequeue queue = new Dequeue(5);
		queue.addRight(10);
		queue.addRight(12);
		queue.display();
		Assert.assertEquals(12, queue.getvalue(3));
	}

	@Test
	public void test2() {
		Dequeue queue = new Dequeue(5);
		queue.addLeft(10);
		queue.addLeft(3);
		queue.display();
		Assert.assertEquals(3, queue.getvalue(1));
	}
}
