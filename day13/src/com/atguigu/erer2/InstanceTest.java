package com.atguigu.erer2;

public class InstanceTest {
	public static void main(String[] args) {
		InstanceTest test=new InstanceTest();
		test.method(new Student());
	}
	public void method(Person e) {
		String info=e.getInfo();
		System.out.println(info);
		
		if(e instanceof Graduate) {
			System.out.println("a graduated student\n"+"a student\n"+"a person\n");
		}else if(e instanceof Student) {
			System.out.println("a graduated student\n"+"a student\n");
		}else {
			System.out.println("a graduated student");
		}	
	}
}

class Person {
	protected String name = "person";
	protected int age = 50;

	public String getInfo() {
		return "Name: " + name + "\n" + "age: " + age;
	}
}

class Student extends Person {
	protected String school = "pku";

	public String getInfo() {
		return "Name: " + name + "\nage: " + age + "\nschool: " + school;
	}
}

class Graduate extends Student {
	public String major = "IT";

	public String getInfo() {
		return "Name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor:" + major;
	}
}
