package com.atguigu.exer;

public class Manager extends Employee{
	private double bonus;
	
	public Manager(double bonus) {
		super();
		this.bonus=bonus;
	}
	public Manager(String name, String id, double salary,double bonus) {
		super(name, id, salary);
		this.bonus=bonus;
	}
	
	@Override
	public void work() {
		System.out.println("主管,负责员工日常事务");
	}
	
}
