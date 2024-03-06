package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

import java.util.Optional;
import java.util.Stack;

/**
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
        assertTrue( true );
    }

    public void testPushandPop()
    {
      MyStack<Integer> s=new MyStack<>();
      s.push(1);
      s.push(2);
      assertEquals(Integer.valueOf(2),s.pop());
      assertEquals(Integer.valueOf(1),s.pop());
    }
    public void testisEmpty(){
    MyStack<Integer> stack=new MyStack<>();
    assertEquals(true,stack.isEmpty());
    }
}
