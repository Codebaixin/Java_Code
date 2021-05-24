package com.atguigu.Exer;
//数组查找
//1.线性查找
public class ArrayExer6 {
	public static void main(String[] args) {
		String[] arr=new String[] {"JJ","DD","MM","BB","GG","AA"};
		String dest="BB";
		boolean isflag=true;
		for(int i=0;i<arr.length;i++) {
			if(dest.equals(arr[i])) {
				System.out.println("找到了，下标为："+i);
				isflag=false;
				break;
			}
		}
		if(isflag) {
			System.out.println("很遗憾,没找到啦！");
		}
	}

}
