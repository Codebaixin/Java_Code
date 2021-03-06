package com.atguigu.java2;
/*
 * 类的成员之四：代码块(或初始化块)
 * 1.代码块作用：对Java类或对象进行初始化
 * 
 * 2.代码块如果有修饰，只能使用static
 * 
 * 3.分类：静态代码块 VS 非静态代码块
 * 
 * 4.静态代码块
 * 		>内部可以有有输出语句
 * 		>随着类的加载而执行，而且只执行一次
 * 		>作用：初始化类的信息
 * 		>如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 		>静态代码块的执行要优先于非静态代码块的执行
 * 		>静态代码块内只能调用静态的属性、静态的方法，不能调用非静态结构
 * 
 * 5.非静态代码块
 * 		>内部可以有有输出语句
 * 		>随着对象的加载而执行
 * 		>作用：可以在创建对象时了，对对象的属性进行初始化
 * 		>如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 * 		>每创建一个对象，就执行一次非静态代码块
 * 		>非静态代码块内可以调用静态的属性、方法或非静态的属性、方法
 * 
 * 6.属性赋值的先后顺序：默认初始化->显示/代码块中赋值->构造器初始化->"对象.属性"和"对象.方法"
 */
public class Blocktest {
	public static void main(String[] args) {
		String desc=Person.desc;
		System.out.println(desc);
		
		Person p1=new Person();
		Person p2=new Person();
		System.out.println(p1.age);
		
		Person.info();
	}
}

class Person{
	//属性
	String name;
	int age;
	static String desc="我是一个人";
	
	//构造器
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//代码块
	static{
		System.out.println("hello,static block-1");
		desc="我是一个爱学习的人";
		info();
	}
	static{
		System.out.println("hello,static block-2");
	}
	
	{
		System.out.println("hello block-1");
		//调用非静态结构
		age=1;
		eat();
		//调用静态结构
		desc="我是一个爱学习的人";
		info();
	}
	{
		System.out.println("hello block-2");
	}
	
	//方法
	public void eat() {
		System.out.println("吃饭");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public static void info() {
		System.out.println("我是一个快乐的人");
	}
	
}
