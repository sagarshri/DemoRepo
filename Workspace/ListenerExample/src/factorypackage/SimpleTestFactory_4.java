package factorypackage;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

    class DependencyTest{
    	
	@Test(dependsOnMethods = {"simpleTest3"})
    public void simpleTest2() {
        System.out.println("Simple Test Method2.");
    }
	
	@Test(dependsOnMethods = "simpleTest4")
    public void simpleTest3() {
        System.out.println("Simple Test Method3.");
    }
	
	@Test
    public void simpleTest4() {
        System.out.println("Simple Test Method4.");
    }
}


public class SimpleTestFactory_4
{
    @Factory
    public Object[] factoryMethod()
    {
        return new Object[] { new DependencyTest(), new DependencyTest() };
    }
}