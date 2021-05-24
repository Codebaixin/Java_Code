package com.atguigu.Exer;
//(1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
//(2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
//(3)显示array1的内容。
//(4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。打印出array1。
public class ArrayExer4 {
	public static void main(String[] args) {
		int[] array1=new int[] {2,3,5,7,11,13,17,19};
		int[] array2=new int[8];
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
//			array2[i]=array1[i];//这是array1与array2是两个数组地址不同。
		}
		System.out.println();

		array2=array1;//此时相当于array2与array1具有了相同的数组地址了,都指向了堆空间唯一的数组实体。
		for(int i=0;i<array2.length;i+=2) {
			array2[i]=i;
		}
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
	}
}
