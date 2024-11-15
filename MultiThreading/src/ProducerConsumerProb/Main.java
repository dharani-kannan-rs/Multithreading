package ProducerConsumerProb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		BufferedQueueClass queue = new BufferedQueueClass(10);
		Thread t1 = new Thread(() -> {
			List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		
			for(int num:nums) {
			queue.produceQueue(num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
		
		});
		Thread t2 = new Thread(() -> {
			for(int i = 0; i<=5; i++) {
			
			queue.consumeQueue();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
			});
		t1.start();
		t2.start();
	}

}
