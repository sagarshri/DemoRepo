package nestedclasses;

// 1. You just need to write a class within a class. 
// 2. Unlike a class, an inner class can be private and once you declare an inner class private, it cannot be accessed from an object outside the class

class OuterClass {

	int num;

	// Creating a private inner class 
	private class class1 {
		public void printMessage() {
			System.out.println("Hi....i am inside the inner class");
		}
	}

	// Accessing the inner class from the method within the OuterClass
	public void accessInnerClass() {
		class1 obj1 = new class1();
		obj1.printMessage();
	}
}

public class InnerClassExample_1 {
	public static void main(String[] args) {
		OuterClass inObj = new OuterClass();
		inObj.accessInnerClass();
	}

}
