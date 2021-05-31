package com.atguigu.java2;
/*
 * this关键字的使用
 * 1.this可以修饰：属性、方法、构造器
 * 
 * 2.this修饰属性和方法
 * 	此时this理解为:当前对象或当前正在创建的对象
 * 
 * 2.1在类的方法中，我们使用“this.属性”或“this.方法”的方式，调用当前对象属性或方法。但是通常情况下，我们选择省略
 * “this.”。特殊情况下，如果方法的形参和类的属性同名时，我们必须显式的使用“this.变量”的方式。表明此变量是属性，而非形参。
 * 
 * 2.2在类的构造器中，我们使用“this.属性”或“this.方法”的方式，调用当前对象属性或方法。但是通常情况下，我们选择省略
 * “this.”。特殊情况下，如果构造器的形参和类的属性同名时，我们必须显式的使用“this.变量”的方式。表明此变量是属性，而非形参。
 * 
 * 3.this调用构造器
 * 3.1我们在类的构造器中，可以显示的使用“this(形参列表)”方式，调用本类中指定的其他构造器
 * 3.2构造器中不能通过“this(形参列表)”方式调用自己
 * 3.3如果一个类中有n个构造器，最多只有n-1个构造器使用了“this(形参列表)”方式
 * 3.4规定：“this(形参列表)”必须申明在当前构造器的首行
 * 3.5构造器内部，最多只能申明一个“this(形参列表)”，用来调用其他构造器。
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setAge(1);
		System.out.println(p1.getAge());
		p1.study();
		
		System.out.println();
		
		Person p2=new Person("jaay",20);
		System.out.println(p2.getAge());
	}
}
class Person{
	//属性
	private String name;
	private int age;
	
	//构造器
	public Person() {
		this.eat();
		String info="Person初始化代码，共40行";
		System.out.println(info);
	}
	public Person(String name) {
		this.name=name;
	}
	public Person(int age) {
		this();
		this.age=age;
	}
	public Person(String name,int age) {
		this(age);
		this.name=name;
//		this.age=age;
	}
	
	//方法
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void eat() {
		System.out.println("人吃饭");
	}
	public void study() {
		System.out.println("人学习");
		this.eat();
	}
}