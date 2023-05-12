package thread;

/**
 * 
 * @author su22034
 *
 *         6. Display name and priority of current thread. Change name of Thread
 *         toMyThread and set priority to 2 and display it on screen.
 *
 */
public class Assignment6 {

	public static void main(String[] args) {
		//didplay the current thread name
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("siva thread");
		//using setname
		System.out.println(Thread.currentThread().getName());
		//set the thread priotity
		Thread.currentThread().setPriority(2);
		System.out.println(Thread.currentThread().getPriority());

	}

}
