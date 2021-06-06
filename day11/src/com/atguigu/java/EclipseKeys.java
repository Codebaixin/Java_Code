package com.atguigu.java;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 1.补全代码的声明：arlt+/
 * 2.快速修复：ctrl+1
 * 3.批量导包：ctrl+shift+o;
 * 4.单行注释：ctrl+/
 * 5.多行注释：ctrl+shift+/
 * 6.取消多行注释：ctrl+shift+\
 * 7.复制指定行的代码：ctrl+alt+down 或 ctrl+alt+shift
 * 8.删除指定行：ctrl+D
 * 9.上下移动代码：alt+down 或 alt+up
 * 10.切换到下一行代码空行：ctrl+enter
 * 11.切换到上一行代码空行：ctrl+shift+enter
 * 12.如何查看源代码：ctrl+选中指定的结构 或 ctrl+shift+t
 * 13.退回到前一个编辑的页面：alt+left
 * 14.进入到后一个编辑的页面：alt+right
 * 15.光标选中指定的类，查看继承树结构：ctrl+t
 * 16.复制代码：ctrl+c
 * 17.撤销：ctrl+z
 * 18.反撤销：ctrl+y
 * 19.剪切：ctrl+x
 * 20.粘贴：ctrl+v
 * 21.保存：ctrl+s
 * 22.全选：ctrl+a
 * 23.格式化代码：ctrl+shift+f
 * 24.选中数行，整体往后移：tab
 * 25.选中数行，整体往前移：shift+tab
 * 26.在当前类中，显示类的结构，并支持搜索指定的方法、属性等：ctrl+o
 * 27.批量修改指定的变量名、方法名、类名等：alt+shift+r
 * 28.选中的结构的大小写切换，变成大写：ctrl+shift+x
 * 29.选中的结构的大小写切换，变成小写：ctrl+shift+y
 * 30.调出生成构造器和方法：shift+alt+s
 * 31.显示当前选择资源（工程，文件）的属性：alt+enter
 * 32.快速查找：ctrl+k
 * 
 * 33.关闭当前窗口：ctrl+w
 * 34.关闭所有窗口：ctrl+shift+w
 * 35.查看指定结构使用过的地方：ctrl+alt+g
 * 36.查找与替换：ctrl+f
 * 37.最大化当前view：ctrl+m
 * 38.直接定位到当前行首位：home
 * 39.直接定位到当前行末位：end
 * 
 */
public class EclipseKeys {
	
	final double pi=3.14;

	public static void main(String[] args) {
		String string2 = new String();
		String string = new String();
		int num = 1;

		ArrayList list11 = new ArrayList();
		HashMap map = null;

		map = new HashMap();

		list11.add(123);
		list11.add(123);
		list11.add(123);
		list11.add(123);
		list11.add(123);
	}
}

class User{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User() {
	}
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}