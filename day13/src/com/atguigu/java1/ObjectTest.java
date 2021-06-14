package com.atguigu.java1;
/*
 * java.lang.Object类
 * 1.Object类是所有Java类的根父类
 * 2.如果在类的声明中未使用extends关键字指明其父类，则默认父类 为java.lang.Object类。
 * 3.Object类中的属性、方法就具有通用性
 */
public class ObjectTest {
	public static void main(String[] args) {
		Order order=new Order();
		System.out.println(order.getClass().getSuperclass());//order.getClass()获取order对象所属的类，
		//order.getClass().getSuperclass()获取order对象所属类的父类，
	}
}
class Order{
	
}
