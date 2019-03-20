package nestedclasses;

// 1. An inner class declared without a class name. We declare and instantiate them at the same time
// 2. We used these, whenever we need to override the method of a class or an interface.

    abstract class Anonymous{
	    public abstract void print();
}

  public class AnonymousInnerClassExample_1 {
	public static void main(String[] args) {
		Anonymous aobj = new Anonymous() {
			
			@Override
			public void print() {
			System.out.println("Hi ....I am inside Anonymous Class");
			}
		};
		aobj.print();
	}

}
