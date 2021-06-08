package com.atguigu.java1;

public class Student extends Person{
	String major;
	
	public Student(String major) {
		this.major=major;
	}
	
	public void study() {
		System.out.println("学习");
	}
	
	//Person中方法的重写
	public void eat() {
		System.out.println("学生应该多吃点");
	}
	public String info() {
		return "123";
	}
	public void walk(int distence) {
		System.out.println("重写的方法");
	}
	
}
