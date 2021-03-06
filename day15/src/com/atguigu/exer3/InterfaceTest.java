package com.atguigu.exer3;
/*
 * 定义一个接口用来实现两个对象的比较。interface CompareObject{public int compareTo(Object o); 
 * 若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小}
 * 
 * 定义一个Circle类，声明redius属性，提供getter和setter方法
 * 
 * 定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。
 * 在ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半径大小。
 * 
 * 定义一个测试类InterfaceTest，创建两个ComparableCircle对象，调用compareTo方法比较两个类的半径大小。
 * 
 */
public class InterfaceTest {
	public static void main(String[] args) {
		ComparableCircle c1=new ComparableCircle(3.4);
		ComparableCircle c2=new ComparableCircle(3.3);
		int com=c1.compareTo(c2);
		if(com>0) {
			System.out.println("c1比c2大");
		}else if(com<0) {
			System.out.println("c1比c2小");
		}else {
			System.out.println("c1和c2一样大");
		}
	}
}

interface CompareObject{
	public abstract int compareTo(Object o);
}

class Circle{
	private double redius;

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}

	public Circle(double redius) {
		super();
		this.redius = redius;
	}

	public Circle() {
		super();
	}
}

class ComparableCircle extends Circle implements CompareObject{
	
	public ComparableCircle(double redius) {
		super(redius);
	}

	@Override
	public int compareTo(Object o) {
		if(this==o) {
			return 0;
		}
		if(o instanceof ComparableCircle) {
			ComparableCircle c=(ComparableCircle)o;
			if(this.getRedius()>c.getRedius()) {
				return 1;
			}else if(this.getRedius()<c.getRedius()) {
				return -1;
			}else {
				return 0;
			}
		}
		return 0;
	}	
}