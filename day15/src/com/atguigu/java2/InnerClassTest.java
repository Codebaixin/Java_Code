package com.atguigu.java2;

import com.atguigu.java2.Person.Bird;

/*
 * 类的成员之五：内部类
 * 1.java中允许一个类A声明在另一个类B中，则A称为内部类，B为外部类
 * 
 * 2.内部类的分类：成员内部类(静态、非静态) VS 局部内部类(方法内、代码块内、构造器内)
 * 
 * 3.成员内部类：
 * 		3.1作为外部类成员：
 * 			>调用外部类的结构
 * 			>可以被static修饰
 * 			>可以被4种不同的权限修饰
 * 		3.2作为一个类：
 * 			>类内可以定义属性、方法、构造器等
 * 			>可以被final修饰，表明此类不能被继承。不使用final，就可以被继承
 * 			>可以被abstract修饰
 * 
 * 4.如何实例化内部类的对象
 * 5.如何在成员内部类中区分调用外部类的结构
 * 6.开发中局部类的使用《见InnerClassTest1.java》
 * 7.静态内部类中可以声明静态和非静态结构，但非静态内部类中一定不能声明静态结构。
 */
public class InnerClassTest {
	public static void main(String[] args) {
		//创建Dog实例(静态的成员内部类)
		Person.Dog dog=new Person.Dog();
		dog.show();
		//创建Bird实例(非静态的成员内部类)
		Person p=new Person();
		Person.Bird bird=p.new Bird();
		bird.sing();
		System.out.println("******************");
		bird.display("黄鹂");
	}
}

class Person{
	String name="小明";
	int age;
	
	public void eat() {
		System.out.println("人吃饭");
	}
	
	public static class Dog{//静态内部类
		String name;
		int age;
		public void show() {
			System.out.println("狗表演跳舞");
		}	
	}
	final class Bird{//非静态内部类
		String name="杜鹃";
		int age;
		public void sing() {
			System.out.println("我是一只小小鸟");
			Person.this.eat();//调用外部类的非静态属性
			System.out.println(age);
			System.out.println(Person.this.age);
		}
		public Bird(){
			
		}
		public void display(String name) {
			System.out.println(name);//方法的形参
			System.out.println(this.name);//内部类的属性
			System.out.println(Person.this.name);//外部内的属性
		}
	}
	
	public void method() {
		class AA{
			
		}
	}
	
	{
		class BB{
			
		}
	}
	
	public Person() {
		class CC{
			
		}
	}
}