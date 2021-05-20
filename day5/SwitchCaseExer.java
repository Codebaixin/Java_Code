import java.util.Scanner;
class SwitchCaseExer1{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入year");
	int year=scan.nextInt();
	System.out.println("请输入month");
	int year=scan.nextInt();
	System.out.println("请输入day");
	int year=scan.nextInt();
	int sumDay=0;
	switch(month){
		case 12:
			sumDay+=30;
		case 11:
			sumDay+=31;	
		case 10:
			sumDay+=30;	
		case 9:
			sumDay+=31;	
		case 8:
			sumDay+=31;	
		case 7:
			sumDay+=30;	
		case 6:
			sumDay+=31;	
		case 5:
			sumDay+=30;	
		case 4:
			sumDay+=31;	
		case 3:
			{
			if((year % 4 ==0 && year%100 !=0) || (yaer%400 == 0)){
				sumDay+=29;	
			}else{
				sumDay+=28;	
			}
			}
		case 2:
			sumDay+=31;	
		case 1:
			sumDay+=day;
	System.out.println(year+"年"+month+"月"+day+"号"+"是该年的"+sumDay+"天");
	}
}

class SwitchCaseExer2{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("please input your score");
	int score=scan.nextInt();
	switch(score / 10){
		case 9:
		          System.out.println('A');
		          break;
		case 8:	
		case 7:
		          System.out.println('B');
		          break;
		case 6:
		          System.out.println('C');
		          break;
		default:
		          System.out.println('D');
		          break;
			}
	}
}
				