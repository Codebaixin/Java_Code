package com.atguigu.java1;
/*
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.java中，接口和类是并列的两个关系
 * 3.定义接口中的成员
 * 			3.1JDK7及以前：只定义全局常量和抽象方法
 * 					>全局常量：public static final的，但是书写时可以省略不写
 * 					>抽象方法：public abstract的，但是书写时可以省略不写
 * 			3.2JDK8：除了定义了以上成员外，还外加了静态方法、默认方法
 * 4.接口不能定义构造器，说明接口不能实例化
 * 
 * 5.java开发中，接口通过让类去实现(implements)的方式来使用
 * 		>如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 * 		>如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
 * 
 * 6.java类可以实现多个接口-->弥补了java单继承性的局限性
 * 		格式：class Aa extends Bb implements Cc,Dd,Ee
 * 
 * 7.接口与接口之间可以继承，而且可以多继承
 * 
 * 8.接口的具体使用，体现多态性
 * 9.接口，实际上可以看做是一种规范
 */
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flayable.MAX_SPEED);
		System.out.println(Flayable.MIN_SPEED);
		
//		Flayable.MIN_SPEED=2;//The final field Flayable.MIN_SPEED cannot be assigned
		Plane plane=new Plane();
		plane.fly();
		System.out.println(plane.MAX_SPEED);
	}
}
interface Flayable{
	//全局常量
	public static final int MAX_SPEED=7900;
	int MIN_SPEED=1;
	
	//抽象方法
	public abstract void fly();
	//省略了public abstract
	void stop();
}
interface Attackable{
	public abstract void attack();
	}
class Plane implements Flayable{

	@Override
	public void fly() {
		System.out.println("飞机起飞");
	}

	@Override
	public void stop() {
		System.out.println("飞机停止");
	}	
}
abstract class Kite implements Flayable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
	}
}

class Bullet extends Object implements Flayable,Attackable,CC{//显示的实现Billet

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
}
interface AA{
	void method1();
}
interface BB{
	void method2();
}
interface CC extends AA,BB{
	void method3();
}