package com.atguigu.Exer;
/*
 * 声明一个日期类型MyDate：有属性：年year,月month，日day。创建2个日期
 * 对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息。
 */
public class Exer6Test {
	public static void main(String[] args) {
		MyDate birth=new MyDate();
		birth.year=1995;
		birth.month=8;
		birth.day=23;
		MyDate birthFriend=new MyDate();
		birthFriend.year=1996;
		birthFriend.month=11;
		birthFriend.day=23;
		System.out.println("我的生日："+birth.year+"."+birth.month+"."+birth.day);
		System.out.println("女朋友生日："+birthFriend.year+"."+birthFriend.month+"."+birthFriend.day);
	}

}

class MyDate{
	int year;
	int month;
	int day;
}