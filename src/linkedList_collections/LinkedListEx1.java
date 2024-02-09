package linkedList_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

/**
 * Operations performing with linked list Linked list uses doubly linked list
 * internally Linked list can act as a list and queue as it implements both the
 * list and the deque interface
 */
public class LinkedListEx1 {
//	private static final Logger log = Logger.getLogger(LinkedListEx1.class.getName());

	public static void main(String args[]) {
		LinkedList<String> al = new LinkedList<String>();
		// Adding elements to linked list
		al.add("a");
		al.add("i");
		al.add("v");
		al.add("y");
		LinkedList<String> al2 = new LinkedList<String>();
		al2.add("dds");
		al2.add("Sss");
		al2.add("sssswwws");
		// Merging two lists
		al.addAll(al2);

		// Removing first element
		al.removeFirst();
		// Removing last element
		al.removeLast();
		al.removeFirstOccurrence("Ajay");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
//			log.info(itr.next());
			System.out.println(itr.next());
		}
//		log.info("After reversing");
		System.out.println();
		// To traverse the list of elements in reverse order
		Iterator<String> it = al.descendingIterator();
		while (it.hasNext()) {
//			log.info(it.next());
			System.out.println(it.next());
		}
	}
}
