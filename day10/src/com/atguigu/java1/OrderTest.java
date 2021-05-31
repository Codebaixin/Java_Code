package com.atguigu.java1;

import com.atguigu.java.Order;

public class OrderTest {
	public static void main(String[] args) {
		Order order=new Order();
		//出了Order类所属的包之后，私有的结构，缺省的结构就不可以调用了。
//		order.orderDefault=1;//The field Order.orderDefault is not visible
		order.orderPublic=1;
		//出了Order类之后，私有的结构就不可以调用了。
//		order.orderPrivate=1;//The field Order.orderPrivate is not visible
		
		//出了Order类所属的包之后，私有的结构，缺省的结构就不可以调用了。
//		order.methodDefault();//The method methodDefault() from the type Order is not visible
		order.methodPublic();
//		order.methodPrivate();//The method methodPrivate() from the type Order is not visible
	
	}
}
