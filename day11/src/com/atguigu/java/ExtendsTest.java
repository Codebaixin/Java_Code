package com.atguigu.java;
/*
 * 面向对象的特征二：继承性
 * 
 * 1.优点
 * 1）减少了代码的冗余，提高了代码的复用性
 * 2）便于功能的扩展
 * 3）为多态性的使用，提供了前提
 * 
 * 2.继承性的格式 class A extends B{}
 * 	A:子类、派生类、subclass
 * 	B:父类、超类、superclass
 * 
 * 	2.1体现：一旦子类A继承了父类B后，子类A中中便获取了父类B中所有的属性和方法
 * 		特别是，父类中声明为private的属性或方法，子类继承了父类之后，仍然获得了父类中私有的
 * 		结构，只是因为封装性的影响，使得子类不能直接调用父类的结构
 * 	2.2子类继承父类后，还可以定义自己的属性和方法，实现功能的扩展。
 * 		子类和父类的关系，不同于子集和集合的关系。
 * 
 * 3.规定
 * 1）一个类可以被多个子类证明
 * 2）java中类的单继承性：一个类只能有一个父类
 * 3）子父类是相对的关系
 * 4）子类直接继承的类成为直接父类，间接继承的父类称为间接父类
 * 5）子类继承父类，就获取了直接父类和所有的间接父类的属性和方法
 * 
 * 4.
 * 1）如果我们没显示的申明一个类的父类的话，则此类继承于Java.lang.Object类。
 * 2）所有的java类（除Java.lang.Object类之外），都直接或间接的继承于Java.lang.Object类。
 * 3）所有的java类具有Java.lang.Object类声明的功能。
 * 
 */

public class ExtendsTest {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.eat();
		
		Student s1=new Student();
		s1.eat();
		s1.sleep();
		s1.name="Tom";
		s1.setAge(1);
		System.out.println(s1.getAge());
		s1.breath();
		
		Creature c=new Creature();
		System.out.println(c.toString());
	}
}
