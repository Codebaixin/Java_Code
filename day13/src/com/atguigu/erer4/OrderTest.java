package com.atguigu.erer4;

/*
 * .编写Order类，有int型的orderId，String型的orderName，相应的getter()和setter()方法，两个参数的构造器，
 * 重写父类的equals()方法：public boolean equals(Object obj)，
 * 并判断测试类中创建的两个对象是否相等。
 */
public class OrderTest{
	public static void main(String[] args) {
		Order o1=new Order(1234, "Tom");
		Order o2=new Order(1232, "Tom");
		System.out.println(o1.equals(o2));
	}
}

class Order {
	private int orderId;
	private String orderName;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Order) {
			Order o = (Order) obj;
			if (o.orderId == this.orderId && this.orderName.equals(o.orderName)) {
				return true;
			} else {
				return false;
			}
		} 
		return false;
	}
	
}
