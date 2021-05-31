package com.atguigu.java1;
/*
 * 类的结构之三：构造器(或构造方法、constructor)的使用
 * constructor：
 * 1.构造器的作用：
 * 创建对象
 * 
 * 2.说明：
 * 2.1如果没有显式的定义类的构造器，则系统默认提供一个空参的构造器。
 * 2.2定义构造器的格式：权限修饰符 类名(形参列表){}
 * 2.3初始化对象的信息
 * 2.4一个类中定义的多个构造器，彼此构成重载
 * 2.5一旦我们显示定义了类的构造器之后，系统就不在提供默认的空参构造器。
 * 2.6一个类中，至少会有一个构造器
 */
public class PersonTest {
	public static void main(String[] args) {
		//创建对象：new+构造器
		Person p=new Person();
		p.eat();
		
		Person p1=new Person("Tom");
		System.out.println(p1.name);
		
		Person p2=new Person("Tom",12);
		System.out.println(p2.age);
		
	}
}
class Person{
	//属性
	int age;
	String name;
	
	//构造器
	public Person() {
		System.out.println("Person()....");
	}
	public Person(String n) {
		name=n;
	}
	public Person(String n,int a) {
		name=n;
		age=a;
	}
	//方法
	public void eat() {
		System.out.println("人吃饭");
	}
	public void study() {
		System.out.println("人可以学习");
	}
}
