package com.sv.children.game;

import java.util.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	ChildrenGame j = new ChildrenGame();
	
    /**
     * Test positive scenario :-)
     */
    public void testAppSuccessCase()
    {
    	ArrayList<String> expectedList = new ArrayList<String>();
    	expectedList.add("id-2");
    	expectedList.add("id-4");
    	expectedList.add("id-3");
    	expectedList.add("id-1");
        
        List<String> actualList = j.printEliminationOrder(2, 4);
        
        assertEquals(actualList, expectedList);
 
        
    }
    
}
