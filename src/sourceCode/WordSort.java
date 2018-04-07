package sourceCode;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class WordSort {
	
	public static TreeMap<String, Integer> sort(Map<String, Integer> map) throws FileNotFoundException {
		ValueComparator bvc = new ValueComparator(map);
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(bvc);
		sortedMap.putAll(map);
		PrintResult.print(sortedMap);
		
		return sortedMap;
	}
	
}

class ValueComparator implements Comparator<String> {
	Map<String, Integer> base;

	// 将需要比较的map集合传进来
	public ValueComparator(Map<String, Integer> base) {
		this.base = base;
	}

	// 传入的两个参数应该是map的两个key
	public int compare(String a, String b) {
		if (base.get(a) > base.get(b)) {
			return -1;
		} else {
			return 1;
		}
	}
}
