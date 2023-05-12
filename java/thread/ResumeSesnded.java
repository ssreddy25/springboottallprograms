package thread;

public class ResumeSesnded extends Thread{
	 public void run()  
	    {    
	        for(int i=1; i<5; i++)  
	        {    
	            try  
	            {  
	                // thread to sleep for 500 milliseconds  
	                 sleep(2000);  
	                 System.out.println(Thread.currentThread().getName());    
	            }catch(InterruptedException e){System.out.println(e);}    
	            System.out.println(i);    
	        }    
	    }    

	public static void main(String[] args) {
		
		 ResumeSesnded  resumeSesnded0=new  ResumeSesnded();
		 ResumeSesnded  resumeSesnded1=new  ResumeSesnded();
		 ResumeSesnded  resumeSesnded2=new  ResumeSesnded();
		 resumeSesnded0.start();
		 resumeSesnded1.start();
		 resumeSesnded1.suspend(); // suspend t1 thread   
	        // call run() method   
		 resumeSesnded2.start();   
		 resumeSesnded1.resume(); // resume t1 thread  
	}

}
