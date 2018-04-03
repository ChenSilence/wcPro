package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sourceCode.CountNumber;


@RunWith (Parameterized.class)
public class TestCountNumber {
	private String expPath;
	private String sourcePath;
	private CountNumber aCount;
 
	public TestCountNumber(String expPath,String sourcePath) {
		this.expPath = expPath;
		this.sourcePath = sourcePath;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] object = {{"TCofCN/shouldBe1.txt","TCofCN/text1.txt"}
							,{"TCofCN/shouldBe2.txt","TCofCN/text2.txt"}
							};
		return Arrays.asList(object);
	 
	}
	
	@Test
	public void testCount() {
		this.aCount = new CountNumber();
		String exp = aCount.readFile(expPath);
		assertEquals(exp, aCount.count(this.sourcePath).toString() );
	}
	


}
