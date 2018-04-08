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
		System.out.printf("开始测试1\n");
		Begin test=new Begin();
		String args[]={"text.txt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("everything is right!",ss[0]);
	}
	
	@Test 
	public void testread2(){
		System.out.printf("开始测试2\n");
		Begin test=new Begin();
		String args[]={"text.tt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	
	@Test 
	public void testread3(){
		System.out.printf("开始测试3\n");
		Begin test=new Begin();
		String args[]={"texttxt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("请输入正确文件名!",ss[0]);
	}
	
	@Test 
	public void testread4(){
		System.out.printf("开始测试4\n");
		Begin test=new Begin();
		String args[]={"text.cpp"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}	
	
	@Test 
	public void testread5(){
		System.out.printf("开始测试5\n");
		Begin test=new Begin();
		String args[]={"test.txt","text2.txt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("请输入正确文件名",ss[0]);
	}
	
	@Test 
	public void testread6(){
		System.out.printf("开始测试6\n");
		Begin test=new Begin();
		String args[]={};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("请输入参数",ss[0]);
	}
	
	@Test 
	public void testread7(){
		System.out.printf("开始测试7\n");
		Begin test=new Begin();
		String args[]={"abc.c.txt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	
	@Test 
	public void testread8(){
		System.out.printf("开始测试8\n");
		Begin test=new Begin();
		String args[]={"asdhaiudhiwahidwahiawuhdawiuhdw.txt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("everything is right!",ss[0]);
	}
	
	@Test 
	public void testread9(){
		System.out.printf("开始测试9\n");
		Begin test=new Begin();
		String args[]={"text.doc"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	@Test 
	public void testread10(){
		System.out.printf("开始测试10\n");
		Begin test=new Begin();
		String args[]={"txt.txt"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("everything is right!",ss[0]);
	}
	
	@Test 
	public void testread11(){
		System.out.printf("开始测试11\n");
		Begin test=new Begin();
		String args[]={"....c"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	
	@Test 
	public void testread12(){
		System.out.printf("开始测试12\n");
		Begin test=new Begin();
		String args[]={" "};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("请输入正确文件名!",ss[0]);
	}
	
	@Test 
	public void testread13(){
		System.out.printf("开始测试13\n");
		Begin test=new Begin();
		String args[]={"text.java"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	
	@Test 
	public void testread14(){
		System.out.printf("开始测试14\n");
		Begin test=new Begin();
		String args[]={"text.sql"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	
	@Test 
	public void testread15(){
		System.out.printf("开始测试13\n");
		Begin test=new Begin();
		String args[]={"text.word"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	
	@Test 
	public void testread16(){
		System.out.printf("开始测试16\n");
		Begin test=new Begin();
		String args[]={"text.png"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	
	@Test 
	public void testread17(){
		System.out.printf("开始测试17\n");
		Begin test=new Begin();
		String args[]={"text.py"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	
	@Test 
	public void testread18(){
		System.out.printf("开始测试18\n");
		Begin test=new Begin();
		String args[]={"text.jpg"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	@Test 
	public void testread19(){
		System.out.printf("开始测试19\n");
		Begin test=new Begin();
		String args[]={"text.gif"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
	
	@Test 
	public void testread20(){
		System.out.printf("开始测试20\n");
		Begin test=new Begin();
		String args[]={"text.exe"};
		test.main(args);
        String[] ss=test.getOutput();
		assertEquals("文件格式不对，请重新输入!",ss[0]);
	}
}
