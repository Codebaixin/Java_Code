package com.atguigu.exer1;

public class CylinderTest {
	public static void main(String[] args) {
		Cylinder cylinder=new Cylinder();
		cylinder.setRadius(3.0);
		cylinder.setLength(5.0);
		System.out.println("底面圆的面积为："+cylinder.findArea());
		System.out.println("该圆柱体体积为："+cylinder.findVolume());
	}
}
