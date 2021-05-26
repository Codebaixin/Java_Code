package com.atguigu.java;
/*
 * 1.类的设计，其实就是类的成员的设计
 * 
 * 属性=成员变量=field=域、字段
 * 方法=成员方法=函数=method
 * 
 * 创建类的对象=类的实例化=实例化类
 * 
 * 2.类和对象的使用(面向对象思想的落地实现)
 * 1)创建类和设计类的成员
 * 2)创建类的对象
 * 3)通过“对象.方法”和“对象.属性”调用对象的结构
 * 
 * 3.如果创建了一个类的多个对象，则每个对象拥有一套独立的类的属性，(非static的)
 * 意味着：我们修改一个对象的属性a，则不影响另一个对象属性a的值。
 * 
 * 4.对象的内存解析
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		//2.创建Person的对象。
		Person p1=new Person();
		//Scanner scan=new Scanner(System.in);
		
		//3.调用对象的结构：属性，方法
		//调用属性：“对象.属性”
		p1.name="Tom";
		p1.isMale=false;
		System.out.println(p1.name);
		
		//调用方法：“对象.方法”
		p1.eat();
		p1.sleep();
		p1.talk("chinese");
		
		Person p2=new Person();
		System.out.println(p2.name);//null
		System.out.println(p2.isMale);//flase
		
		//将p1对象的地址赋值给p3，导致了p1，p3指向了堆空间中的同一对象实体。
		Person p3=p1;
		System.out.println(p3.name);
		
		p3.age=10;
		System.out.println(p1.age);
	}

}

//1.创建Person类和成员
class Person{
	//属性
	String name;
	int age=1;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("人可以吃饭");
	}
	
	public void sleep(){
		System.out.println("人可以睡觉");
	}
	
	public void talk(String language) {
		System.out.println("人可以说话，使用的语言是:"+language);
	}
}