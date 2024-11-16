package ThreadCreation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SharedResource resource = new SharedResource();
        
        Thread producertask = new Thread(() -> {
//        	try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
        	resource.additem();
        	});
        
        Thread consumetask = new Thread(() -> resource.consumeitem());
        
        producertask.start();
        consumetask.start();

	}

}
