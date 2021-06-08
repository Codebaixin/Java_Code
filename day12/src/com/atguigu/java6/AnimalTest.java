package com.atguigu.java6;
//多态性举例
public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest test=new AnimalTest();
		test.function(new Dog());
		test.function(new Cat());
	}
	
	public void function(Animal animal) {//Animal animal=new Dog();Animal animal=new Cat();
		animal.eat();
		animal.shout();
	}
	//如果没有多态性，想要调用子类中的方法，则必须要构造很多的重载方法
}

class Animal{
	public void eat() {
		System.out.println("动物进食");
	}
	public void shout() {
		System.out.println("动物咆哮");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void shout() {
		System.out.println("喵喵喵");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("狗啃骨头");
	}
	public void shout() {
		System.out.println("汪汪汪");
	}
}