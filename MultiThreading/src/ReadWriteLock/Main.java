package ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

	public static void main(String[] args) {

		ReadWriteLock lock = new ReentrantReadWriteLock();

		
		SharedResource resource1 = new SharedResource();
		
		Thread t1 = new Thread(() ->{
			
			resource1.additem(lock);
		});
		
		
		
		Thread t2 = new Thread(() ->{
			
			resource1.additem(lock);
		});
		
		
        SharedResource resource2 = new SharedResource();

        Thread t3 = new Thread(() ->{resource2.consume(lock);});
        
		
		t1.start();
		t2.start();
		t3.start();
	}

} 
