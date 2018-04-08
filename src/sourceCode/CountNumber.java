package sourceCode;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountNumber {
	private Map<String, Integer> map = new TreeMap<String, Integer>();
	private String text;
	private StringBuilder out = new StringBuilder();
	private List<String> lists = new ArrayList<String>(); // �洢���˺󵥴ʵ��б�

	public StringBuilder count(String sPath) throws FileNotFoundException {
		text = readFile(sPath);
		divide(text);
		doCount();
		resultToString();
		// show();
		WordSort.sort(map);
		// map = WordSort.sort(map);

		return out;
	}

	public static String readFile(String path) { // ���ļ�
		try {
			byte[] byteText = Files.readAllBytes(Paths.get(path));
			return new String(byteText, "UTF-8");

		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	public void divide(String text) {// ���ı��ָ�ɶ������
		String[] words = text.split("[^a-zA-Z-]");// ������ֻ����ĸ��-�������ַ�
		for (String word : words) {
			if (word.length() != 0) {// ȥ���մ��������ɶ������ĸ���

				if (word.charAt(0) == '-') {// ������-abcd,ȥ��ǰ���-
					word = word.substring(1);
				}
				if (word.charAt(word.length() - 1) == '-') {// ������abcd-,ȥ������-
					word = word.substring(0, word.length() - 1);
				}

				lists.add(word.toLowerCase());// ��ӽ�listsͬʱתСд��ĸ

			}
		}
	}

	public void doCount() { // ���ʵĴ�Ƶͳ��
		for (String nowWord : lists) {
			if (map.get(nowWord) != null) { // �����Ѵ�����value+1
				map.put(nowWord, map.get(nowWord) + 1);
			} else {
				map.put(nowWord, 1);// ���ʲ����������
			}

		}
	}

	public void resultToString() {// ��map�еĽ���浽�ַ���out��
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			out = out.append(entry.getKey()).append(": ").append(entry.getValue()).append("\r\n");
		}
		if (out.length() > 0)
			out.delete(out.length() - 2, out.length());
	}

	public void show() {
		System.out.println(out);
	}

}
