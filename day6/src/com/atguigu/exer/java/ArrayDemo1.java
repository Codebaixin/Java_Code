package com.atguigu.exer.java;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		// 1.读取学生个数
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入学生人数：");
		int num = scan.nextInt();

		// 2.创建数组，存储学生成绩，动态初始化。
		int[] score = new int[num];

		// 3.给数组中的元素赋值。
		System.out.println("请输入" + num + "个成绩");
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}

		// 4.获取其中的最高分
		int max = 0;
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		System.out.println("最高分是：" + max);
		
		// 5.根据每个学生的成绩，得到学生的等级，并输出等级和成绩
		for (int i = 0; i < score.length; i++) {
			if (max - score[i] <= 10 && max - score[i] >= 0) {
				System.out.println("student" + i + " score is " + score[i] + ",grade is A");
			} else if (max - score[i] <= 20 && max - score[i] > 10) {
				System.out.println("student" + i + " score is " + score[i] + ",grade is B");
			} else if (max - score[i] <= 30 && max - score[i] > 20) {
				System.out.println("student" + i + " score is " + score[i] + ",grade is C");
			} else {
				System.out.println("student" + i + " score is " + score[i] + ",grade is D");
			}
		}
	}
}
