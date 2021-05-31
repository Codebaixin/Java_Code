package com.atguigu.java;

public class OrderTest {
	public static void main(String[] args) {
		Order order=new Order();
		order.orderDefault=1;
		order.orderPublic=1;
		//出了Order类之后，私有的结构就不可以调用了。
//		order.orderPrivate=1;//The field Order.orderPrivate is not visible
		
		order.methodDefault();
		order.methodPublic();
//		order.methodPrivate();//The method methodPrivate() from the type Order is not visible
		
	}
}
