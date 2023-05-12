package collectionAssignent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * @author su22034 6. Write program to accept names of n cities, insert the same
 *         into Arraylistcollection and display the content of the same array
 *         list and remove theseelements.
 *
 */

class City {
  public String cityName;
  
  

public City(String cityName) {
	
	this.cityName = cityName;
}



@Override
public String toString() {
	return "City [cityName=" + cityName + "]";
}
  
}
public class Assign6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of the city names");
		int number=sc.nextInt();
		ArrayList<City> al=new ArrayList<City>();
		System.out.println("enter the city names ");
		for(int i=1;i<=number;i++){
			al.add(new City(sc.next()));
		}
		Iterator it=al.iterator();
		System.out.println("before removing the elements ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//removing the objects paticlar indexpostion
		al.remove(1);
		al.remove(4);
		
		System.out.println("after the  removing the elements ");
	
		Iterator it1=al.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		

	}

}
