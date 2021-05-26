package com.atguigu.java;
/*
 * 类中属性的使用
 * 属性(成员变量) VS 局部变量
 * 1.相同点：
 *         1.1变量的定义格式：数据类型 变量名=变量值。
 *         1.2先声明，后使用。
 *         1.3变量都有其固定的作用域。
 * 
 * 2.不同点：
 *         2.1在类中申明的位置不同
 *         属性：定义在类的一对{}中。
 *         局部变量：申明在方法内，方法形参，代码块内，构造器形参，构造器内部的变量
 *         
 *         2.2关于权限修饰符的不同
 *         属性：可以在属性申明前，指定其权限，使用权限修饰符
 *         如private，public，缺省，protected
 *         
 *         局部变量：不可以使用权限修饰符
 *         
 *         2.3默认初始化值的情况
 *         属性：类的属性，根据其类型，都有默认初始值
 *         		整形(short,int,byte,long):0
 *         		浮点型(flat,double):0.0
 *         		字符型(char):0的ASIIC码所对应的字符
 *         		布尔型(boolean):false
 *         		引用数据类型(类，数组，接口)：null
 *         
 *         局部变量：没有默认初始化值
 *         		我们在调用局部变量时，一定要显示赋值。
 *         		特别的，形参调用时，我们赋值即可。
 *         
 *         2.4内存中加载的位置
 *         属性：加载到堆空间(非static)
 *         局部变量：加载到栈空间
 *         
 */
public class UserTest {
	public static void main(String[] args) {
		User u1=new User();
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.isMale);
	}

}

class User{
	//属性(成员变量)
	String name;
	int age;
	boolean isMale;
	
	public void talk(String langue) {//局部变量
		System.out.println("我们使用"+langue+"交流");
	}
	public void eat() {
		String food="烙饼";//局部变量
		System.out.println("北方人都喜欢吃"+food);
	}
}
