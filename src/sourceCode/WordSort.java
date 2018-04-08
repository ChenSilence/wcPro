package sourceCode;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class WordSort {

    /**
     * map����.
     * ��value�Ӵ�С������ͬ��key��ASCII˳��
     * @param map �������map
     * @return �ź����TreeMap
     */
    public static TreeMap<String, Integer> sort(Map<String, Integer> map) {
        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(new ValueComparator(map));
        sortedMap.putAll(map);
        return sortedMap;
    }

}

class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;

    // ����Ҫ�Ƚϵ�map���ϴ�����
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    // �������������Ӧ����map������key
    public int compare(String a, String b) {
        if (base.get(a) > base.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }
}
