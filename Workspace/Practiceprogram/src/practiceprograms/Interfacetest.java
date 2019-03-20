package practiceprograms;

//1. An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods
//2. A class describes the attributes and behaviors of an object where as an interface contains behaviors that a class implements.
//3. Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types.
//4. You cannot instantiate an interface. An interface does not contain any constructors.
//5. Interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
//6. An interface can extend multiple interfaces.

//An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
//Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
//Methods in an interface are implicitly public.

//Rules :
// Checked exceptions should not be declared on implementation methods other than the ones declared by the interface method or subclasses of those declared by the interface method.
// The signature of the interface method and the same return type or subtype should be maintained when overriding the methods.
// An implementation class itself can be abstract and if so, interface methods need not be implemented.


//Tagging Interface - Parent interface does not contain any methods.

public interface Interfacetest {
	
	public void eat();
	public void travel();

}
