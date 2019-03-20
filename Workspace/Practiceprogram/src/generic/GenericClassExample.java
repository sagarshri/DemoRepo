package generic;
 
// A generic class declaration looks like a non-generic class declaration, except that the class name is followed by a type parameter section.
// Type parameter section of a generic class can have one or more type parameters separated by commas. 
// These classes are known as parameterized classes or parameterized types because they accept one or more parameters.

public class GenericClassExample <y> {
	 
	private y x;
	
	public void update(y x) {
		this.x = x;
	}
	
	public y get() {
		return x;
	}

	public static void main(String[] args) {
		GenericClassExample<Integer> obj1 = new GenericClassExample<Integer>();
		obj1.update(new Integer(5));
		//obj1.update(10);
		System.out.println(obj1.get());
		
		GenericClassExample<String> obj2 = new GenericClassExample<String>();
		obj2.update(new String("hi........"));
		System.out.println(obj2.get());
		
	}

}
