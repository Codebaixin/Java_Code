package com.atguigu.java5;

public class Student extends Person {
	private String school;

	public Student(String name, int age, String s) {
		super(name, age);
		school = s;
	}

	public Student(String name, String s) {
		super(name);
		school = s;
	}
	
	// 编译出错: no super(),系统将调用父类无参数的构造器。
//	public Student(String s) {
//		school = s;
//	}
}
