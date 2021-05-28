package com.atguigu.exer;

public class Test {
	public static void main(String[] args) {
		int a=10;
		int b=10;
//		Test test=new Test();
//		test.method(a, b);
		method(a,b);
		System.out.println("a="+a);
		System.out.println("a="+a);
	}
	public static void method(int a,int b) {
		a=a*10;
		b=b*20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.exit(0);
	}
}
