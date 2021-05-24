package com.atguigu.Exer;

public class YangHui2 {
	public static void main(String[] args) {
		int[][] yanghui = new int[10][];
		for(int i=0;i<yanghui.length;i++) {
			//对初始数组赋值：第一列与对角线全为1
			yanghui[i]=new int[i+1];
			yanghui[i][0]=yanghui[i][i]=1;
			//计算杨辉三角
			if(i>1) {
				for(int j=1;j<yanghui[i].length-1;j++) {
					yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
				}
			}
		}
		
		//打印杨辉三角
		for (int i = 0; i < yanghui.length; i++) {
			for (int j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j]+" ");
			}
			System.out.println();
		}
	}
}
