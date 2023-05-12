package thread;

class MovieBooking {
	public int bookTickets = 50;

	public synchronized void bookTicket(int ticket) {
		if (bookTickets >= ticket) {
			bookTickets -= ticket;
			System.out.println("tickets are booked ");
			System.out.println("available tickets is a: " + bookTickets);
		} else {
			System.out.println("tickets are not available wait for cancel tickets and continue");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		bookTickets -= ticket;
		System.out.println("tickets are booked :"+ ticket);
		System.out.println("available tickets is a: " + bookTickets);
	}
	public synchronized void cancealTicket(int ticket ){
		System.out.println("before cancel tickets available :"+bookTickets);
		bookTickets+=ticket;
		System.out.println("after tickets the cancel the  available :"+ bookTickets);
		notify();
		
		
	}
	
}

	
	

public class InterMedaiteMovie {

	public static void main(String[] args) {
		MovieBooking mb=new MovieBooking();
		Thread t1=new Thread(){
			public void run(){
				mb.bookTicket(20);
			}
		};
		t1.start();
		Thread t2=new Thread(){
			public void run(){
				mb.cancealTicket(100);
			}
			
		};
		t2.start();
		
	}

}
