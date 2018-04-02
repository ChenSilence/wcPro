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
	private  List<String> lists = new ArrayList<String>();  //存储过滤后单词的列表   
	
	
	public static void main(String[] args) throws IOException {
		new CountNumber().count("text.txt");
	}
	
	
	public void count(String sPath) {
		text = readFile(sPath);
		divide(text);
		doCount();
		show();
	}
	
	
	public String readFile(String path) { // 读文件
		try {
			byte[] byteText = Files.readAllBytes(Paths.get(path));
			return new String(byteText, "UTF-8");

		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public void divide(String text){//将文本分割成多个单词
		String[] words =  text.split("[^a-zA-Z-]");//保留下只含字母和-的连续字符
			for(String word : words) {
				if(word.length() != 0 ) {//去除空串，可能由多个非字母造成
					
					if(word.charAt(0)=='-') {//单词如-abcd,去掉前面的-
						word = word.substring(1);
					}
					if( word.charAt( word.length()-1) == '-' ) {//单词如abcd-,去掉最后的-
						word = word.substring(0, word.length()-1 );
					}
					
					lists.add(word);//添加进lists
					
				}
			}
	}
	
	public void doCount() { //单词的词频统计    
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
	 * @param text 要设置的 text
	 */
	public void setText(String text) {
		this.text = text;
	}

}
