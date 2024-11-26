package ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

	
	boolean isAvailable = false;
	
	
	
	public void additem(ReadWriteLock lock) {
		
		
		try {
			
			lock.readLock().lock();
			System.out.println("Lock acquired by read"  + Thread.currentThread().getName());
			Thread.sleep(8000);
		
		}
		
		catch(Exception e){
			
		}
		
		finally {
			lock.readLock().unlock();
			System.out.println("Lock released by read"  + Thread.currentThread().getName());

		}

	}
	
   public void consume(ReadWriteLock lock) {
		
		
		try {
			
			lock.writeLock().lock();
			isAvailable =  true;
			System.out.println("Lock acquired by write"  + Thread.currentThread().getName());
		
		}
		
		catch(Exception e){
			
		}
		
		finally {
			lock.writeLock().unlock();
			System.out.println("Lock released by write"  + Thread.currentThread().getName());

		}

	}
}
