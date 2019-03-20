package datastructure;

import java.util.HashMap;
import java.util.Map;

// Dictionary is an abstract class that represents a key/value storage repository and operates much like Map.
// The Dictionary class is obsolete. You should implement the Map interface
// Map interface maps unique keys to values. A key is an object that you use to retrieve a value at a later date.
// Map has its implementation in various classes like HashMap

public class MapExample_4 {
	 public static void main(String[] args) {
	      Map m1 = new HashMap(); 
	      m1.put("Zara", 8);
	      m1.put("Mahnaz", "31");
	      m1.put("Ayan", "12");
	      m1.put("Daisy", "14");
	      
	      m1.remove("Mahnaz");

	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1);
	      m1.clear();
	      System.out.println(" \n Map Elements");
	      System.out.print("\t" + m1);
	      
	   }
}