package com.atguigu.erer3;

public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test=new GeometricTest();
		test.equalsArea(new Circle("yellow", 0, 3), new MyRectangle("red", 0, 4, 5));
		double area1=test.displayGeometricObject(new Circle("yellow", 0, 3));
		System.out.println(area1);
		double area2=test.displayGeometricObject(new MyRectangle("red", 0, 4, 5));
		System.out.println(area2);
	}
	
	public void equalsArea(GeometricObject a,GeometricObject b) {
		if(a.findArea()==b.findArea()) {
			System.out.println("面积相等");
		}else {
			System.out.println("面积不相等");
		}
	}
	
	public double displayGeometricObject(GeometricObject a) {
		return a.findArea();
	}
}
