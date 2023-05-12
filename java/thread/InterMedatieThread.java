package thread;

class Customers{
	public double balance=10000;
	public synchronized void withdraw(double amount){
		if(balance>=amount){
			balance-=amount;
			System.out.println("updated balance is a :"+ balance);
		}
		else{
			System.out.println("depoist the balance and insufisunt bance  wait and continue");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance-=amount;
		System.out.println("updated balance is a :"+ balance);
		
	}
	public synchronized void deposit(double amount){
		System.out.println("befor update the balance :"+balance);
		balance+=amount;
		System.out.println("after the update the balcnce :"+balance);
		System.out.println("suessfully completed the deposit");
		notify();
	}
}
public class InterMedatieThread {

	public static void main(String[] args) {
		
		 final Customers customers=new Customers();
		Thread t1=new Thread(){
			public void run(){
				customers.withdraw(15000);;
			}
		};
		t1.start();
		Thread t2=new Thread(){
			public void run(){
				customers.deposit(20000);
			}
			
		};
		t2.start();
		
		

	}

}
