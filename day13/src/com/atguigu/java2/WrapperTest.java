package com.atguigu.java2;

import org.junit.Test;

/*
 * 包装类的使用
 * 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有了类的特征
 * 
 * 2.基本数据类型、包装类、String类三者之间的相互转化
 * 
 */
public class WrapperTest {
	
	//String类型---->基本数据类型、包装类
	//方法：调用相应包装类的parseXXX
	@Test
	public void test5(){
		String str1="123";
		int num2=Integer.parseInt(str1);
		System.out.println(num2+1);
		
		String str2="true";
		boolean b1=Boolean.parseBoolean(str2);
		System.out.println(b1);
	}
	
	//基本数据类型、包装类---->String类型
	@Test
	public void test4(){
		int num1=10;
		//方式一：连接运算
		String str1=num1+"";
		
		Integer i1=num1;
		String str2=i1+"";
		
		//方式二：调用String.valueOf();
		float f1=12.3f;
		String str3=String.valueOf(f1);
		
		Double d1=new Double(12.4);
		String str4=String.valueOf(d1);
		System.out.println(str3);
		System.out.println(str4);
	
	}
	/*
	 * JDK 5.0型特性：自动装箱与自动拆箱
	 */
	@Test
	public void test3() {
		int num1=10;
		Integer in1=num1;//==>Integer in1=new Integer(num1);自动装箱
		
		boolean b1=true;
		Boolean b2=b1;//自动装箱
		
		int num3=in1;//===>	int num3=in1.intValue();//自动拆箱	
	}
	
	//包装类--->基本数据类型
	@Test
	public void test2() {
		Integer in1=new Integer(11);
		int i1=in1.intValue();
		System.out.println(i1+1);
		
		Float f1=new Float(1.2);
		float f2=f1.floatValue();
		System.out.println(f2+1);
	}
	
	//基本数据类型-->包装类：调用包装类的构造器
	@Test
	public void test1() {
		int num1=10;
		Integer in1=new Integer(num1);
		System.out.println(in1.toString());//因为此时Integer重写了toString()，所以输出的为对象实体内容，而不是地址值
		Integer in2=new Integer(10);
		System.out.println(in2);
		Integer in3=new Integer("10");
		System.out.println(in3.toString());
		
		Float f1=new Float(10.2);
		System.out.println(f1.toString());
		Float f2=new Float("10.2");
		System.out.println(f2);
		
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean("TrUe");
		System.out.println(b2);
		
	Order order=new Order();
	System.out.println(order.isMale);
	System.out.println(order.isFeMale);
	}
}
class Order{
	
	boolean isMale;
	Boolean isFeMale;
}
