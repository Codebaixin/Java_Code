package com.atguigu.java1;

public class Person {
	String name;
	int age;
	
	public Person() {
		
	}
	public void eat() {
		System.out.println("吃饭");
	}
	public void walk(int distence) {
		System.out.println("走路，一共走了："+distence+"公里");
	}
	public Object info() {
		return null;
	}
}
