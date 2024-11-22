package exe_1_QA.exe_1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//Students Feras Dwere(214225021), Tarek Saleh(316448588)

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	exercise4 tester = new exercise4();
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp_1()
    {
    	
    		String expected_result="A";
    		int a =-32,b=-40;
    		String mode="regular";
    		String actual_result=tester.Calculate(a,b,mode);
    		assertEquals(expected_result,actual_result);
    	
    }
    public void testApp_2()
    {
    	
    		String expected_result="B";
    		int a =-32,b=-40;
    		String mode="negative";
    		String actual_result=tester.Calculate(a,b,mode);
    		assertEquals(expected_result,actual_result);
    	
    }
    public void testApp_3()
    {
    	
    		String expected_result="Division by zero is not allowed";
    		int a =0,b=40;
    		String mode="reciprocals";
    		String actual_result=tester.Calculate(a,b,mode);
    		assertEquals(expected_result,actual_result);
    	
    }
    public void testApp_4()
    {
    	
    		String expected_result="two equal numbers";
    		int a =32,b=32;
    		String mode="negative";
    		String actual_result=tester.Calculate(a,b,mode);
    		assertEquals(expected_result,actual_result);
    	
    }
    public void testApp_5()
    {
    	
    		String expected_result="B";
    		int a =-1,b=-40;
    		String mode="reciprocals";
    		String actual_result=tester.Calculate(a,b,mode);
    		assertEquals(expected_result,actual_result);
    	
    }
    public void testApp_6()
    {
    	
    		String expected_result="A";
    		double a =0.2,b=0.5;
    		String mode="reciprocals";
    		String actual_result=tester.Calculate(a,b,mode);
    		assertEquals(expected_result,actual_result);
    	
    }
    public void testApp_7()
    {
    	
    		String expected_result="A";
    		double a =-28,b=28;
    		String mode="negative";
    		String actual_result=tester.Calculate(a,b,mode);
    		assertEquals(expected_result,actual_result);
    	
    }
    public void testApp_8()
    {
    	
    		String expected_result="B";
    		double a =-28,b=28;
    		String mode="regular";
    		String actual_result=tester.Calculate(a,b,mode);
    		assertEquals(expected_result,actual_result);
    	
    }
    public void testApp_9()
    {
    	
    		String expected_result="two equal numbers";
    		double a =10,b=10;
    		String mode="regular";
    		String actual_result=tester.Calculate(a,b,mode);
    		assertEquals(expected_result,actual_result);
    	
    }
}
