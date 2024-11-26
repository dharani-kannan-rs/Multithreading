package Locks;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

	
	boolean isAvailable = false;
	
	
	
	public void additem(ReentrantLock lock) {
		
		
		try {
			
			lock.lock();
			isAvailable =  true;
			System.out.println("Lock acquired by"  + Thread.currentThread().getName());
			Thread.sleep(4000);
		
		}
		
		catch(Exception e){
			
		}
		
		finally {
			lock.unlock();
			System.out.println("Lock released by"  + Thread.currentThread().getName());

		}

	}
}
