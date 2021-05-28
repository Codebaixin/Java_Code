package com.atguigu.java2;
/*
 * 递归方法的使用
 * 1.一个方法体内调用它自身
 * 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
 * 3.递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 */
public class RecursionTest {
	public static void main(String[] args) {
		RecursionTest test=new RecursionTest();
		System.out.println(test.getSum(5));
		System.out.println("****************************");
		System.out.println(test.f(10));
		System.out.println("****************************");
		System.out.println(test.f1(10));
	}
	public int getSum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+getSum(n-1);
		}
	}
	//请用Java写出递归求阶乘(n!)的算法
	public int getSum1(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*getSum1(n-1);
		}
	}
	//已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
	public int f(int n) {
		if(n==0) {
			return 1;
		}else if(n==1){
			return 4;
		}else {
			return 2*f(n-1)+f(n-2);
		}
	}
	//输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
	//1 1 2 3 5 8 13 21 34 55
	//规律：一个数等于前两个数之和
	//要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
	public int f1(int n) {
		if(n==0) {
			return 1;
		}else if(n==1){
			return 1;
		}else {
			return f(n-1)+f(n-2);
		}
	}
	
}

