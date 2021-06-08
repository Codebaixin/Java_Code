package com.atguigu.java6;

public class Man extends Person{
	boolean isSmoking;
	int id=1002;
	
	public void earnMoney() {
		System.out.println("男人拼命挣钱");
	}
	
	@Override
	public void eat() {
		System.out.println("男人应该多吃点");
	}
	@Override
	public void walk() {
		System.out.println("男人霸气的走路");
	}
}
