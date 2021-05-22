package com.atguigu.java;
/* 1.数组(Array)，是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，
 *   并通过编号的方式对这些数据进行统一管理。
 * 2.数组是有序排列的
 * 3.数组常见概念
 * 	 数组名
 * 	 元素
 * 	 下标
 * 	 数组长度：元素的个数
 * 4.数组属于引用数据类型的变量。数组的元素既可以是基本数据类型，也可以是引用数据类型
 * 5.创建数组对象会在内存中开辟一整块连续的空间
 * 6.数组初始化后长度就确定了，数组的长度一旦确定，就不能修改。
 * 7.数组的分类：
 * 	 1)按照维度：一维数组、二维数组、三维数组
 * 	 2)按照元素的数据类型分：基本数据类型元素的数组、引用数据类型元素的数组
 */
public class ArrayTest {
	public static void main(String[] args) {
		//静态初始化:数组的初始化和数组元素的赋值操作同时进行
		int[] ids;
		ids=new int[] {1001,1002,1003,1004};
		int[] age=new int[] {12,31,25};
		//动态初始化:数组的初始化和数组元素的赋值操作分开进行
		String[] names=new String[5];
		
		//数组一旦初始化后，数组的长度就确定了
		//调用数组指定的位置。
		names[0]="詹姆斯";
		names[1]="科比";
		names[2]="戴维斯";
		names[3]="杜兰特";
		names[4]="东契奇";
		
		//获取数组的长度:length;
		System.out.println(names.length);
		System.out.println(ids.length);
		
		//遍历数组
		System.out.println(names[0]); 
		System.out.println(names[1]);
		System.out.println(names[2]); 
	    System.out.println(names[3]);
		System.out.println(names[4]);
		 
		for(int i=0;i<5;i++) {
			System.out.println(names[i]);
		}
		
	}
}
