package collections;

import java.util.ArrayList;

// Prior to Java 2, Java provided adhoc classes such as Dictionary, Vector, Stack, and Properties to store and manipulate groups of objects. 
// Although these classes were quite useful, they lacked a central, unifying theme. 
// Thus, the way that you used Vector was different from the way that you used Properties


// The collections framework was designed to meet several goals, such as
// The framework had to allow different types of collections to work in a similar manner and with a high degree of interoperability.
// The framework had to extend and/or adapt a collection easily


// A collections framework is a unified architecture for representing and manipulating collections. All collections frameworks contain the following 
// - Interfaces. Eg: List, Set, Map, Enumeration etc.. 
// - Implementations, i.e. Class. Eg: ArrayList, HashMap, LinkedList, TreeMap, HashSet etc... 
// - Algorithm : methods that perform useful computations, such as searching and sorting, on objects that implement collection interfaces. 
//   The algorithms are said to be polymorphic: that is, the same method can be used on many different implementations of the appropriate collection interface

// ArrayList class extends AbstractList and implements the List interface. ArrayList supports dynamic arrays that can grow as needed.
public class ArrayList_1 {

	public static void main(String[] args) {
		// create an array list
	      ArrayList al = new ArrayList();
	      System.out.println("Initial size of al: " + al.size());

	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      System.out.println("Contents of al: " + al);
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      System.out.println("Size of al after additions: " + al.size());

	      // display the array list
	      System.out.println("Contents of al: " + al);

	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("Size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);

	}

}
