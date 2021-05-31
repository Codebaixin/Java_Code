package com.atguigu.Exer;
/*
 * 创建程序,在其中定义两个类：Person和PersonTest类。定义如下：用setAge()设置人的合法年龄(0~130)，
 * 用getAge()返回人的年龄。 在 PersonTest 类 中实例化 Person 类的对象 b,调 用 setAge()和getAge()方法，体会Java的封装性。
 */
public class PersonTest {
	public static void main(String[] args) {
		Person person=new Person();
		person.name="Tom";
		person.isMale=false;
		person.setAge(150);
		System.out.println(person.getAge());
		System.out.println("name="+person.name+",isMale="+person.isMale+",age="+person.getAge());
	}
}
