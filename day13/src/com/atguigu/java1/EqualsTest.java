package com.atguigu.java1;
/*
 * "=="与Equals的区别
 * 
 * 1."=="运算符
 * 1)可以使用在基本数据类型变量和引用数据变量之中
 * 2)如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等(不一定类型相同)
 * 	 如果比较的是引用数据类型变量：比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
 * 
 * 补充：==符号使用时，必须保证左右两边的变量类型一致
 * 
 * 2.equals方法的使用
 * 1)是一个方法，而非运算符
 * 2)只适用于引用数据类型
 * 3)Object类中equals()的定义
 * 		public boolean equals(Object obj) {
        return (this == obj);
    }
    说明：Object类中的equals方法和"=="作用相同。比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
 *4)像String、Date、File、包装了类都重写了Object类中的equals方法，重写以后比较的不再是两个对象的地址值是否相同
 *	而是比较两个对象的"实体内容"是否相同。
 *5).通常情况下，我们自定义类如果使用equals(),也通常是为了比较两个对象的实体内容是否相同，那么，我们
 *	需要对Object类下的equals()进行重写
 *
 *重写的规则：比较两个对象的实体内容是否相同
 *
 */
public class EqualsTest {
	public static void main(String[] args) {
		int i=10;
		int j=10;
		double d=10.0;
		System.out.println(i==j);
		System.out.println(i==d);
		
		char c=10;
		System.out.println(c==i);
		
		char c1=65;
		char c2='A';
		System.out.println(c1==c2);
		
		String s1=new String("atguigu");
		String s2=new String("atguigu");
		System.out.println(s1==s2);
		
		Person cust1=new Person("Tom", 21);
		Person cust2=new Person("Tom", 21);
		System.out.println(cust1==cust2);
		
		//修改equals之前为false;修改equals后为true;
		System.out.println(cust1.equals(cust2));//equals(cust2)=="Object object=cust2"为一个多态
		System.out.println(s1.equals(s2));
	}
}
