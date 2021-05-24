package com.atguigu.java;
//定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
//然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。(所有随机数都是两位数。)
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int max=0;
		int min=100;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*90+10);
			System.out.print(arr[i]+" ");
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
			sum+=arr[i];
		}
		System.out.println("\n"+"最大值为："+max);
		System.out.println("最小值为："+min);
		System.out.println("和为："+sum);
		System.out.println("平均值为："+(sum*1.0/arr.length));
	}
}
