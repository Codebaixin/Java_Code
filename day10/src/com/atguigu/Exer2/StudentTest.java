package com.atguigu.Exer2;
/*
 * (1)定义Student类,有4个属性：
 * String name; 
 * int age; 
 * String school; 
 * String major;
 * (2)定义Student类的3个构造器: 第一个构造器Student(String n, int a)设置类的name和age属性；
 * 第二个构造器Student(String n, int a, String s)设置类的name, age 和school属性；
 * 第三个构造器Student(String n, int a, String s, String m)设置类的name, age ,school和major属性；
 * (3)在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
 */
public class StudentTest {
	public static void main(String[] args) {	
		Student s1=new Student("Tom",18);
		Student s2=new Student("July",20,"齐鲁理工学院");
		Student s3=new Student("Holiday",23,"福建师范大学","电子信息");
		
		System.out.println("name="+s1.name+",age="+s1.age);
		System.out.println("name="+s2.name+",age="+s2.age+",school="+s2.school);
		System.out.println("name="+s3.name+",age="+s3.age+",school="+s3.school+",major="+s3.major);
	}
}
class Student{
	//属性
	String name;
	int age;
	String school;
	String major;
	
	//构造器
	public Student(String n,int a){
		name=n;
		age=a;
	}
	public Student(String n,int a,String s){
		name=n;
		age=a;
		school=s;
	}
	public Student(String n,int a,String s,String m){
		name=n;
		age=a;
		school=s;
		major=m;
	}
}