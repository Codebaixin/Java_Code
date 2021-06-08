package com.atguigu.java6;

public class Woman extends Person{
	boolean isBeauty;
	
	public void goShopping() {
		System.out.println("女人喜欢疯狂购物");
	}
	
	@Override
	public void eat() {
		System.out.println("女人吃的少，要减肥");
	}
	@Override
	public void walk() {
		System.out.println("女人窈窕的走路");
	}
}
