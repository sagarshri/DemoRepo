package practiceprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//1. Exception occurs, the normal flow of the program is disrupted and the program/Application terminates abnormally
//2. Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.

// Checked Exception - Compile time exception and can not be ignored
// Unchecked Exception - Run time exception and can we ignored at compile time (it is a programmer error)
// Error - Problems that arise beyond the control of the user or the programmer. eg - stack overflow

// A method catches an exception using a combination of the try and catch
// A try/catch block is placed around the code that might generate an exception. Code within a try/catch block is referred to as protected code
// Every try block should be immediately followed either by a catch block or finally block.
// A catch statement involves declaring the type of exception you are trying to catch
// A try block can be followed by multiple catch blocks.
// If an exception occurs in the protected code, the exception is thrown to the first catch block in the list. This continues until the exception 
//    either is caught or falls through all catches, in which case the current method stops execution and the exception is thrown down to the previous method on the call stack.
   
// Throws - If a method does not handle a checked exception, the method must declare it using the throws keyword
//          throws is used to postpone the handling of a checked exception 
//         if throws more than one exception, then declared in a list separated by commas.

//Throw - You can throw an exception, either a newly instantiated one or an exception that you just caught, by using the throw keyword.
//        throw is used to invoke an exception explicitly.

//Finally - finally block follows a try block or a catch block. A finally block of code always executes, irrespective of occurrence of an Exception.

/*- A catch clause cannot exist without a try statement.
- It is not compulsory to have finally clauses whenever a try/catch block is present.
- The try block cannot be present without either catch clause or finally clause.
- Any code cannot be present in between the try, catch, finally blocks.*/



public class Exceptiontest {

	public static void main(String[] args) throws FileNotFoundException  {
		
		// Accessing file is a Checked exception and need to handle 
		FileInputStream in = new FileInputStream("E:\\Workspace\\input.txt");
		
		// Below is try-with-resources, where we initialize the resources inside try and got closed automatically
		try(FileOutputStream out = new FileOutputStream("E:\\Workspace\\output.txt")){
		
		int c;
		while ((c = in.read())!=-1) {
			System.out.println(c);
			
				out.write(c);
		}
		}
			catch (Exception e) {
				e.printStackTrace();
			}
		
		
		// Accessing the num[4] is unchecked exception for ArrayIndexOutOfBoundsException
		int [] num = {3,4,5,6};
		try {
			for(int i=0; i<=4; i++){
				System.out.println(num[i]);
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
