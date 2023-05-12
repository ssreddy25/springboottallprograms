package collectionAssignent;

/**
 * 
 * 
 * 2.  Demonstrate the hasNext, next() and remove() methods of Iterator 
 * interface.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java");
		al.add("c++");
		al.add("c");
		al.add("c#");
		al.add("paython");
		al.add("ruby");
		al.add("rangith");
		// using cursor iterator
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		// Iterator it1=al.iterator();
		// while(it1.hasNext()){
		// System.out.println("remove the elements in arrylist using remove
		// method");
		//
		//
		//
		// }
	}
}
