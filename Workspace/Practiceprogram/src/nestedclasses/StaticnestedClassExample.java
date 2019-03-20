package nestedclasses;

// 1. A static inner class is a nested class which is a static member of the outer class. 
//    It can be accessed without instantiating the outer class
// 2. Just like static members, a static nested class does not have access to the instance variables and methods of the outer class.

public class StaticnestedClassExample {
	int x;
	
	static class Nested_Demo {
	      public void my_method() {
	         System.out.println("This is my static nested class");
	         // System.out.println(x); -- It will be an error
	      }
	   }
	   
	   public static void main(String args[]) {
		   StaticnestedClassExample.Nested_Demo nested = new StaticnestedClassExample.Nested_Demo();	 
	      nested.my_method();
	   }

}
