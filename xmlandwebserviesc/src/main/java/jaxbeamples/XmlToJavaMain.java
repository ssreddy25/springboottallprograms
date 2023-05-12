package jaxbeamples;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToJavaMain {

	public static void main(String[] args) {
		
		try {
			File file=new File("C:\\Users\\su22034\\xmlandwebservices\\xmlandwebserviesc\\src\\main\\resources\\Student1.xml");
			
			
			JAXBContext jaxbContex=JAXBContext.newInstance(Student.class);
			
			
			
			Unmarshaller  jaxbUNm=jaxbContex.createUnmarshaller();
			
//			Student e=(Student) jaxbUNm.unmarshal(file);
			Student e=(Student)jaxbUNm.unmarshal(file);
			
			System.out.println(e);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
