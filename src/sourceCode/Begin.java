package sourceCode;

import java.util.Scanner;
import java.lang.String;
public class Begin {
	public static void main(String[] args) throws Exception {
		 //解析args数组中的参数
		
			 if (args.length == 0) {                           //提示未输入参数
	           System.out.println("请输入参数");  
	           return;  
	           }else if (args.length==1){
		          String name =args[0];                //args数组中的最后一个参数为读取文件
			      String[] mode=name.split("\\.");         //将文件名在"."处分裂开并存入mod数组中,判断文件格式
			  if (mode[1].equals("txt")){
				  
			  
				 // System.out,printf("everything is right!");
		         new CountNumber().count(name);

			  }else
				  System.out.printf("文件格式不对，请重新输入!");
	  
                 }
		  
		  
       }
}