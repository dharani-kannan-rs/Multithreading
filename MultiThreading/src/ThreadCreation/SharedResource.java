package ThreadCreation;

public class SharedResource {

	
	boolean isAvailable = false;
	
	
	public synchronized void additem() {
		
		isAvailable =  true;
		System.out.println("producer thread calling notify method");
		notifyAll();

	}
	
	public synchronized void consumeitem() {
		System.out.println("Consumer thread inside consumeitem method");
		
		if(!isAvailable) {
			try {
				System.out.println("Consumer thread inside wait");

				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumer thread consumed the item");

		isAvailable = false;
	}
}
