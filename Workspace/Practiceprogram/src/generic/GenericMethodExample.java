package generic;

// Java Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of related methods, or with a single class declaration, a set of related types, respectively.
// Generic's also provide compile-time type safety that allows programmers to catch invalid types at compile time.

// All generic method declarations have a type parameter section delimited by angle brackets (< and >) that precedes the method's return type
// Each type parameter section contains one or more type parameters separated by commas. A type parameter, also known as a type variable, is an identifier that specifies a generic type name.
// Type parameters can be used to declare the return type and act as place holders for the types of the arguments passed to the generic method, which are known as actual type arguments.
// A generic method's body is declared like that of any other method. Note that type parameters can represent only reference types, not primitive types (like int, double and char).

public class GenericMethodExample {
	
	public static <E> void printArray ( E [] inputArray) {
		
		// Display array elements
	      for(E element : inputArray) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	}

	public static void main(String[] args) {
		Integer [] intArray = {1,2,3,4,5,6};
		printArray(intArray);
		
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		printArray(doubleArray);
		
	    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	    printArray(charArray);

		}

}
