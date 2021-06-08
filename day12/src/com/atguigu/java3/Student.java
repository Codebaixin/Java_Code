package com.atguigu.java3;

public class Student extends Person{
	String major;
	int id=1002;
	public Student() {
		
	}
	public Student(String major) {
		this.major=major;
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("学生，应该多吃有营养的食物");
	}
	public void study() {
		System.out.println("学生：学习知识");
		this.eat();
		super.eat();
		this.sleep();
		super.sleep();
	}
	
	public void show() {
		System.out.println("name="+this.name+",age="+super.age);
		System.out.println("id="+this.id);
		System.out.println("id="+super.id);
	}
}
