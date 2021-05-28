package com.atguigu.java1;
/*
 * 可变个数形参的方法
 * 
 * 1.可变个数形参的格式：数据类型...变量名
 * 2.当调用可变个数形参的方法时，可以传入的参数个数可以是：0个，1个，2个。。。
 * 3.可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载。
 * 4.可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载，不能共存
 * 5.可变个数形参在方法的形参中，必须声明末尾
 * 6.可变个数形参在方法的形参中，最多只能声明一个可变形参
 */
public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test=new MethodArgsTest();
		test.show(12);
		test.show("hello");
		test.show("hello","world");
		test.show();
		
 		test.show("AA","BB","CC");//1
//		test.show(new String[] {"AA","BB","CC"});//2
		
	}
	public void show(int i) {
		
	}
	public void show(String s) {
		System.out.println("show(String)");
	}
	public void show(String ... strs) {//1
		System.out.println("show(String ... strs)");
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
//	public void show(String[] strs) {//2
//		
//	}
}
