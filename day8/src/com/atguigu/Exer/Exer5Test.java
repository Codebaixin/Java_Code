package com.atguigu.Exer;
/*
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
 * score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class Exer5Test {
	public static void main(String[] args) {
		Student1[] stus=new Student1[20];
		for(int i=0;i<stus.length;i++) {
			stus[i]=new Student1();
			stus[i].number=i+1;
			stus[i].state=(int)(Math.random()*6+1);
			stus[i].score=(int)(Math.random()*101);
		}
		
		//遍历学生数组
		for(int i=0;i<stus.length;i++) {
			System.out.println(stus[i].info());
		}
		System.out.println();
		
		//打印出3年级(state值为3）的学生信息
		for(int i=0;i<stus.length;i++) {
			if(stus[i].state==3) {
				System.out.println(stus[i].info());
			}
		}
		System.out.println();
		
		//使用冒泡排序按学生成绩排序，并遍历所有学生信息
		for(int i=0;i<stus.length;i++) {
			for(int j=0;j<stus.length-1-i;j++) {
				if(stus[j].score<stus[j+1].score) {
					Student1 temp=new Student1();
					//如果需要排序，交换的是数组的元；Student1对象！！！
					temp=stus[j];
					stus[j]=stus[j+1];
					stus[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<stus.length;i++) {
			System.out.println(stus[i].info());
		}
		System.out.println();
		
	}
}

class Student1{
	int number;
	int state;
	int score;
	
	public String info(){
		return "学号："+number+"年纪："+state+"成绩："+score;
	}
	
}