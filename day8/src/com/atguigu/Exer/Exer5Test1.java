package com.atguigu.Exer;
/*
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
 * score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class Exer5Test1 {
	public static void main(String[] args) {
		Student2[] stus=new Student2[20];
		for(int i=0;i<stus.length;i++) {
			stus[i]=new Student2();
			stus[i].number=i+1;
			stus[i].state=(int)(Math.random()*6+1);
			stus[i].score=(int)(Math.random()*101);
		}
		Exer5Test1 test=new Exer5Test1();
		//遍历学生数组
		test.print(stus);
		
		//打印出3年级(state值为3）的学生信息
		test.searchState(stus, 3);
		
		//使用冒泡排序按学生成绩排序，并遍历所有学生信息
		test.sort(stus);
		test.print(stus);
	}
	
	
	public void print(Student2[] stus) {
		for(int i=0;i<stus.length;i++) {
			System.out.println(stus[i].info());
		}
		System.out.println();
	}
	
	public void searchState(Student2[] stus,int state) {
		for(int i=0;i<stus.length;i++) {
			if(stus[i].state==state) {
				System.out.println(stus[i].info());
			}
		}
	}
	
	public void sort(Student2[] stus) {
		for(int i=0;i<stus.length;i++) {
			for(int j=0;j<stus.length-1-i;j++) {
				if(stus[j].score<stus[j+1].score) {
					Student2 temp=new Student2();
					//如果需要排序，交换的是数组的元；Student1对象！！！
					temp=stus[j];
					stus[j]=stus[j+1];
					stus[j+1]=temp;
				}
			}
		}
	}
}

class Student2{
	int number;
	int state;
	int score;
	
	public String info(){
		return "学号："+number+"年纪："+state+"成绩："+score;
	}
	
}