package factorypackage;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

// Sometimes we may need to run a set of tests with different data values. 
// To achieve this we may define a separate set of tests inside a suite in the testng XML and test the required scenario.
// The problem with this approach is that if you get an extra set of data, you will need to redefine the test.
// TestNG solves this problem by providing the @Factory annotation feature. Factory in TestNG defines and creates tests dynamically at runtime.
// It�s mandatory that a factory method should return an array of Object class i.e. Object [].


class SimpleTest1
{
    @Test
    public void simpleTest() {
        System.out.println("Simple Test Method.");
    }
}

public class SimpleTestFactory_1 {
	
	    @Factory
	    public Object[] factoryMethod() {
	        return new Object[] { new SimpleTest1(), new SimpleTest1() };
	    }
	}

