package jaxwsprograms;

import javax.jws.WebService;

@WebService(endpointInterface="jaxwsprograms.Hello")
public class HelloImplementaing implements Hello {
	

	public String welcome(String name) {
		
		
		return "WELCOME TO OJAS INVOATIVE TECHNOLOGIES MR:"+name;
	}

	public String bye(String name) {
		
		return "happy journy Mr:"+name;
	}

}
