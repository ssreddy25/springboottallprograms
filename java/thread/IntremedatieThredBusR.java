package thread;



class Bus {
	public int seats = 1;
	

	public synchronized void reseravation(int seat) {
		if (seats >= seat) {
			seats -= seat;
			System.out.println("seats are booked");
			System.out.println("remaing seats are :" + seats);
		} else {
			System.out.println("seats are not avilable wiat and continue");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		seats -= seat;
		System.out.println("seats are booked : "+seat);
		System.out.println("remaing seats are :" + seats);
	}

	public synchronized void canselation(int seat) {
		System.out.println("befor seats are :" + seats);
		seats += seat;
		System.out.println("seat are cancelled :" + seat);
		System.out.println("after the cancelled avilible seats are: " + seats);
		notify();
	}

}

public class IntremedatieThredBusR {

	public static void main(String[] args) {
		
		
		
		
		
		final Bus b=new Bus();
		Thread t1=new Thread(){
			public void run(){
				
				b.reseravation(4);
			}
			
		};
		t1.start();
		Thread t2=new Thread(){
			public void run(){
				b.canselation(70);
			}
		};
		t2.start();

	}

}
