package collections;

import java.util.HashSet;

// HashSet extends AbstractSet and implements the Set interface. It creates a collection that uses a hash table for storage.
// A hash table stores information by using a mechanism called hashing. In hashing, the informational content of a key is used to determine a unique value, called its hash code.

public class HashSetExample_3 {

	public static void main(String[] args) {
		 // create a hash set
	      HashSet hs = new HashSet();
	      
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
