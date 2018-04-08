package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import org.junit.Test;

import sourceCode.WordSort;

public class TestWordSort {

	@Test
	public void testWordSort1() throws FileNotFoundException { // 倒序改为从大到小
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		map.put("abc", 1);
		map.put("bac", 2);
		map.put("cab", 3);
		sortedMap = WordSort.sort(map);
		expectedMap.put("cab", 3);
		expectedMap.put("bac", 2);
		expectedMap.put("abc", 1);
		String actual = sortedMap.toString();
		String expected = expectedMap.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSort2() throws FileNotFoundException { // 乱序改为从大到小
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		map.put("bac", 2);
		map.put("abc", 1);
		map.put("cab", 3);
		sortedMap = WordSort.sort(map);
		expectedMap.put("cab", 3);
		expectedMap.put("bac", 2);
		expectedMap.put("abc", 1);
		String actual = sortedMap.toString();
		String expected = expectedMap.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSort3() throws FileNotFoundException { // key首字母相同的情况
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		map.put("aaa", 1);
		map.put("aab", 2);
		map.put("aac", 3);
		sortedMap = WordSort.sort(map);
		expectedMap.put("aac", 3);
		expectedMap.put("aab", 2);
		expectedMap.put("aaa", 1);
		String actual = sortedMap.toString();
		String expected = expectedMap.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSort4() throws FileNotFoundException { // value相同的情况,按ASCII顺序
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		map.put("abc", 1);
		map.put("bac", 2);
		map.put("cab", 2);
		sortedMap = WordSort.sort(map);
		expectedMap.put("bac", 2);
		expectedMap.put("cab", 2);
		expectedMap.put("abc", 1);
		String actual = sortedMap.toString();
		String expected = expectedMap.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSort5() throws FileNotFoundException { // key首字母相同，value相同的情况
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		map.put("aaa", 1);
		map.put("aab", 2);
		map.put("aac", 2);
		sortedMap = WordSort.sort(map);
		expectedMap.put("aab", 2);
		expectedMap.put("aac", 2);
		expectedMap.put("aaa", 1);
		String actual = sortedMap.toString();
		String expected = expectedMap.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSort6() throws FileNotFoundException { // 较多数据的情况
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		map.put("eee", 5);
		map.put("aaa", 1);
		map.put("ccc", 3);
		map.put("ddd", 4);
		map.put("bbb", 2);
		sortedMap = WordSort.sort(map);
		expectedMap.put("eee", 5);
		expectedMap.put("ddd", 4);
		expectedMap.put("ccc", 3);
		expectedMap.put("bbb", 2);
		expectedMap.put("aaa", 1);
		String actual = sortedMap.toString();
		String expected = expectedMap.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSort7() throws FileNotFoundException { // 较多数据value相同
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		map.put("ccc", 2);
		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("eee", 3);
		map.put("ddd", 2);
		sortedMap = WordSort.sort(map);
		expectedMap.put("eee", 3);
		expectedMap.put("bbb", 2);
		expectedMap.put("ccc", 2);
		expectedMap.put("ddd", 2);
		expectedMap.put("aaa", 1);
		String actual = sortedMap.toString();
		String expected = expectedMap.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSort8() throws FileNotFoundException { // value很大的情况
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		map.put("aaa", 353);
		map.put("bbb", 432);
		map.put("ccc", 166);
		map.put("ddd", 56);
		map.put("eee", 775);
		sortedMap = WordSort.sort(map);
		expectedMap.put("eee", 775);
		expectedMap.put("bbb", 432);
		expectedMap.put("aaa", 353);
		expectedMap.put("ccc", 166);
		expectedMap.put("ddd", 56);
		String actual = sortedMap.toString();
		String expected = expectedMap.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSort9() throws FileNotFoundException { // key复杂的情况
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		map.put("erwqfd", 2);
		map.put("hivuadv", 1);
		map.put("nhgf", 2);
		map.put("erw", 2);
		map.put("vdsae", 3);
		sortedMap = WordSort.sort(map);
		expectedMap.put("vdsae", 3);
		expectedMap.put("erw", 2);
		expectedMap.put("erwqfd", 2);
		expectedMap.put("nhgf", 2);
		expectedMap.put("hivuadv", 1);
		String actual = sortedMap.toString();
		String expected = expectedMap.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSort10() throws FileNotFoundException { // 大量数据的情况
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		LinkedHashMap<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();
		for (int i = 1; i <= 200; i++) {
			map.put("a" + String.valueOf(i), i);
			expectedMap.put("a" + String.valueOf(201 - i), 201 - i);
		}
		sortedMap = WordSort.sort(map);
		String actual = sortedMap.toString();
		String expected = expectedMap.toString();
		assertEquals(expected, actual);
	}

}
