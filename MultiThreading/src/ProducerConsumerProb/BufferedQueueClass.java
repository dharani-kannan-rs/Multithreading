package ProducerConsumerProb;

import java.util.LinkedList;
import java.util.Queue;

public class BufferedQueueClass {
	
	Queue<Integer> queue;
	int maxsize;
	
	
	public BufferedQueueClass(int maxsize) {
		this.queue=  new LinkedList<>();
		this.maxsize = maxsize;
		
	}
	
	
	public synchronized void produceQueue(Integer num) {
		System.out.println("Inside the produceQueue");
		if(queue.size()< maxsize) {
		queue.add(num);
		System.out.println("Added in queue" + queue);}
		else {
	     	System.out.println("Does not produced");

		}
	}

	
	public synchronized void consumeQueue() {
		System.out.println("Inside the ConsumeQueue");
		if(!queue.isEmpty()) {
		queue.poll();
		System.out.println("Consumed in queue" + queue);
		}
		else {
			System.out.println("Does not consumed");

		}
	}
}
