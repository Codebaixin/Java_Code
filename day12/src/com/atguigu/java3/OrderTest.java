package com.atguigu.java3;

import com.atguigu.java2.Order;

public class OrderTest {
	public static void main(String[] args) {
		Order order=new Order();
		order.orderPublic=1;
		order.methodPublic();
		
		//The field Order.orderPrivate is not visible
//		order.orderPrivate=1;
//		order.orderDefault=2;
//		order.orderProtected=3;
//		order.methodPrivate();
//		order.methodDefault();
//		order.methodProtected();
		
	}
}
