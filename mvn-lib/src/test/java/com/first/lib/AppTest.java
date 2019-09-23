package com.first.lib;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest
    extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        App app = new App();
        assertNull(app);
    }

    public void testLib() {
    	Lib lib = new Lib("hoge", "hoge");
    	assertNotNull(lib);
    }
}
