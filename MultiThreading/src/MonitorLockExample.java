
public class MonitorLockExample {
	
	public synchronized void task1() {
		
		try {
			System.out.println("Inside task1...");
			Thread.sleep(1000);
			System.out.println("Completed task1...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void task2() {
		
		System.out.println("Outside sync task2..");
		
		synchronized(this) {
			
			System.out.println("Inside task2....");
		}
		
	}
	
	
	public void task3() {
		
		System.out.println("Inside task3...");
	}

}
