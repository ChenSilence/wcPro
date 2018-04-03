package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sourceCode.CountNumber;

class TestCountNumber {
	CountNumber aCount = new CountNumber();

	@Test
	void testCount() {
//		fail("ипн╢й╣ож");
		System.out.println("test count\n");
	
		String exp1 = aCount.readFile("shouldBe1.txt");
		assertEquals("count wrong",exp1,aCount.count("text1.txt").toString());
	}

}
