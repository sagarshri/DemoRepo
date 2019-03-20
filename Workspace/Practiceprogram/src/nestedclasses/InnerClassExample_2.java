package nestedclasses;

// 1. Inner classes are also used to access the private members of a class (i.e Outer Class) from outside of the class.
// 2. Class is having private members to access them, then - 
//    - write an inner class in it, return the private members from a method within the inner class
//    - from another class (from which you want to access the private members) call the method of the inner class.
//    - To instantiate the inner class, initially you have to instantiate the outer class. 
//       Outer_Demo outer = new Outer_Demo();
//       Outer_Demo.Inner_Demo inner = outer.new Inner_Demo(); 

class OuterdemoClass{
	private int x=200;
	
	//Creating the inner class to return private number of outer class
	class InnerdemoClass{
		public int getNum() {
			System.out.println("Inside InnerdemoClass");
			return x;
		}
	}
}

public class InnerClassExample_2 {
      public static void main(String[] args) {
    	  OuterdemoClass outobj = new OuterdemoClass();
    	  OuterdemoClass.InnerdemoClass inobj = outobj.new InnerdemoClass();
    	  System.out.println(inobj.getNum());
    	}
	  
	  
}
