package com.atguigu.java2;

public class OrderTest {
	public static void main(String[] args) {
		Order order=new Order();
		order.orderDefault=1;
		order.orderPortected=2;
		order.orderPublic=3;
		
		order.methodDefault();
		order.methodProtected();
		order.methodPublic();
		
		//The field Order.orderPrivate is not visible
//		order.orderPrivate=1;
//		order.methodPrivate();
	}
}
