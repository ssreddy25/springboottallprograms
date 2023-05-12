package xmlandwebserviesc;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParser {

	public static void main(String[] args) {
		
		try {
			File inputFile=new File("C:\\Users\\su22034\\xmlandwebservices\\xmlandwebserviesc\\src\\main\\resources\\student.xml");
			
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbbulider=factory.newDocumentBuilder();
			
			Document doc=dbbulider.parse(inputFile); 
			
  		    doc.getDocumentElement().normalize();
			
			System.out.println("root element is :"+doc.getDocumentElement().getNodeName());
			
			NodeList nodeList=doc.getElementsByTagName("student");
			
			// nodeList is not iterable, so we are using for loop  
			for(int i=0; i<nodeList.getLength();i++){
				
				Node node=nodeList.item(i);
				
				System.out.println("node name:"+node.getNodeName());
				System.out.println(node.getNodeType());
				System.out.println( Node.ELEMENT_NODE);
				
				if (node.getNodeType() == Node.ELEMENT_NODE)   
				{  
					Element  elemnt=(Element) node;
					
					
					System.out.println("studentId:"+ elemnt.getElementsByTagName("id").item(0).getTextContent());
					System.out.println("studentName:"+elemnt.getElementsByTagName("name").item(0).getTextContent());
					System.out.println("studentCourse:"+elemnt.getElementsByTagName("course").item(0).getTextContent());
					
				}
				
				
				
				
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
