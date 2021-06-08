package com.atguigu.exer;
/*
 * 定义类Kids继承ManKind，并包括成员变量int yearsOld； 
 * 方法printAge()打印yearsOld的值。
 */
public class Kids extends ManKind {
	int yearsOld;
	public void printAge() {
		System.out.println(yearsOld);
	}
	
	public void employeed() {
		System.out.println("Kids should study and no job.");
	}
}
