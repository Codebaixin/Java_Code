import java.util.Scanner;
class IfTest1{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	
	System.out.println("请输入成绩");
	int score=scan.nextInt();
	
	if(score==100){
		System.out.println("奖励一台BMW");
	}else if(score>80 && score<=99){
		System.out.println("奖励一台iphone");
	}else if(score>=60 && score<=79){
		System.out.println("奖励一台ipad");
	}else{
		System.out.println("啥都没有");
	}
	}
}