package sourceCode;

import java.util.Scanner;
import java.lang.String;
public class Begin {

	 static String[] str = new String [8];
	public static void main(String[] args)  {
		 //解析args数组中的参数
	         int i=0;
			 if (args.length == 0) {                           //提示未输入参数
	           //System.out.println("请输入参数");
	           str[i]=("请输入参数");
	           return;  
	           }else if (args.length==1){
	        	    String name =args[0];                //args数组中的最后一个参数为读取文件
	        	    boolean doo=args[0].contains(".");
	        	    if(doo){
			      String[] mode=name.split("\\.");     //将文件名在"."处分裂开并存入mod数组中,判断文件格式
			      if (mode[1].equals("txt")){
				   //System.out.printf("everything is right!");
				     str[i]=("everything is right!");
		         //new CountNumber().count(name);
                
			  }else{
				  //System.out.printf("文件格式不对，请重新输入!");
	              str[i]=("文件格式不对，请重新输入!");
                      }
	        	    }else {
	 	        	   //System.out.printf("请输入正确文件名!");
		        	   str[i]=("请输入正确文件名!");
	                   } 
	           }else{
	        	  // System.out.printf("请输入正确文件名");
	        	   str[i]=("请输入正确文件名");
	        	   
	           }

       }
	 public static String[] getOutput() {
    	 return str; 
    }
}