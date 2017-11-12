package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test2Test{
	@Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
	@Test
	public void testQueryBridgeWords() {
		//test2 hi = new test2();
		assertEquals("situation3",test2.queryBridgeWords("to","the"));
		assertEquals("worlds life ",test2.queryBridgeWords("new","like"));
		assertEquals("explore ",test2.queryBridgeWords("to","strange"));
		assertEquals("situation4",test2.queryBridgeWords("to","explore"));
	}

}
