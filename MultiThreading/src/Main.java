
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MonitorLockExample obj = new MonitorLockExample();
		
		RunnableObj runObj = new RunnableObj(obj);
		
        Thread t1 = new Thread(runObj);
        Thread t2 = new Thread(() -> obj.task2());
        Thread t3 = new Thread(() -> obj.task3());
        
        t1.start();
        t2.start();
        t3.start();
		
	}

}

