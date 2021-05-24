package com.atguigu.Exer;
import java.util.Scanner;
//回形数方阵格式的实现
public class ArrayExer3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入回形数：");
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		int count = 0;
		int maxX = n - 1;
		int maxY = n - 1;
		int minX = 0;
		int minY = 0;
		while (minX <= maxX) {
			for (int x = minX; x <= maxX; x++) {
				arr[minY][x] = ++count;
			}
			minY++;
			for (int y = minY; y <= maxY; y++) {
				arr[y][maxX] = ++count;
			}
			maxX--;
			for (int x = maxX; x >= minX; x--) {
				arr[maxY][x] = ++count;
			}
			maxY--;
			for (int y = maxY; y >= minY; y--) {
				arr[y][minX] = ++count;
			}
			minX++;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
