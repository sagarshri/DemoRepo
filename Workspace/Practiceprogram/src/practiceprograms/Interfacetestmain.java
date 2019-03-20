package practiceprograms;

public class Interfacetestmain implements Interfacetest{

	@Override
	public void eat() {
		System.out.println("Implementing eat method");
		
	}

	@Override
	public void travel() {
		System.out.println("Implementing travel method");
		
	}
	
	public static void main(String[] args) {
		Interfacetest IF = new Interfacetestmain();
		IF.eat();
		IF.travel();
		Interfacetestmain IF1 = new Interfacetestmain();
		IF1.eat();
		IF1.travel();
	}

	
}
