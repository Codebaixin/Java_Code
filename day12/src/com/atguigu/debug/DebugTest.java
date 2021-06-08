package com.atguigu.debug;

public class DebugTest {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4};
		System.out.println(arr);//地址值
		
		char[] arr1=new char[] {'A','B','C'};
		System.out.println(arr1);//照理说也应该为地址值，但是将其视作了println(char 变量名),
		//若为println(Object 变量名)则为地址
	}
}
