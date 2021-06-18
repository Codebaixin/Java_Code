package com.atguigu.exer;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee manager=new Manager("库克", "1001", 5000, 50000);
		manager.work();
		
		CommonEmployee comm=new CommonEmployee();
		comm.work();
	}
}
