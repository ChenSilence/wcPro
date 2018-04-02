package sourceCode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountNumber {
	private  Map<String,Integer> map = new TreeMap<String,Integer>();
	private  String text;
	private  List<String> lists = new ArrayList<String>();  //�洢���˺󵥴ʵ��б�   
	
	
	public static void main(String[] args) throws IOException {
		new CountNumber().count("text.txt");
	}
	
	
	public void count(String sPath) {
		text = readFile(sPath);
		divide(text);
		doCount();
		show();
	}
	
	
	public String readFile(String path) { // ���ļ�
		try {
			byte[] byteText = Files.readAllBytes(Paths.get(path));
			return new String(byteText, "UTF-8");

		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public void divide(String text){//���ı��ָ�ɶ������
		String[] words =  text.split("[^a-zA-Z-]");//������ֻ����ĸ��-�������ַ�
			for(String word : words) {
				if(word.length() != 0 ) {//ȥ���մ��������ɶ������ĸ���
					
					if(word.charAt(0)=='-') {//������-abcd,ȥ��ǰ���-
						word = word.substring(1);
					}
					if( word.charAt( word.length()-1) == '-' ) {//������abcd-,ȥ������-
						word = word.substring(0, word.length()-1 );
					}
					
					lists.add(word);//��ӽ�lists
					
				}
			}
	}
	
	public void doCount() { //���ʵĴ�Ƶͳ��    
	       for (String nowWord : lists) {    
	           if(map.get(nowWord) != null){    
	               map.put(nowWord,map.get(nowWord) + 1);    
	           }else{    
	               map.put(nowWord,1);    
	           }    
	   
	       }
	}
	

	
	public void show() {
        for(Map.Entry<String, Integer> entry : map.entrySet() ){    
            System.out.println(entry.getKey()+ ": " +entry.getValue());    
        }       
	}
	
//	for (Map.Entry<Integer, Integer> entry : map.entrySet()) { 
//		  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
//		}
//	
	
	/**
	 * @return text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text Ҫ���õ� text
	 */
	public void setText(String text) {
		this.text = text;
	}

}
