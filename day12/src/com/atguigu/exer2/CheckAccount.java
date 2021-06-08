package com.atguigu.exer2;

public class CheckAccount extends Account{
	private double overdraft;//可透支限额
	
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft=overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}


	public void withdraw(double amount) {
		if(amount<=getBalance()) {
//			super.setBalance(getBalance()-amount);
			super.withdraw(amount);
		}else if((amount-getBalance())<=overdraft) {
			overdraft-=(amount-getBalance());
//			System.out.println("可透支余额还剩："+overdraft);
//			setBalance(0);
			super.withdraw(getBalance());
		}else {
			System.out.println("超过可透支限额");
		}
	}
}
