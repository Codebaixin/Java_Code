package com.atguigu.Exer4;
/*
 * 账户id1000，账户存款2000，年利率0.0123
 * 对Jean Smith操作
 * 存入100元，再取出960元，再取出2000元。
 * 打印出Jean Smith的基本信息
 */
public class CostumerTest {
	public static void main(String[] args) {
		Costumer cust=new Costumer("Jean","Smith");
		
		Account acct=new Account(1000,2000,0.0123);
		
		cust.setAccount(acct);
		
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(2000);
		System.out.println("Costumer ["+cust.getLastName()+","+cust.getFirstName()+"] has a account:id is "+cust.getAccount().getId()+
				" annualInterestRate is "+cust.getAccount().getAnnualInterestRate()*100+"%,balance is "+cust.getAccount().getBalance());
	}

}
