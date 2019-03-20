package practiceprograms;

public class InheritanceSub extends InheritanceSuper {

	public int a;
	public int b;
	
	public void add() {
		super.add();
		int sum = a+b;
		System.out.println("Sum of two num from InhetanceSub is : "+ sum);
	}
	public void division() {
		float div = a%b;
		System.out.println("Division of two num from InhetanceSub is : "+ div);
	}
	
	public InheritanceSub(int x, int y, int z, int a, int b) {
		super(x, y, z);
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[] args) {
		
		InheritanceSub sub = new InheritanceSub(5, 6, 3, 20, 5);  // InhetanceSub reference and object
		sub.add();
		sub.multilication();
		sub.division();
		InheritanceSuper sup = new InheritanceSuper(3, 4, 6); // InheritanceSuper reference and object
		sup.add();
		sup.multilication();
		// sup.division(); --- Not possible, not define in super class
		
		System.out.println( sub instanceof InheritanceSub);
		System.out.println(sub instanceof InheritanceSuper);
		System.out.println(sup instanceof InheritanceSuper);
		
		InheritanceSuper sup1 = new InheritanceSub(3, 4, 5, 2, 3); // InheritanceSuper reference and InhetanceSub object
		sup1.add();  
		// sup1 will call add() from InhetanceSub. In compile time, the check is made on the reference type. 
		// However, in the runtime, JVM figures out the object type and would run the method that belongs to that particular object.
		// This behavior is referred to as virtual method invocation, and these methods are referred to as virtual methods. 
		// An overridden method is invoked at run time, no matter what type the reference is that was used in the source code at compile time.
		
		// sup1.division(); --- Through Compile time error as sup1 is a reference to InheritanceSuper and it did not have division() method.
		
	}

}
