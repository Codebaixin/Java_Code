package com.atguigu.java;

public class ArrayTest1 {
	public static void main(String[] args) {
		//数组元素的默认初始化值
		//    >数组元素为整形(byte,short,int,long):0;
		//    >数组元素为浮点型(float,double):0.0;
		//    >数组元素为字符型(char):ASSIC值为0;
		//    >数组元素为布尔形(boolean):false;
		
		
		//    >数组元素为引用数据类型:null;
		int[] arr=new int[4];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("***********");
		
		short[] arr1=new short[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("***********");
		
		float[] arr2=new float[4];
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("***********");
		
		char[] arr3=new char[4];
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		if(arr3[0]==0) {
			System.out.println("你好");
		}
		System.out.println("***********");
		
		boolean[] arr4=new boolean[4];
		for(int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		System.out.println("***********");
		
		String[] arr5=new String[4];
		for(int i=0;i<arr5.length;i++) {
			System.out.println(arr5[i]);
		}
		if(arr5[0]==null) {
			System.out.println("北京");
		}
		System.out.println("***********");
		
		
		//数组内存解析
		
		
	}

}
