package collections;

import java.util.LinkedHashSet;

// This class extends HashSet, but adds no members of its own.
// LinkedHashSet maintains a linked list of the entries in the set, in the order in which they were inserted. 
// This allows insertion-order iteration over the set.


public class LinkedHashSetExample_4 {

	public static void main(String[] args) {
		// create a hash set
	      LinkedHashSet hs = new LinkedHashSet();
	      
	      // add elements to the hash set
	      hs.add("B");
	      hs.add("A");
	      hs.add("D");
	      hs.add("E");
	      hs.add("C");
	      hs.add("F");
	      System.out.println(hs);

	}

}
