package practiceprograms;

public class OverriddingtestMain extends Overriddingtest{
	
	public void move() {
		super.move();
		System.out.println("Calling move from OverriddingtestMain");
	}
	
	public void run() {
		System.out.println("calling run from OverriddingtestMain");
	}

	public static void main(String[] args) {
		OverriddingtestMain om = new OverriddingtestMain(); //OverriddingtestMain refence and object
		om.move(); // call move from OverriddingtestMain
		om.run(); // call run from OverriddingtestMain
		
		Overriddingtest otm = new Overriddingtest(); // Overriddingtest refence and object
        otm.move();//call move from Overriddingtest
        
        Overriddingtest otm1 = new OverriddingtestMain() ; // Overriddingtest refence and OverriddingtestMain object
        otm1.move(); //call run from OverriddingtestMain ---- Compile time check for move from Overriddingtest and run time check for move from OverriddingtestMain
       // otm1.run(); ---  Compile check failed.   
	}

	//It is important to know that the only possible way to access an object is through a reference variable. A reference variable can be of only one type. Once declared, the type of a reference variable cannot be changed.

	//The reference variable can be reassigned to other objects provided that it is not declared final. The type of the reference variable would determine the methods that it can invoke on the object.

	// A reference variable can refer to any object of its declared type or any subtype of its declared type. A reference variable can be declared as a class or interface type.
	 /*ex : 
	 public interface Vegetarian{}
	 public class Animal{}
	 public class Deer extends Animal implements Vegetarian{}
	 Deer d = new Deer();
	 Animal a = d
	 Vegetarian v = d;*/
}
