package com.atguigu.java8;
/*
 * JDK8：除了定义了以上成员外，还外加了静态方法、默认方法
 */
public interface CompareA {
	//静态方法
	public static void method1() {
		System.out.println("CompareA：北京");
	}
	//默认方法
	public default void method2() {
		System.out.println("CompareB:上海");
	}
	default void method3() {
		System.out.println("CompareC:成都");
	}
}
