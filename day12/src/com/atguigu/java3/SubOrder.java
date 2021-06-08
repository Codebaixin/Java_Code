package com.atguigu.java3;

import com.atguigu.java2.Order;

public class SubOrder extends Order{
	public void method() {
		orderPortected=1;
		orderPublic=2;
		
		methodProtected();
		methodPublic();
		//The field Order.orderPrivate is not visible
//		orderPrivate=1;
//		orderDefault=2;
//		methodPrivate();
//		methodDefault();
	}

}
