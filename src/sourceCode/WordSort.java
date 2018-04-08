package sourceCode;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class WordSort {

    /**
     * map排序.
     * 按value从大到小，若相同则按key的ASCII顺序
     * @param map 待排序的map
     * @return 排好序的TreeMap
     */
    public static TreeMap<String, Integer> sort(Map<String, Integer> map) {
        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(new ValueComparator(map));
        sortedMap.putAll(map);
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
