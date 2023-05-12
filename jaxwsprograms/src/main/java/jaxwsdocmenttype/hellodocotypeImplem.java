package jaxwsdocmenttype;

import javax.jws.WebService;

@WebService(endpointInterface="jaxwsdocmenttype.Heloodoctype")
public class hellodocotypeImplem implements Heloodoctype {

	public String welcome(String name) {
	
		return "welcome to java name mr:"+name;
	}

}
