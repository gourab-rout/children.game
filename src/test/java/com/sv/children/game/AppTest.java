package com.sv.children.game;

import static org.junit.Assert.assertEquals;

import java.util.*;

import com.sv.children.game.ChildrenGame;
import org.junit.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
   {
	ChildrenGame j = new ChildrenGame();
	
    /**
     * Test positive scenario :-)
     */
	@Test
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
    
    /**
     * Test negative scenario :-(
     */
	@Test(expected = IllegalArgumentException.class)    
    public void testAppFailureCase()
    {
    	j.printEliminationOrder(2, 0);
    
    }   
    
}
