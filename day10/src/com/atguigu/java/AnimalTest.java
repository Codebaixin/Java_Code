package com.atguigu.java;
/*
 * 面向对象的特征一：封装与隐蔽
 * 1.当我们创建一个类的对象以后，我们可以通过“对象.属性”的方式，对对象的属性进行赋值。这里，赋值操作要受到属性的数据类型
 * 和存储范围的制约。除此之外，没有其他约束条件。但是，在实际问题中，我们往往需要给属性赋值加入额外的限制条件。这个条件就
 * 不能在属性声明时体现，我们只能通过方法进行限制条件的添加。(比如setLeg)，同时，我们需要避免用户再使用“对象.属性”方式
 * 对属性进行赋值。则需要将属性声明为私有的(private)。
 * --->此时，针对于属性就体现了封装性。
 * 
 * 2.封装性的体现
 * 我们将类的属性xxx私有化(private)，同时提供公共(public)的方法来设置(setXxx)和获取(getXxx)此属性的值
 * 
 * 3.拓展
 * 封装性的体现有：1.如上所示的属性私有化(private);2.不对外暴露的私有方法;3.单例模式。。。
 * 
 * 4.封装性的体现，需要权限修饰符的配合。
 * 4.1java规定的四种权限修饰符(从小到大)：private,default(缺省),protected,public
 * 4.2四种权限可以修饰类和类的内部结构：属性、方法、构造器、内部类
 * 4.3具体的，四种权限都可以修饰类的内部结构：属性、方法、构造器、内部类
 * 				修饰类的话，只使用default(缺省),public
 *
 *总结封装性：java提供了4种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性大小
 */
public class AnimalTest {
	public static void main(String[] args) {
		Animal a=new Animal();
//		a.age=1;
		a.setAge(10);
		a.name="大黄";
//		a.leg=4;
		
		a.setLeg(6);
		a.show();
		System.out.println(a.getAge());
	}
}
class Animal{
	String name;
	private int age;
	private int leg;
	
	//对于leg属性的设置
	public void setLeg(int l) {
		if(l>=0 && l%2==0) {
			leg=l;
		}else {
			leg=0;
		}
	}
	//对于leg属性的获取
	public int getLeg() {
		return leg;
	}
	
	//对于对于age属性的获取
	public int getAge() {
		return age;
	}
	
	//对于对于age属性的设置
	public void setAge(int a) {
		age=a;
	}
	
	
	public void eat() {
		System.out.println("动物进食");
	}
	public void show() {
		System.out.println("name="+name+",age="+age+",leg="+leg);
	}
}