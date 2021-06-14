package com.atguigu.java;
/*
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.eat();
		
		Man man=new Man();
		man.age=25;
		man.earnMoney();
		man.eat();
		
		Person p2=new Woman();//多态性的体现
		p2.eat();
		p2.walk();
		
		Person p3=new Man();
		p3.age=20;
		System.out.println(p3.age);
		System.out.println(p3.id);
		
		//不能调用子类所特有的方法、属性，编译时，p2是Person类型。
//		p3.earnMoney();
//		p3.isSmoking=true;
		//有了对象的多态性后，内存实际上是加载了子类所特有的属性和方法的，但是由于变量申明为父类类型，导致
		//编译时，只能调用父类中声明的属性和方法。子类所特有的属性和方法不能调用。
		
		//如何才能调用子类所特有的属性和方法
		//向下转型，使用强制类型转换符
		Man m1=(Man)p3;
		m1.earnMoney();
		m1.isSmoking=true;
		
		Woman w1=(Woman)p2;
		w1.goShopping();
		
		//使用强制转换时，可能出现ClassCastException的异常
//		Woman w2=(Woman)p3;
//		w2.goShopping();
		
		//instanceof关键字的使用
		
		//x instanceof A：检验x是否为类A的对象，返回值为boolean型。是：true;否：false。
		//为了避免向下转型可能出现ClassCastException的异常，我们在向下转型前先进行instanceof判断
		//若x instanceof A的返回值为true，则x instanceof B的返回值也为true(其中类B为A的父类)
		if(p3 instanceof Man) {
			Man m2=(Man)p3;
			m2.earnMoney();
			System.out.println("**********Man*********");
		}
		if(p3 instanceof Woman) {
			Woman m3=(Woman)p3;
			m3.goShopping();
			System.out.println("**********Woman*********");
		}
		if(p3 instanceof Person) {
			System.out.println("**********Person*********");
		}
		if(p3 instanceof Object) {
			System.out.println("**********Object*********");
		}
	}
}
