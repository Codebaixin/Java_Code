package com.atguigu.exer;
/*
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
 * 定义封装这些属性的方法。账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * 考虑：哪些属性可以设计成static属性。
 */
public class Account {
	private int id;
	private String password;
	private double balance;
	
	private static double intersetRate;
	private static double minmoney=1.0;
	private static int init=1001;//用于自动生成id使用
	
	public Account() {
		id=init++;
	}
	public Account(String password,double balance) {
		this();
		this.password=password;
		this.balance=balance;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public static double getIntersetRate() {
		return intersetRate;
	}
	public static void setIntersetRate(double intersetRate) {
		Account.intersetRate = intersetRate;
	}
	public static double getMinmoney() {
		return minmoney;
	}
	public static void setMinmoney(double minmoney) {
		Account.minmoney = minmoney;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", password=" + password + ", balance=" + balance + "]";
	}
	
}
