package test;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sourceCode.CountNumber;

@RunWith(Parameterized.class)
public class TestCountNumber {
	private String expPath;
	private String sourcePath;

	public TestCountNumber(String expPath, String sourcePath) {
		this.expPath = expPath;
		this.sourcePath = sourcePath;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] object = { { "TCofCN/shouldBe1.txt", "TCofCN/text1.txt" },
				{ "TCofCN/shouldBe2.txt", "TCofCN/text2.txt" }, { "TCofCN/shouldBe3.txt", "TCofCN/text3.txt" },
				{ "TCofCN/shouldBe4.txt", "TCofCN/text4.txt" }, { "TCofCN/shouldBe5.txt", "TCofCN/text5.txt" },
				{ "TCofCN/shouldBe6.txt", "TCofCN/text6.txt" }, { "TCofCN/shouldBe7.txt", "TCofCN/text7.txt" },
				{ "TCofCN/shouldBe8.txt", "TCofCN/text8.txt" }, { "TCofCN/shouldBe9.txt", "TCofCN/text9.txt" },
				{ "TCofCN/shouldBe10.txt", "TCofCN/text10.txt" }, { "TCofCN/shouldBe11.txt", "TCofCN/text11.txt" },
				{ "TCofCN/shouldBe12.txt", "TCofCN/text12.txt" }, { "TCofCN/shouldBe13.txt", "TCofCN/text13.txt" },
				{ "TCofCN/shouldBe14.txt", "TCofCN/text14.txt" }, { "TCofCN/shouldBe15.txt", "TCofCN/text15.txt" },
				{ "TCofCN/shouldBe16.txt", "TCofCN/text16.txt" }, { "TCofCN/shouldBe17.txt", "TCofCN/text17.txt" },
				{ "TCofCN/shouldBe18.txt", "TCofCN/text18.txt" }, { "TCofCN/shouldBe19.txt", "TCofCN/text19.txt" },
				{ "TCofCN/shouldBe20.txt", "TCofCN/text20.txt" } };
		return Arrays.asList(object);

	}

	@Test
	public void testCount() throws FileNotFoundException {
		String exp = CountNumber.readFile(expPath);
		assertEquals(exp, new CountNumber().count(this.sourcePath).toString());
	}

}
