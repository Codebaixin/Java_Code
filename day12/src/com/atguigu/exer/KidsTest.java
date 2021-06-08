package com.atguigu.exer;
/*
 * 定义类KidsTest，在类的main方法中实例化Kids的对象someKid，
 * 用该对象访问其父类的成员变量及方法。
 */
public class KidsTest {
	public static void main(String[] args) {
		
		ManKind man=new ManKind();
		Kids someKid=new Kids();
		someKid.sex=0;
		someKid.salary=100000;
		someKid.manOrWoman();
		someKid.employeed();

//在Kids中重新定义employeed()方法，覆盖父类ManKind中定义的employeed()方法，输出“Kids should study and no job
		man.employeed();
	}
}
