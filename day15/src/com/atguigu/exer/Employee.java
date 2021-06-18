package com.atguigu.exer;

public abstract class Employee {
	private String name;
	private String id;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(String name,String id,double salary) {
		this();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public abstract void work();
}
