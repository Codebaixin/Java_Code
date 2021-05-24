package com.atguigu.Exer;
//数组的反转
public class ArrayExer5 {
	public static void main(String[] args) {
		String[] arr=new String[] {"JJ","DD","MM","BB","GG","AA"};
		//方法一
		int len=arr.length;
		int lift=0;
		int right=len-1;
		while(lift<right) {
			String temp=arr[lift];
			arr[lift]=arr[right];
			arr[right]=temp;
			lift++;
			right--;
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n"+"*******************");
		//方法二
		for(int i=0;i<arr.length/2;i++) {
			String temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
