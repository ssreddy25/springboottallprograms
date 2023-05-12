package pojoclass;

import java.util.ArrayList;
import java.util.List;

public class Sam {
	
       public String fristName;
       public String lastName;
       
       List<String> sams;
       
       public Sam() {
    	   
       }
       
      
       
       public String samaccount(String fristName, String lastName) {
    	   
    	   
    	   String las=lastName.substring(0, 3);
    	   String frist=fristName.substring(0, 2);
    	   String smasaccount=las+frist;
    	   
    	   sams=new ArrayList<>();
    	   if(sams.size()!=0) {
    		   sams.add(smasaccount+""+01);
    	   }else {
    		   
//    		   sams.stream().filter(s->s.sub)
    	   }
    	   
    	   
    	   
    	   
    	   return "";
       }

	public static void main(String[] args) {
		
	}

}
