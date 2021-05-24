package com.atguigu.java;
//冒泡排序
public class BubbleTest {
	public static void main(String[] args) {
		int[] arr=new int[] {5,8,1,3,7,6,2,0};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
