package com.atguigu.java;
/*
 * 抽象类的匿名子类
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		PersonTest.method(new Student());
		
		Worker worker=new Worker();
		method1(worker);//非匿名的类非匿名的对象
		
		method1(new Worker());//非匿名的类匿名的对象
		
		//创建了一个匿名子类的非匿名对象:p
		Person p=new Person() {
			@Override
			public void eat() {
				System.out.println("吃东西");
			}
			@Override
			public void breath() {
				System.out.println("好好呼吸");
			}	
		};
		method1(p);
		
		//创建了匿名子类的匿名对象
		method1(new Person() {
			@Override
			public void eat() {
				System.out.println("吃好吃的东西");
			}
			@Override
			public void breath() {
				System.out.println("好好呼吸新鲜空气");
			}
		});
	}
	public static void method(Student s) {
		
	}	
	public static void method1(Person p) {
		p.eat();
		p.breath();
	}
}
class Worker extends Person{
	@Override
	public void eat() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void breath() {
		// TODO Auto-generated method stub	
	}
}