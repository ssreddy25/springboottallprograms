package jaxwsprograms;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface Hello {
	
	@WebMethod
	public String welcome(String name);
	
	@WebMethod
	public String bye(String name);

}
