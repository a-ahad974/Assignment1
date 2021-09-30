package QueueTestcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import QueuewithLinkedList.Queue;
import junit.framework.Assert;

public class QueueLinkedList {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void Dequetest() {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		queue.display();
		Assert.assertEquals(10, queue.dequeue());	
	
	}

	@Test
	public void Fullstacktest() {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		queue.dequeue();
		Assert.assertEquals(20, queue.dequeue());	
	
	}
	@Test
	public void Dequeuetest() {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		Assert.assertEquals(-1, queue.dequeue());	
	
	}
}
