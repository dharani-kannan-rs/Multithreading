
public class RunnableObj implements Runnable{

	MonitorLockExample obj;
	
	RunnableObj(MonitorLockExample obj){
		this.obj = obj;
	}
	
	
	@Override
	public void run() {

		obj.task1();
		
	}

}
