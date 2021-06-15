package com.atguigu.exer;

public class AccountTest {
	public static void main(String[] args) {
		Account acct1=new Account();
		Account acct2=new Account("qwerty",2000);
		
		Account.setIntersetRate(0.015);
		Account.setMinmoney(2000);
		
		System.out.println(acct1);
		System.out.println(acct2);
		
		System.out.println(acct1.getIntersetRate());
		System.out.println(acct1.getMinmoney());
	}
}
