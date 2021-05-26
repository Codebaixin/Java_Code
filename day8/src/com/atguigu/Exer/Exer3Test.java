/*3.1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形， 在main方法中调用该方法。
 * 
 *3.2 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，
 * 再计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 */
package com.atguigu.Exer;

public class Exer3Test {
	public static void main(String[] args) {
		//3.1测试
		Test test=new Test();
		int area=test.method();
		//3.2测试
		//方法一
//		System.out.println("面积为："+area);
		//方法二
		System.out.println(test.method());
	}

}
class Test{
	//3.1
	public int method() {
		for(int i=0;i<10;i++){
			for(int j=0;j<8;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//3.2
		return 10*8;
	}
}