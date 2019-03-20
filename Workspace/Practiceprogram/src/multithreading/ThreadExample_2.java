package multithreading;

public class ThreadExample_2 extends Thread{
	
	private String message;
	Thread t;
	
	public ThreadExample_2(String message) {
		this.message=message;
		System.out.println("creating : " + message);
	}
	
	
	@Override
	public void run() {
		for(int i=0; i<6; i++){
			System.out.println("Running Thread is : " + t.getName() + " \tLoop is at :" + i );
		}	
	}
	
	public void createThread() {
		t = new Thread(this);
		t.start();
	}

	public static void main(String[] args) {
      
		ThreadExample_2 empobj1 = new ThreadExample_2("Thread1");
		empobj1.createThread();
		
		ThreadExample_2 empobj2 = new ThreadExample_2("Thread2");
		empobj2.createThread();

	}

}
