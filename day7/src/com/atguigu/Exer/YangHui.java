package com.atguigu.Exer;

public class YangHui {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		//对初始数组赋值：第一列与对角线全为1
		for (int i = 0; i < 10; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		//计算杨辉三角
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
		//打印杨辉三角
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
