/*3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个
 * m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 */
package com.atguigu.Exer;

import java.util.Scanner;
public class Exer4Test {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入两个数：");
		int m=scan.nextInt();
		int n=scan.nextInt();
		Test1 test=new Test1();
		int area=test.method(m, n);
		System.out.println("面积为："+area);
	}

}
class Test1{
	public int method(int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return m*n;
	}
}
