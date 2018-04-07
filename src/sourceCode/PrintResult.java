package sourceCode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintResult {
		
	public static  String  print(Map<String, Integer> map) throws FileNotFoundException {
		int i = 0;
		String result = ""; 
		PrintWriter output = new PrintWriter("result.txt");
		 Set<Entry<String, Integer>> set = map.entrySet();       
	        for (Entry<String, Integer> entry : set) {
	            if (i > 0) {
	                output.println();// 避免出现最后一行换行
	            }
	            output.print(entry.getKey() + " " + entry.getValue());
	            i++;// 最多输出前100个
	            if (i >= 100) {
	                break;
	            }
	        }
		output.close();
		return result;
	}
}
