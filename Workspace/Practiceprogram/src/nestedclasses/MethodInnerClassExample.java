package nestedclasses;

// 1. IN Java, we can write a class within a method and this will be a local type. 
//    Like local variables, the scope of the inner class is restricted within the method
// 2. A method-local inner class can be instantiated only within the method

public class MethodInnerClassExample {
	
	public void method() {
		int num=20;
		// Creating a class within a method
		class MethodInnerClass{
			public void display() {
				System.out.println("Hi....this is method innre class");
				System.out.println("value of num is : " + num);
			}
		}
		
		MethodInnerClass mic = new MethodInnerClass();
		mic.display();
	}
	
	public static void main(String[] args) {
		MethodInnerClassExample mice = new MethodInnerClassExample();
		mice.method();
	}

}
