package com.atguigu.java5;

import java.sql.Date;

public class Person {
	public String name;
	private int age;
	private Date birthDate;
	
	public Person(String name, int age, Date d) {
		this.name = name;
		this.age = age;
		this.birthDate = d; 
		}
	public Person(String name, int age) {
		this(name, age, null);
		}
	public Person(String name, Date d) {
			this(name, 30, d);
		}
	public Person(String name) {
		this(name, 30);
		} 

}
