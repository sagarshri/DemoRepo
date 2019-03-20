package nestedclasses;

// Anonymous Inner Class as Argument
// 1.  if a method accepts an object of an interface, an abstract class, or a concrete class, then we can implement the interface, extend the abstract class, and pass the object to the method. 
//     If it is a class, then we can directly pass it to the method.
// 2.  In all the three cases, you can pass an anonymous inner class to the method.

interface Message{
	String greet();
}

public class AnonymousInnerClassExample_2 {
	
	public void  printMessage(Message m) {
		System.out.println(m.greet());
	}

	 public static void main(String[] args) {
		AnonymousInnerClassExample_2 aobj1 = new AnonymousInnerClassExample_2();
		aobj1.printMessage(new Message() {
			
			@Override
			public String greet() {
				
				return "Hiiiii";
			}
		});
	}
}
