package multithreading;

public class Multithreading_Demo1 {
	
	
	
public static void main(String[] args) throws InterruptedException {
	
	Thread thread = new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("New thread started");
			
		}
		
	}); 
	
	System.out.println("Thread name is "+ Thread.currentThread().getName() + " Before starting a new Thread");
	thread.start();
	System.out.println("Thread name is "+ Thread.currentThread().getName() + " After starting a new Thread");
	Thread.sleep(1000);
	
}

}
