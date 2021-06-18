package com.atguigu.java;
/*
 * 抽象类的应用：模板方法的设计模式
 * 
 */
public class TemplateTest {
	public static void main(String[] args) {
		SubTemplate1 time1=new SubTemplate1();
		time1.spendtime();
		SubTemplate2 time2=new SubTemplate2();
		time2.spendtime();
	}
}
abstract class Template{
	public void spendtime() {
		long start=System.currentTimeMillis();
		code();//不确定部分、易变部分
		long end=System.currentTimeMillis();
		System.out.println("花费的时间："+(end-start));
	}
	public abstract void code();
}

class SubTemplate1 extends Template{
	@Override
	public void code() {
		for(int i=2;i<1000;i++) {
			int j=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==i) {
				System.out.println(i);
			}
		}	
	}
}

class SubTemplate2 extends Template{
	@Override
	public void code() {
		for(int i=2;i<1000;i++) {
			boolean isFlag=false;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isFlag=true;
				}
			}
			if(isFlag==false) {
				System.out.println(i);
			}
		}
	}
}