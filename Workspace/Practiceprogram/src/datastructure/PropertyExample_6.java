package datastructure;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

// Properties is a subclass of Hashtable. It is used to maintain lists of values in which the key is a String and the value is also a String
// Properties class is used by many other Java classes. For example, --  System.getProperties( ) when obtaining environmental values.

public class PropertyExample_6 {

	public static void main(String[] args) {
		Properties capitals = new Properties();
	     
	      String str;
	      
	      capitals.put("Illinois", ((Integer)4).toString());
	      capitals.put("Missouri", "Jefferson City");
	      capitals.put("Washington", "Olympia");
	      capitals.put("California", "Sacramento");
	      capitals.put("Indiana", "Indianapolis");
	      capitals.setProperty("sagar", "shrivastava");

	      // Show all states and capitals in hashtable using SET and Iterator
	      Set states = capitals.keySet();   // get set-view of keys
	      Iterator itr = states.iterator();
	      while(itr.hasNext()) {
	         str = (String) itr.next();
	         System.out.println("The capital of " + str + " is " + 
	            capitals.getProperty(str) + ".");
	      }     
	      System.out.println();
	      
	      //Show all states and capitals in hashtable using Enumeration
	      Enumeration k = capitals.keys();
	      while (k.hasMoreElements()) {
			str = (String) k.nextElement();
			System.out.println("The capital of " + str + " is " + 
		            capitals.getProperty(str) + ".");
			
		}

	      // look for state not in list -- specify default
	      str = capitals.getProperty("Florida", "Not Found");
	      System.out.println("The capital of Florida is " + str + ".");
	      
	      capitals.list(System.out);

	}

}
