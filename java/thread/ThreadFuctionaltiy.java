package thread;

/**
 * 
 * @author su22034 1. Thread functionalities like getName, setName, getPriority,
 *         setPriority, sleep,yield, join etc. by creating threads using Thread
 *         Class and Runnable interface.
 *
 */
public class ThreadFuctionaltiy extends Thread  {
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("thread wait 2 seconds and strated");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("thread is stop");
	}
	
	

	public static void main(String[] args) {
		//print the thred name 
		System.out.println(Thread.currentThread().getName());
		//the set the thread name using a set name
		Thread.currentThread().setName("javathread ");
		System.out.println(Thread.currentThread().getName()); 
		
		Thread t1=new Thread();
		//by default will get  the priority of the thread
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		//after the setpriority
		System.out.println(t1.getPriority());
		
		//using a sleep()
		ThreadFuctionaltiy th=new ThreadFuctionaltiy();
		
		th.start();
		//using yield()
		
		
		
		

	}

}
