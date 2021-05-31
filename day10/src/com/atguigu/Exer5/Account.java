package com.atguigu.Exer5;

public class Account {
	public double balance;
	
	public Account(double init_balance) {
		balance=init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	//存钱操作
	public void deposit(double amt) {
		if(amt>=0) {
			balance+=amt;
		}
	}
	//取钱操作
	public void withdraw(double amt) {
		if(amt<=balance) {
			balance-=amt;
			System.out.println("取钱成功");
		}else {
			System.out.println("余额不足");
		}
	}
}
