package com.atguigu.Exer;
//创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求
//元素的值各不相同
//方法一：
public class ArrayExer2 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 30) + 1);//先随机生成一个数
			boolean flag = false;
			while (true) {
				//判断该数是否和前面的一样，若有相同则flag=true；
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						flag = true;
						break;
					}
				}
				//如果flag=true，表明要对arr[i]重新赋值。
				if (flag) {
					arr[i] = (int) ((Math.random() * 30) + 1);
					flag = false;
					continue;
				}
				//只有当最终flag=false才能走到这一步
				break;
			}		
		}
		//遍历arr数组中的6个数。
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

//方法二：
class ArrayExer {
	public static void main(String[] args) {
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int) ((Math.random() * 30) + 1);
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}