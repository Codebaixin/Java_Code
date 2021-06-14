package com.atguigu.erer6;

import java.util.Scanner;
import java.util.Vector;

/*
 * 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 * 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
 * 而向量类java.util.Vector可以根据需要动态伸缩。
 * 创建Vector对象：Vector v=new Vector();
 * 给向量添加元素：v.addElement(Object obj); //obj必须是对象
 * 取出向量中的元素：Object obj=v.elementAt(0);
 * 注意第一个元素的下标是0，返回值是Object类型的。
 * 计算向量的长度：v.size();
 * 若与最高分相差10分内：A等；20分内：B等；30分内：C等；其它：D等
 */
public class ScoreTest {
	public static void main(String[] args) {
		//1.实例化Scanner
		Scanner scan=new Scanner(System.in);
		//2.创建Vector对象
		Vector v=new Vector();
		//3.给向量添加元素:从键盘读入学生成绩（以负数代表输入结束）,找出最高分
		int scoreMax=0;
		while(true) {
			System.out.print("请输入学生成绩：");
			int score=scan.nextInt();
			if(score<0) {
				break;
			}
			if(score>100) {
				System.out.println("输入有误，请重新输入");
				continue;
			}
			Integer i=new Integer(score);//多态
			v.addElement(i);
			
//			v.addElement(score);//自动装箱
			if(scoreMax<score) {
				scoreMax=score;
			}
		}
		System.out.println("最高分为："+scoreMax);
		
		//4.求学生们等级
		for(int i=0;i<v.size();i++) {
			Object obj=v.elementAt(i);
			//未自动拆箱
//			Integer inScore=(Integer)obj;
//			int score=inScore.intValue();
			
			//自动拆箱
			int score=(Integer)obj;
			if(scoreMax-score<10) {
				System.out.println("Student-"+i+" score is "+score+", level is"+" A");
			}else if(scoreMax-score<20) {
				System.out.println("Student-"+i+" score is "+score+", level is"+" B");
			}else if(scoreMax-score<30) {
				System.out.println("Student-"+i+" score is "+score+", level is"+" C");
			}else {
				System.out.println("Student-"+i+" score is "+score+", level is"+" D");
			}
		}
	}
}
