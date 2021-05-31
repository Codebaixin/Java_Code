package com.atguigu.Exer4;

public class Costumer {
	//属性
	private String firstName;//账户
	private String lastName;//余额
	private Account account;//年利率
	
	//构造器
	public Costumer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	//方法
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
}
