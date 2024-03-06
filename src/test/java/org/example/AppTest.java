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
      MyStack<Integer> stackOne=new MyStack<>();
      stackOne.push(1);
      stackOne.push(2);
      stackOne.push(3);
      stackOne.push(5);

      assertEquals(Integer.valueOf(5),stackOne.pop());
      assertEquals(Integer.valueOf(3),stackOne.pop());

        assertEquals(Integer.valueOf(2),stackOne.pop());
        assertEquals(Integer.valueOf(1),stackOne.pop());

    }
    public void testisEmpty(){
    MyStack<Integer> stackTwo=new MyStack<>();
    assertEquals(true,stackTwo.isEmpty());
    }
}
