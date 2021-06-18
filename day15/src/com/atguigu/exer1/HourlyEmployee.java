package com.atguigu.exer1;
/*
 * 参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。该类包括：
 * private成员变量wage和hour；
 * 实现父类的抽象方法earnings(),该方法返回wage*hour值；
 * toString()方法输出员工类型信息及员工的name，number,birthday。
 */
public class HourlyEmployee extends Employee{
	private int hour;
	private double wage;
	
	public HourlyEmployee(String name, String number, MyDate birthday,int hour,double wage) {
		super(name, number, birthday);
		this.hour=hour;
		this.wage=wage;
	}

	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "HourlyEmployee ["+super.toString()+"]";
	}


	@Override
	public double earnings() {
		return wage*hour;
	}

}
