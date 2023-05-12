package jdbcjaxwsrpctype;

import javax.xml.ws.Endpoint;

public class PubliserServiesss {

	public static void main(String[] args) {
		
		System.out.println("sss");
	
		Endpoint ee=Endpoint.publish("http://localhost:8080/ws/employee", new EmployeeImplmenting());
		
		System.out.println("sss");
		System.out.println(ee);

	}

}
