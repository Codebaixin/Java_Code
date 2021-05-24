package com.atguigu.java;

import java.util.Arrays;

/*
 * 数组中常见异常
 * 1.数组角标越界异常:ArrayIndexOutOfBoundsException
 * 
 * 2.空指针异常
 */
public class ArrayExceptionTest {
	public static void main(String[] args) {
//		// 1.数组角标越界异常:ArrayIndexOutOfBoundsException
//		int[] arr=new int[] {1,2,3,4,5};
//		for(int i=0;i<=arr.length;i++) {//角标越界。
//			System.out.println(arr[i]+" ");
//		}
//		System.out.println("hello");//一旦前面程序出错，后面程序就执行不了了。
		
		//2.空指针异常:NullPointerException
		//方式一
//		int[] arr1=new int[] {1,2,3,4,5};
//		arr1=null;
//		System.out.println(arr1[0]);
		
		//方式二
//		int[][] arr2=new int[4][];
//		System.out.println(arr2[0]);//null
//		System.out.println(arr2[0][0]);//NullPointerException
		
		//方式三
//		String[] arr3=new String[] {"AA","BB","CC"};
//		arr3[0]=null;
//		System.out.println(arr3[0].toString());//NullPointerException
	}

}
