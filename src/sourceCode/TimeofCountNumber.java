package sourceCode;
import java.io.FileNotFoundException;

public class TimeofCountNumber {

	public static void main(String[] args) throws FileNotFoundException {
		String[] longtests = {
				"longtest/51kb.txt",
				"longtest/92kb.txt",
				"longtest/544kb.txt",
				"longtest/845kb.txt",
				"longtest/1500kb.txt",
//				"text.txt",
//				"text-.txt"
				};
		for (String s:longtests) {
			timer(s);
		}
	}
	
		public static void timer(String path) throws FileNotFoundException {
			long startTime = System.currentTimeMillis();    //获取开始时间
			new CountNumber().count(path);
			long endTime = System.currentTimeMillis();    //获取结束时间
			System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
		
		}
	}

