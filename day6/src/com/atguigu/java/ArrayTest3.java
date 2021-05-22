package com.atguigu.java;

public class ArrayTest3 {
	public static void main(String[] args) {
		//二维数组元素默认初始化值
		//二维数组分为外层数组元素和内层数组元素
		//例：int[][] arr=new int[4][3],其中外层数组元素：arr[0],arr[1]等；内层数组元素：arr[1][1],arr[0][2]等。
		
		//针对于初始化方式一：int[][] arr=new int[4][3]
		//			外层数组元素初始化值为：地址值
		//			内层数组元素初始化值为：与一维数组初始化情况相同
		
		//针对于初始化方式二：int[][] arr=new int[4][]
		//			外层数组元素初始化值为：null
		//			内层数组元素初始化值为：报错
		
		int[][] arr=new int[4][3];
		System.out.println(arr[0]);//地址，例如：一维数组arr表示的是首元素的地址，而二维数组arr[0]表示的是第一列的地址
		System.out.println(arr[0][0]);
		System.out.println(arr);
		System.out.println("*****************");
		
		float[][] arr1=new float[4][3];
		System.out.println(arr1[0]);
		System.out.println(arr1[0][0]);
		System.out.println(arr1);
		System.out.println("*****************");
		
		String[][] arr2=new String[3][2];
		System.out.println(arr2[1]);
		System.out.println(arr2[1][1]);
		System.out.println("*****************");
		
		String[][] arr3=new String[3][];
		System.out.println(arr3[2]);
		
		//二维数组的内存解析
	}
}
