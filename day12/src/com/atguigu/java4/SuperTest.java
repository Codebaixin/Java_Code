package com.atguigu.java4;

class Person {
	protected String name = "张三";
	protected int age;
	public String getInfo() {
		return "Name: " + name + "\nage: " + age; 
		} 
	}
class Student extends Person {
	protected String name = "李四";
	private String school = "New Oriental";
	public String getSchool() {
		return school; 
		}
	public String getInfo() {
		return super.getInfo() + "\nschool: " + school;
		}
	}
public class SuperTest {
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.getInfo());
		}
}