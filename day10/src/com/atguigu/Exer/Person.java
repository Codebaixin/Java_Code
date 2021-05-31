package com.atguigu.Exer;

public class Person {
	private int age;
	String name;
	boolean isMale;
	public void setAge(int l) {
		if(l>=0 && l<=130) {
			age=l;
		}else {
			System.out.println("输入错误");
		}
	}
	public int getAge() {
		return age;
	}
}
