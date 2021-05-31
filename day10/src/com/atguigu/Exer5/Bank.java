package com.atguigu.Exer5;

public class Bank {
	private Customer[] customers;
	private int numnberOfCustomers;
	
	public Bank() {
		customers=new Customer[10];
	}
	
	//添加客户
	public void addCustomers(String f,String l) {
		Customer cust=new Customer(f,l);
		customers[numnberOfCustomers]=cust;
		numnberOfCustomers++;
	}
	//获取客户个数
	public int getNumOfCustomers() {
		return numnberOfCustomers;
	}
	//获取指定位置上的客户
	public Customer getCustomer(int index) {
		if(index>=0 && index<numnberOfCustomers) {
			return customers[index];
		}
		return null;
	}
}
