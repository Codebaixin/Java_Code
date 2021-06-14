package com.atguigu.java1;
/*
 * Object类中的toString()的使用
 * 
 * 1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 * 
 * 2.Object类中toString()的定义
 *     public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    
   3.像String、Date、File、包装类等都重写了Object类中toString()的方法
   	 使得在调用对象的toString()时，返回“实体内容”信息
 */
public class ToStringTest {
	public static void main(String[] args) {
		Person p1=new Person("Tom",21);
		
		System.out.println(p1);//重写toString前：com.atguigu.java1.Person@15db9742；重写后：Person[name=Tom,age=21]
		System.out.println(p1.toString());//com.atguigu.java1.Person@15db9742；重写后：Person[name=Tom,age=21]
		
		String str=new String("MM");
		System.out.println(str);//MM
		System.out.println(str.toString());//MM
	}
}
