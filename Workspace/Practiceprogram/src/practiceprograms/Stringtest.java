package practiceprograms;

//1. String is a sequence of characters.
//2. Whenever it encounters a string literal in your code, the compiler creates a String object with its value
//3. We can create String objects by using the new keyword and a constructor.  
//4. String class has 11 constructors that allow you to provide the initial value of the string using different sources, such as an array of characters.
//5. String class is immutable, so that once it is created a String object cannot be changed. If there is a necessity to make a lot of modifications to Strings of characters, 
//     then we should use String Buffer & String Builder
//6. StringBuilders methods are not thread safe (not synchronised) but faster.

public class Stringtest {

	public static void main(String[] args) {
		char helloArray [] = {'h','e','l','l','o'};
		String name = "sagar";
		String helloString = new String(helloArray);
		System.out.println("My name is : " + name + "....Wanted to say " + helloString + " to everyone");
		System.out.println("length of the name is : "+ name.length() + "\nlength of helloarray is :" + helloArray.length);
	    String fs = String.format("my name is %s  ", name);
	    System.out.println(fs);
	    StringBuffer sb = new StringBuffer("Hi how are you..");
	    sb.append("...sagar");
	    System.out.println(sb);
	    StringBuilder sbl = new StringBuilder("I am good...");
	    sbl.append("..how are you");
	    System.out.println(sbl);
	    
	    
	}

}
