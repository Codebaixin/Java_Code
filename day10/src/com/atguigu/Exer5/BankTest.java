package com.atguigu.Exer5;

public class BankTest {
	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.addCustomers("Jane", "Smith");
		bank.getCustomer(0).setAccount(new Account(2000));
		bank.getCustomer(0).getAccount().withdraw(500);
		
		double balance=bank.getCustomer(0).getAccount().getBalance();
		System.out.println("客户："+bank.getCustomer(0).getFirstName()+"账户余额为："+balance);
		System.out.println("***************************");
		
		bank.addCustomers("Durant", "Kiven");
		System.out.println("银行的客户人数为："+bank.getNumOfCustomers());
	}
}
