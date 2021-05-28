package com.atguigu.exer;
/*
 * 2.编写程序，定义三个重载方法并调用。方法名为mOL。三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
 * 执行平方运算并输出结果，相乘并输出结果，输出字符串信息。在主类的main ()方法中分别用参数区别调用三个方法。
 * 
 * 3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
 */
public class OverLoadExer {
	public static void main(String[] args) {
		OverLoadExer test=new OverLoadExer();
		System.out.println(test.mOL(2));
		System.out.println(test.mOL(2, 3));
		test.mOL("Tom");
		
		test.max(4, 5);
		test.max(4.2, 5.1);
		test.max(3.1, 2.2, 2.2);
		
	}
	//如下构成了mOL的三个重载方法
	public int mOL(int i) {
		return i*i;
	}
	public int mOL(int i,int j) {
		return i*j;
	}
	public void mOL(String i) {
		System.out.println(i);
	}
	
	//如下构成了max的三个重载方法
	public void max(int i,int j) {
		if(i>j) {
			System.out.println(i);
		}else {
			System.out.println(j);
		}
	}
	public void max(double i,double j) {
		if(i>j) {
			System.out.println(i);
		}else {
			System.out.println(j);
		}
	}
	public void max(double i,double j,double k) {//(i>j ? i ：j) > k ? (i>j ? i ：j) : k;
		if(i>j) {
			if(k<j) {
				System.out.println(i);
			}else if(k>i) {
				System.out.println(k);
			}else {
				System.out.println(i);
			}
		}else {
			if(k>j) {
				System.out.println(k);
			}else if(k<i) {
				System.out.println(j);
			}else {
				System.out.println(j);
			}
		}
	}
}
