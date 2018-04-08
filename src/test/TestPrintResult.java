package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.TreeMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import sourceCode.PrintResult;

public class TestPrintResult {


	@Before
	public void setUp() throws Exception {
		
		
	}

	@Test
	public void testPrintresult() throws FileNotFoundException {
		//fail("Not yet implemented");
		Map<String, Integer> map=new TreeMap<String, Integer>(); 
		
		map.put("asdw", 1);
		map.put("&&", 75);
		
		
		assertEquals(" &&75 asdw1", PrintResult.print(map));
	}
        
}
