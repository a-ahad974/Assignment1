package QueueTestcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import QueuewithArray.Queue;
import junit.framework.Assert;

public class QueueArrayTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void Dequeuetest() {
	
		Queue queue = new Queue(5); //create a queue 
		queue.enqueue(10); //add num = 10
		queue.enqueue(20); //add num = 20
		queue.enqueue(30); //add num = 30
		queue.enqueue(40); //add num = 40 
		queue.enqueue(50); //add num = 50		
		queue.display();   //display queue.
		
		Assert.assertEquals(10, queue.dequeue());

	}

	@Test
	public void fullQueuetest() {
	
		Queue queue = new Queue(5); //create a queue 
		queue.enqueue(10); //add num = 10
		queue.enqueue(20); //add num = 20
		queue.enqueue(30); //add num = 30
		queue.enqueue(40); //add num = 40 
		queue.enqueue(50); //add num = 50		
		queue.enqueue(60); //add num = 50		
		queue.display();   //display queue.
		queue.dequeue();
		Assert.assertEquals(20, queue.dequeue());

	}
}
