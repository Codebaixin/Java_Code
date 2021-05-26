package com.atguigu.java;
/*
 * 类中的方法申明和使用
 * 
 * 方法：描述类应该具有的功能
 * 比如：Math:aqrt()\random()....
 * 		Scanner；nextXxx...
 * 		Arrays:equals()\fill()\toString()\sort()\binarySearch()...
 * 
 * 2.方法的申明：权限修饰符 返回类型 方法名(形参列表){
 * 						方法体
 * 				}
 * 3.说明
 * 		3.1权限修饰符：private、public、abstract、缺省。
 * 		3.2返回值类型：有返回值\无返回值
 * 			3.2.1如果方法有返回值，则必须在方法声明时，指定返回值的类型，同时方法中应该用return返回指定类型的返回值
 * 				如果方法没有返回值，类型使用void，无需使用return返回。
 * 
 * 			3.2.2返回值的使用与否的判断(经常与分支结构一起用)
 * 		
 * 		3.3方法名：属于标识符，遵循“见名知义”和标识符的命名规则。
 * 		3.4形参列表：可以没有，也可以有几个
 * 				格式：数据类型1 形参1，数据类型2 形参2.....
 * 		3.5方法体：方法功能的体现。
 * 
 * 4.return关键字的使用：
 * 		1.使用在方法体中。
 * 		2.作用：结束方法和使用"return 数据"返回一个指定的数据。
 * 		3.return关键字后面不能含有语句。
 * 5.方法的使用：可以调用当前类的属性或方法
 * 				特殊的：方法A中又调用了方法A；称为递归。
 * 	方法中不可以定义别的方法，但可以调用方法
 */
public class CustomerTest {
	public static void main(String[] args) {
		Constumer cust1=new Constumer();
		cust1.eat();
		cust1.sleep(8);
	}
}

class Constumer{
	String name;
	int age;
	boolean iaMale;
	
	public void eat() {
		System.out.println("客户吃饭");
	}
	public void sleep(int hour) {
		System.out.println("歇息了"+hour+"个小时");
		eat();
//		sleep(10);
	}
	public String getName() {
		//return后不可以申明表达式
		return name;
//		return "Tom";
	}
	public String getNation(String nation) {
		String info="我的国籍是："+nation;
		return info;
	}
}
