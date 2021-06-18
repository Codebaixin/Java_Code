package com.atguigu.exer2;

public class InterfaceTest{
	public static void main(String[] args) {
		new C().pX();
	}
}
interface A {
	int x = 0;
}
class B {
	int x = 1;
}
class C extends B implements A {
	public void pX() {
		System.out.println(super.x);
		System.out.println(A.x);
//		System.out.println(x);x是不明确的，编译不通过
	}
}
