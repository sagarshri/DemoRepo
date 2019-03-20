package practiceprograms;

//1. class acquires the properties (fields, methods, and nested classes) of another except private properties.
//   Constructors are not members, so they are not inherited but can be called from subclass using Super     
//2. extends is the keyword used to inherit the properties of a class
//3. Superclass reference variable can hold the subclass object, but using that variable you can access only the members of the superclass, 
//   so to access the members of both classes it is recommended to always create reference variable to the subclass.
//4. Use of Super keyword :
//   - Used to differentiate the members of superclass from the members of subclass, if they have same names.
//   - It is used to invoke the superclass constructor from subclass
//5. instanceof is used to check a reference to a Class(Object) 
//6. implements keyword is used with classes to inherit the properties of an interface
//7. IS-A relationship (using instanceof during extend and implements), HAS-A relationship (create a reference of a class inside another class)
//8. No multiple inheritance [Use interface for this]


public class InheritanceSuper {
	
	public int x;
	public int y;
	public int z;
	
	public InheritanceSuper(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void add(){
		int sum = x + y +z;
		System.out.println("Sum of three number is from InheritanceSuper : "+ sum);
	}

	public void multilication(){
		int mul = x * y * z;
		System.out.println("Product of three number is from InheritanceSuper : "+ mul);
	}
}
