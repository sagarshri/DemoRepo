package practiceprograms;

//Def : Ability to define a behavior that's specific to the subclass type, 
//      which means a subclass can implement a parent class method based on its requirement.

//1. argument list should be exactly the same as that of the overridden method.
//2. The return type should be the same or a subtype of the return type declared in the original overridden method in the superclass.
//3. The access level cannot be more restrictive than the overridden method's access level. For example: If the superclass method is declared public then the overridding method in the sub class cannot be either private or protected.
//4. Instance methods can be overridden only if they are inherited by the subclass.
//5. A method declared final cannot be overridden.
//5. A method declared static cannot be overridden but can be re-declared.
//6. If a method cannot be inherited, then it cannot be overridden.
//7. A subclass within the same package as the instance's superclass can override any superclass method that is not declared private or final (i.e. Public, protected and default is allowed).
//8. A subclass in a different package can only override the non-final methods declared public or protected (i.e. private and default not allowed)
//9. An overriding method can throw any uncheck exceptions, regardless of whether the overridden method throws exceptions or not.
//   However, the overriding method should not throw checked exceptions that are new or broader than the ones declared by the overridden method. 
//   The overriding method can throw narrower or fewer exceptions than the overridden method.
//10.Constructors cannot be overridden.

public class Overriddingtest {
	
	public void move() {
		System.out.println("Calling move method from Overriddingtest");
	}

}
