package com.atguigu.erer5;

public class Test {
	public static void main(String[] args) {
		Circle c1=new Circle(3.0, "white", 2.0);
		Circle c2=new Circle(3.1);
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c1.color.equals(c2.color));//此时利用的String类下改写的equals()
		
	}
}
