package javatest;

import java.util.Scanner;
import java.lang.String;
public class Begin {


	public static void main(String[] args)  {
		 //����args�����еĲ���
	         int i=0;
			 if (args.length == 0) {                           //��ʾδ�������
	           System.out.println("���������");
	           return;  
	           }else if (args.length==1){
	        	    String name =args[0];                //args�����е����һ������Ϊ��ȡ�ļ�
	        	    boolean doo=args[0].contains(".");
	        	    if(doo){
			      String[] mode=name.split("\\.");     //���ļ�����"."�����ѿ�������mod������,�ж��ļ���ʽ
			      if (mode[1].equals("txt")){
				   System.out.printf("everything is right!");
				    
		             new CountNumber().count(name);
               
			  }else{
				  System.out.printf("�ļ���ʽ���ԣ�����������!");
	              
                      }
	        	    }else {
	 	        	   System.out.printf("��������ȷ�ļ���!");
		        	   
	                   } 
	           }else{
	        	   System.out.printf("��������ȷ�ļ���");
	        	   
	        	   
	           }

       }

}