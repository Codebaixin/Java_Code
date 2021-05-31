package com.atguigu.Exer1;
/*
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，
 * 同时声明公共方法访问私有变量。此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */
public class ThiAngleTest {
	public static void main(String[] args) {
		ThiAngle t1=new ThiAngle();
		ThiAngle t2=new ThiAngle(3,5);
		ThiAngleTest area=new ThiAngleTest();
		
		t1.setBase(4);
		t1.setHeight(5);
		System.out.println("base="+t1.showBase()+",height="+t1.showHeight());
		System.out.println(area.area(t1.showBase(), t1.showHeight()));
		
		System.out.println("base="+t2.showBase()+",height="+t2.showHeight());
		System.out.println(area.area(t2.showBase(), t2.showHeight()));
		}
		
	public double area(double a,double b) {
		return a*b*0.5;
		}
}
