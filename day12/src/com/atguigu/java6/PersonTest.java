package com.atguigu.java6;
/*
 * 面向对象特征三：多态性
 * 
 * 1.理解多态性：理解为一个事物的多种形态
 * 2.何为多态性：
 * 		对象的多态性：父类的引用指向子类的对象(或子类的对象赋给父类的引用)
 * 3.多态性的使用：虚拟方法调用
 * 	有了对象的多态性以后，我们在编译期只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法
 * 	总结：编译，看左边；执行，看右边
 * 4.多态性使用前提：类的继承关系   方法的重写
 * 5.对象的多态性只适用于方法，不适用于属性(编译和运行都看左边)
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.eat();
		
		Man man=new Man();
		man.age=25;
		man.earnMoney();
		man.eat();
		
		Person p2=new Woman();//多态性的体现
		p2.eat();
		p2.walk();
		p2.sleep();
		
		Person p3=new Man();
		p3.age=20;
		System.out.println(p3.age);
		System.out.println(p3.id);
	}
}
