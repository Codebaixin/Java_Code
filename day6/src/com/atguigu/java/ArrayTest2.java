package com.atguigu.java;

public class ArrayTest2 {
/*二维数组
 * 1.对于二维数组的理解，我们可以看成是一维数组array1又作为另一个一维数组array2的元素而存在。
 * 2.二维数组的使用
 * 
 */
	public static void main(String[] args) {
		//二维数组的声明和初始化
		int[] arr=new int[] {1,2,3};//一维数组
		int[] arr0=new int[3];
		
		//静态初始化
		int[][] arr1=new int[][] {{1,2,3},{4,5},{7,8,9}};
		//动态初始化1
		String[][] arr2=new String[3][2];
		//动态初始化2
		String[][] arr3=new String[3][];
		
		//调用数组指定位置的元素
		System.out.println(arr1[0][1]);
		System.out.println(arr2[1][1]);
		
		arr3[1]=new String[] {"张三","李四","王五"};
		System.out.println(arr3[1][0]);
		System.out.println(arr3[1][2]);
		
		arr3[0]=new String[2];
		System.out.println(arr3[0][1]);
		
		//获取数组的长度
		int[][] arr4=new int[][] {{1,2,3},{4,5},{6,7,8}};
		System.out.println(arr4.length);
		System.out.println(arr4[0].length);
		System.out.println(arr4[1].length);
		
		//遍历二维数组
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4[i].length;j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
	}
}
