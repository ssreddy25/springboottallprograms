package collectionAssignent;

import java.util.LinkedList;

/**
 * 
 * @author su22034 8. Program to create linked list of integer objects and do
 *         following operations:Add element to 1st position.Delete last
 *         element.
 *
 */
public class Assing7 {

	public static void main(String[] args) {
     LinkedList <Integer> ll= new LinkedList<Integer>();
     ll.add(0, 12);
     ll.add(1, 121);
     ll.add(2, 122);
     ll.add(3, 123);
     ll.add(4, 126);
     System.out.println(ll);
     //add ing the linked list into the first position using the addfrist
     ll.addFirst(1256);
     System.out.println("adding the frist position of the list");
     System.out.println(ll);
    System.out.println("remove the last elment of the linked list");
    ll.removeLast();
    System.out.println(ll);
	}

}
