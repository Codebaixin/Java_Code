package com.atguigu.Exer1;

public class ThiAngle {
	//属性
	private double base;
	private double height;
	
	//构造器
	public ThiAngle() {
		
	}
	public ThiAngle(double a,double b) {
		base=a;
		height=b;
	}
	
	//方法
	public double showBase() {
		return base;
	}
	public void setBase(double a) {
		base=a;
	}
	public double showHeight() {
		return height;
	}
	public void setHeight(double a) {
		height=a;
	}
}
