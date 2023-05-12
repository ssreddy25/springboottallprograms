package jaxwsdocmenttype;

import javax.xml.ws.Endpoint;

public class PublisherDoc {

	public static void main(String[] args) {
		
		Endpoint ee=Endpoint.create("http://localhost:8080/ws/doctype", new hellodocotypeImplem() );
		
		System.out.println(ee.isPublished());

	}

}
