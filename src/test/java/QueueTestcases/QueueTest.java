package QueueTestcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import QueueImplementation.Queue;
import junit.framework.Assert;

public class QueueTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void sizetest() throws Exception {
		Queue queue = new Queue(5); //create queue of size=5.
		queue.enqueue(10);
		queue.enqueue(12);
		queue.enqueue(14);
		queue.enqueue(16);
		queue.enqueue(18);
		
		queue.display();
		Assert.assertEquals(5, queue.size());
		
	}
	@Test
	public void dequeueTest() throws Exception {
		Queue queue = new Queue(5); //create queue of size=5.
		queue.enqueue(10);
		queue.enqueue(12);
		queue.enqueue(14);
		queue.enqueue(16);
		queue.enqueue(18);
		
		queue.display();
		Assert.assertEquals(10, queue.dequeue());
		
	}
	
	@Test
	public void Emptytest() throws Exception {
		Queue queue = new Queue(5); //create queue of size=5.
		queue.display();
		Assert.assertEquals(true, queue.empty());
		
	}
	
	@Test
	public void emptyTestneg() throws Exception {
		Queue queue = new Queue(1); //create queue of size=5.
		queue.enqueue(3);
		Assert.assertEquals(false, queue.empty());
		
	}
	
}
