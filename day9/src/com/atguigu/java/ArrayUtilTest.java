package com.atguigu.java;

public class ArrayUtilTest {
	public static void main(String[] args) {
		ArrayUtil util=new ArrayUtil();
		int[] arr=new int[] {32,55,66,88,47,5,99,-20};
		int max=util.getMax(arr);
		System.out.println("最大值为："+max);
		
		System.out.println("排序前：");
		util.print(arr);
		
		System.out.println("排序后：");
		util.sort(arr);
		util.print(arr);
		
		System.out.println("查找：");
		System.out.println(util.getIndex(arr, -5));
	}
}
