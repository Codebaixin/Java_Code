package com.atguigu.exer1;

import java.util.Scanner;
/*
 * 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 * 利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
 * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 */
public class PayrollSystem {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入当前的月份：");
		int month=scan.nextInt();
		
		Employee[] em=new Employee[2];
		em[0]=new SalariedEmployee("Tom", "1001", new MyDate(1995, 5, 6), 10000);
		em[1]=new HourlyEmployee("Durk", "1002", new MyDate(1998, 11, 5), 60,240);
		
		for(int i=0;i<em.length;i++) {
			System.out.println(em[i]);
			double salary=em[i].earnings();
			if(month==em[i].getBirthday().getMonth()) {
				System.out.println("生日快乐！奖励100元");
				salary+=100;
			}
			System.out.println("月工资为："+salary);
		}
	}
}
