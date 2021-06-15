package com.atguigu.java2;
/*
 * final关键字：最终的
 * 
 * 1.final可以用来修饰的结构：类、方法、变量
 * 
 * 2.final用来修饰一个类：此类就不能被其他类所继承
 * 			比如：String类、System类、StringBuffer类
 * 
 * 3.final修饰方法：表明此方法不可以被重写
 * 			比如：Object类中的getClass();
 * 
 * 4.final修饰变量：此时的“变量”被称为常量。
 * 			4.1final修饰属性：可以考虑赋值的位置为：显示初始化、代码块中初始化、构造器初始化
 * 			4.2final修饰局部变量：
 * 					尤其是使用final修饰形参时，表明此形参是一个常量，当我们调用此方法时，给形参常量赋一个实参，
 * 					一旦赋值以后，就只能在方法体内使用此形参，但不能进行重新赋值。
 * 
 * static final：用来修饰属性：全局常量
 */
public class FinalTest {
	final int WIDTH=0;
	final int LEFT;
	final int RIGHT;
	static final int sd;//final修饰的静态属性，不能在非静态代码块中赋值。
//	final int DOWN;
	
	{
		LEFT=1;
	}
	static {
		sd=1;
	}
	public FinalTest() {
		RIGHT=1;
	}
	public FinalTest(int n) {
		RIGHT=n;
	}
//	public void setDown(int down) {
//		this.DOWN=down;
//	}
	
	public void show() {
		final int NUM=10;//常量
//		NUM+=20;
	}
	public void show(final int num) {
//		num=20;
		System.out.println(num);
	}
	public static void main(String[] args) {
		FinalTest test=new FinalTest();
		test.show(10);
	}
		
}
final class FinalA{
	
}
//class B extends FinalA{//The type B cannot subclass the final class FinalA
//	
//}
class AA{
	public final void shoe(){
		
	}
}
class BB extends AA{
//	public void shoe() {
//		
//	}
}


