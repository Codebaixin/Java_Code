package com.atguigu.Exer;
//二分查找（前提：必须为有序数组）
public class ArrayExer7 {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		int dest=10;
		int left=0;
		int right=arr.length-1;
		boolean isflag=true;
		
		while(left<=right) {
			int mid=(right+left)/2;
			if(arr[mid]>dest) {
				right=mid-1;
			}else if(arr[mid]<dest) {
				left=mid+1;
			}else {
				System.out.println("找到了，下标为："+mid);
				isflag=false;
				break;
			}
		}
		if(isflag) {
			System.out.println("没找到这样的数");
		}
	}

}
