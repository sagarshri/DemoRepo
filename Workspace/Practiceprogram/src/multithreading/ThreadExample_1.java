package multithreading;

// 1. A multi-threaded program contains two or more parts that can run concurrently and each part can handle a different task 
//    at the same time making optimal use of the available resources specially when your computer has multiple CPUs.
// 2. Multitasking is when multiple processes share common processing resources such as a CPU.
// 3. Multi-threading extends the idea of multitasking into applications where you can subdivide specific operations within 
//    a single application into individual threads. Each of the threads can run in parallel. The OS divides processing time 
//    not only among different applications, but also among each thread within an application.
// 4. Thread Stages : new(born), runnable, waiting, dead(terminate)

// 5. Two way to use thread
//    - Implementing the Runnable interface --- ThreadExample_1.java
//        Step1 : implement a run() method
//        Step2 : Instantiate Thread object(instance of a class that implements the Runnable interface)
//        Step3 : call start() method, which executes a call to run( ) method
//    - Extend the Thread class  --- ThreadExample_2.java
//        Step1 : implement a run() method
//        Step2 : Instantiate Thread object(instance of a class that implements the Runnable interface)
//        Step3 : call start() method, which executes a call to run( ) method

public class ThreadExample_1 implements Runnable{
	
	private String message;
	Thread t;
	
	public ThreadExample_1(String message) {
		this.message=message;
		System.out.println("creating : " + message);
	}
	
	
	@Override
	public void run() {
		for(int i=0; i<4; i++){
			System.out.println("Running Thread is : " + t.getName() + " \tLoop is at :" + i );
		}	
	}
	
	public void createThread() {
		t = new Thread(this, message);
		t.start();
	}

	public static void main(String[] args) {
      
		ThreadExample_1 empobj1 = new ThreadExample_1("Thread1");
		empobj1.createThread();
		
		ThreadExample_1 empobj2 = new ThreadExample_1("Thread2");
		empobj2.createThread();

	}

	

}
