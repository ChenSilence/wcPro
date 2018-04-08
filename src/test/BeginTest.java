package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sourceCode.Begin;

public class BeginTest {

	@Before
	public void setUp() throws Exception {
	}



	@Test
	public void testread1() {
		//fail("Not yet implemented");
		System.out.printf("��ʼ����1\n");
		Begin test=new Begin();
		String args[]={"text.txt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("everything is right!",ss[0]);
	}
	
	@Test 
	public void testread2(){
		System.out.printf("��ʼ����2\n");
		Begin test=new Begin();
		String args[]={"text.tt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	
	@Test 
	public void testread3(){
		System.out.printf("��ʼ����3\n");
		Begin test=new Begin();
		String args[]={"texttxt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("��������ȷ�ļ���!",ss[0]);
	}
	
	@Test 
	public void testread4(){
		System.out.printf("��ʼ����4\n");
		Begin test=new Begin();
		String args[]={"text.cpp"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}	
	
	@Test 
	public void testread5(){
		System.out.printf("��ʼ����5\n");
		Begin test=new Begin();
		String args[]={"test.txt","text2.txt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("��������ȷ�ļ���",ss[0]);
	}
	
	@Test 
	public void testread6(){
		System.out.printf("��ʼ����6\n");
		Begin test=new Begin();
		String args[]={};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("���������",ss[0]);
	}
	
	@Test 
	public void testread7(){
		System.out.printf("��ʼ����7\n");
		Begin test=new Begin();
		String args[]={"abc.c.txt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	
	@Test 
	public void testread8(){
		System.out.printf("��ʼ����8\n");
		Begin test=new Begin();
		String args[]={"asdhaiudhiwahidwahiawuhdawiuhdw.txt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("everything is right!",ss[0]);
	}
	
	@Test 
	public void testread9(){
		System.out.printf("��ʼ����9\n");
		Begin test=new Begin();
		String args[]={"text.doc"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	@Test 
	public void testread10(){
		System.out.printf("��ʼ����10\n");
		Begin test=new Begin();
		String args[]={"txt.txt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("everything is right!",ss[0]);
	}
	
	@Test 
	public void testread11(){
		System.out.printf("��ʼ����11\n");
		Begin test=new Begin();
		String args[]={"....c"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	
	@Test 
	public void testread12(){
		System.out.printf("��ʼ����12\n");
		Begin test=new Begin();
		String args[]={" "};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("��������ȷ�ļ���!",ss[0]);
	}
	
	@Test 
	public void testread13(){
		System.out.printf("��ʼ����13\n");
		Begin test=new Begin();
		String args[]={"text.java"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	
	@Test 
	public void testread14(){
		System.out.printf("��ʼ����14\n");
		Begin test=new Begin();
		String args[]={"text.sql"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	
	@Test 
	public void testread15(){
		System.out.printf("��ʼ����13\n");
		Begin test=new Begin();
		String args[]={"text.word"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	
	@Test 
	public void testread16(){
		System.out.printf("��ʼ����16\n");
		Begin test=new Begin();
		String args[]={"text.png"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	
	@Test 
	public void testread17(){
		System.out.printf("��ʼ����17\n");
		Begin test=new Begin();
		String args[]={"text.py"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	
	@Test 
	public void testread18(){
		System.out.printf("��ʼ����18\n");
		Begin test=new Begin();
		String args[]={"text.jpg"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	@Test 
	public void testread19(){
		System.out.printf("��ʼ����19\n");
		Begin test=new Begin();
		String args[]={"text.gif"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
	
	@Test 
	public void testread20(){
		System.out.printf("��ʼ����20\n");
		Begin test=new Begin();
		String args[]={"text.exe"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("�ļ���ʽ���ԣ�����������!",ss[0]);
	}
}
