package com.atguigu.Exer;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.d=2.1;
		System.out.println(circle.area());
	}
}

class Circle{
	double d;
	double area() {
		double s=3.14*d*d;
		return s;
	}
}