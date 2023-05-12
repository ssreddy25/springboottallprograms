package jaxbeamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaToXmlMain {

	public static void main(String[] args) {
		
		try {
			JAXBContext jaxbContex=JAXBContext.newInstance(Student.class);
			
			Marshaller marshaller=jaxbContex.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
			   
			Student stu=new Student(1,"VimalJaiswal","java");  
			      
			marshaller.marshal(stu, new FileOutputStream("C:\\Users\\su22034\\xmlandwebservices\\xmlandwebserviesc\\src\\main\\resources\\Student3.xml"));
			System.out.println("done");
		} catch (FileNotFoundException | JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		

	}

}
