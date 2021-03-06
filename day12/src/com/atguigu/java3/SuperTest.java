package com.atguigu.java3;


/*
 * super关键字
 * 1.super理解为：父类的
 * 2.super可以用来调用：属性、方法、构造器
 * 
 * 3.super使用：调用属性和方法
 * 3.1我们可以在子类的方法和构造器中。通过使用"super.属性"或者"super.方法"的方式，显示的调用父类中申明的属性和方法。
 * 但是通常情况下，我们习惯省略"super"
 * 3.2特殊情况：当子类和父类中定义了同名的属性，我们要想在子类中调用父类声明的属性，则必须显示的使用"super.属性"的
 * 方法，表明调用的是父类声明的属性
 * 3.3特殊情况：当子类重写了父类的方法后，我们要想在子类的方法中调用父类中被重写的方法时，则必须显示的使用"super.方法"的
 * 方式，表明调用的是父类中被重写的方法
 * 
 * 4.super使用：调用构造器
 * 4.1我们可以在子类的构造器中显示的使用“super(形参列别)”的形式，调用父类中声明的指定的构造器
 * 4.2“super(形参列别)”的使用，必须申明在子类构造器的首行
 * 4.3我们在类的构造器中，针对于“super(形参列别)”与“this(形参列别)”只能二选一，不能同时出现
 * 4.4在类构造器首行，没有显示的声明“super(形参列别)”与“this(形参列别)”，则默认调用的是父类中空参的构造器
 * 4.5在类的多个构造器中，至少有一个类的构造器使用了“super(形参列别)”，调用父类的构造器。
 */
public class SuperTest {
	public static void main(String[] args) {
		
		Student s1=new Student("Tom");
		System.out.println(s1.name);
		s1.eat();
	}
}
