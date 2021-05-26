package com.atguigu.Exer;

public class ClassTest1 {
	public static void main(String[] args) {
		Student student=new Student();
		Teacher teacher=new Teacher();
		System.out.println(student.interesting);
		System.out.println(student.say());
		
		System.out.println(teacher.interesting);
		System.out.println(teacher.say());
	}

}
class Student{
	String name="张三";
	int age=18;
	String major="数学";
	String interesting="音乐";
	String say() {
		return name+age+major+interesting;
	}
}

class Teacher{
	String name="李四";
	int age=28;
	String major="数学";
	String interesting="篮球";
	String say() {
		return name+age+major+interesting;
		}
}
