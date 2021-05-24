package com.atguigu.java;

import java.util.Arrays;

/*
 * java.util.Arrays:操作数组的工具类，里面定义了很多操作数组的方法。
 * 
 */
public class ArrayTest {
	public static void main(String[] args) {
		//boolean equals(int[] a,int[] b),判断两个数组是否相等
		int[] arr1=new int[] {1,2,3,4};
		int[] arr2=new int[] {1,3,2,4};
		boolean isEquals=Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		//String toString(int[] a)
		System.out.println(Arrays.toString(arr1));
		
		//void fill(int[] a,int val)
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		//void sort(int[] a)
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

		
		//int binarySearch(int[] a,int key)
		int[] arr3=new int[] {-10,-3,0,8,43,87,100};
		int index=Arrays.binarySearch(arr3, 10);
		if(index>0) {
			System.out.println(index);
		}else {
			System.out.println("未找到");
		}
	}

}
