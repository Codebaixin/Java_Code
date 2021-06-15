package com.atguigu.java;
/*
 * static关键字的使用
 * 
 * 1.static:静态的
 * 2.static可以用来修饰：属性、方法、代码块、内部类
 * 
 * 3.使用static修饰属性：静态变量(类变量)
 * 		3.1属性：按是否使用static修饰，又分为：静态属性 VS 非静态属性(实例变量)
 * 		实例变量:我们创建了类的多个对象，每个对象都拥有一套独立的类的非静态属性，当修改其中的一个对象中的
 * 				 非静态属性时，不会导致其他对象中同样的属性值修改
 * 		静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量，当通过某一个对象修改静态变量时，
 * 				 必然导致其他对象调用此静态变量时，是修改过了的。
 * 		3.2其他说明
 * 				静态变量是随着类的加载而加载的，实例变量是随着对象的加载而加载的,可以通过"类.静态变量"的方式进行调用
 * 				静态变量加载要早于对象的创建。
 * 				由于类只加载一次，则静态变量在内存中仅存在一份，存在于方法区中的静态域中
 * 				
 * 								类变量				实例变量
 * 				类				y						n
 * 				对象				y						y
 * 	
 * 4.使用static修饰方法：静态方法
 * 			随着类的加载而加载，可以通过"类.静态方法"的方式进行调用	
 * 
 *							静态方法				      非静态方法
 * 				类				y						n
 * 				对象				y						y	
 * 
 * 			静态方法中，只能调用静态的方法和属性
 * 			非静态方法中，既可以调用静态的方法和属性，也可以调用非静态的方法和属性
 * 
 * 5.静态的方法内，不能使用this,super关键字
 * 
 * 6.开发中，如何确定一个属性是否声明为static的？
 * 		属性是可以对多个对象进行共享，不会随着对象的不同而不同
 * 		类中的常量也常常声明为static
 * 	
 * 	开发中，如何确定一个方法是否声明为static的？
 * 		操作静态属性的方法，通常设置为static
 * 		工具类中的方法，习惯上声明为static的，比如Math、Arrays、Collections
 * 
 */
public class StaticTest {
	public static void main(String[] args) {
		
		Chinese.nation="中国";
		
		Chinese c1=new Chinese();
		c1.name="姚明";
		c1.age=40;
		
		Chinese c2=new Chinese();
		c2.name="易建联";
		c2.age=30;
		c2.nation="CHN";
		
		System.out.println(c1.nation);
		c1.eat();
		Chinese.sleep();
		
	}
}
class Chinese{
	String name;
	int age;
	static String nation;
	
	public void eat() {
		System.out.println("吃饭");
		Chinese.walk();
		System.out.println(Chinese.nation);
	}
	public static void sleep() {
		System.err.println("睡大觉");
	}
	public static void walk() {
		System.out.println("走路");
	}
}
