package com.tuffwerx.lib;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Scraper.
 */
public class ScraperTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ScraperTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ScraperTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testScraper()
    {
        assertTrue( true );
    }
}
