package junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Result result = JUnitCore.runClasses(SquareTest.class,CountATest.class,AppleTest.class,TestAssertion.class,TestAnnotations.class);
	     for(Failure failure : result.getFailures())
	     {
	    	 System.out.println(failure);
	     }
	     
	     System.out.println("result is successful? :" +result.wasSuccessful());
	}

}
