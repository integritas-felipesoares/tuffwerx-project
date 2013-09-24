package com.tuffwerx.lab;

import com.tuffwerx.lab.App;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @felipesoares
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
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
    public void testApp()
    {
        App app = new App();
        String strToSearchFor = "TECHNICAL QUALITY";
    	String title = app.loadPage("http://www.integritastech.com");
    	assertTrue(title.toLowerCase().contains(strToSearchFor.toLowerCase()));
    	System.out.println(title);
    	
    	String strToCalc = "2";
        String calc = app.executeScriptJS("http://162.243.9.213:8081/test-page-phantomjs.html", 1);
        assertTrue(strToCalc.equals(calc));
        System.out.println(calc);
    }
}
