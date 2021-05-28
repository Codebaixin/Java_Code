package com.atguigu.java;
/*
 * 匿名对象的使用
 * 1.理解：我们创建了对象，没有显示的赋给一个变量名。即为匿名对象
 * 2.特征：匿名对象只能调用一次。
 * 3.使用如下：
 */
public class Instance {
	public static void main(String[] args) {
		Phone p=new Phone();
		System.out.println(p);
		
		p.sendEmail();
		p.playGames();
		
		//匿名对象
		new Phone().sendEmail();
		new Phone().playGames();
		
		new Phone().price=1999;
		new Phone().showPrice();//0.0
		
		PhoneMall mall=new PhoneMall();
//		mall.show(p);
		//匿名对象的使用
		mall.show(new Phone());
	}

}

class PhoneMall{
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGames();
	}
}
class Phone{
	double price;
	public void sendEmail() {
		System.out.println("发送邮件");
	}
	public void playGames() {
		System.out.println("玩游戏");
	}
	public void showPrice() {
		System.out.println("手机的价格为："+price);
	}
}