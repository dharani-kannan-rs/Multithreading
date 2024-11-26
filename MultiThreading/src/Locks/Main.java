package Locks;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) {

		ReentrantLock lock = new ReentrantLock();

		
		SharedResource resource1 = new SharedResource();
		
		Thread t1 = new Thread(() ->{
			
			resource1.additem(lock);
		});
		
		
        SharedResource resource2 = new SharedResource();
		
		Thread t2 = new Thread(() ->{
			
			resource2.additem(lock);
		});
		
		
		t1.start();
		t2.start();
	}

} 
