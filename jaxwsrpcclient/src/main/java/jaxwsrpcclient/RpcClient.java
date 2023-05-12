package jaxwsrpcclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import jaxwsprograms.Hello;



public class RpcClient {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url=new URL("http://localhost:8080/ws/hello?wsdl");
		
		QName q=new QName("http://jaxwsprograms/", "HelloImplementaingService");
		
	     
		Service s=Service.create(url, q);
		
		 Hello h=(Hello) s.getPort(Hello.class);
		 
		 System.out.println(h.welcome("siva"));
		 
		 System.out.println(h.bye("reddy uppaluru"));
		
	
	

	}

}
