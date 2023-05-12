package jaxwsprograms;

import javax.xml.ws.Endpoint;

public class ProducersServies {

	public static void main(String[] args) {
		
		 Endpoint p=Endpoint.publish("http://localhost:8080/ws/hello", new HelloImplementaing());  
		 
		 System.out.println(p);
	}

}
