package com.atguigu.java1;
/*
 * 接口的使用
 * 1.接口使用也满足多态性
 * 2.接口，实际上就是定义了一种规范
 * 3.开发中，体会面向接口编程。
 */
public class UsbTest {
	public static void main(String[] args) {
		computer com=new computer();
		//1.创建了接口的非匿名实现类的非匿名对象
		Printer printer=new Printer();
		com.transferDate(printer);
	
		//2.创建了接口的非匿名实现类的匿名对象
		com.transferDate(new Flash());
		
		//3.创建了接口的匿名实现类的非匿名对象
		USB phone=new USB() {
			@Override
			public void start() {
				System.out.println("手机开始工作");	
			}
			@Override
			public void stop() {
				System.out.println("手机停止工作");	
			}	
		};
		com.transferDate(phone);
		//4.创建了接口的匿名实现类的匿名对象
		com.transferDate(new USB() {
			@Override
			public void start() {
				System.out.println("mp3开始工作");
			}
			@Override
			public void stop() {
				System.out.println("mp3停止工作");
			}	
		});
	}	
}
interface USB{
	//常量：定义了长宽
	public abstract void start();
	void stop();
}
class computer{
	public void transferDate(USB usb) {//USB usb=new Flash();
		usb.start();
		System.out.println("具体数据传输细节");
		usb.stop();
	}
}
class Flash implements USB{
	@Override
	public void start() {
		System.out.println("USB开始工作");
	}
	@Override
	public void stop() {
		System.out.println("USB停止工作");
	}
}
class Printer implements USB{
	@Override
	public void start() {
		System.out.println("打印机开始工作");
	}
	@Override
	public void stop() {
		System.out.println("打印机停止工作");
		
	}
}