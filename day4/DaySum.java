import java.util.Scanner;
class DaySum{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);

	System.out.println("your month");
	int month=scan.nextInt();
	
	System.out.println("your day");
	int day=scan.nextInt();

	int sum=0;
	switch(month-1){
		case 12:
			sum=sum+31;
		case 11:
			sum=sum+30;
		case 10:
			sum=sum+31;
		case 9:
			sum=sum+30;
		case 8:
			sum=sum+31;
		case 7:
			sum=sum+31;
		case 6:
			sum=sum+30;
		case 5:
			sum=sum+31;
		case 4:
			sum=sum+30;
		case 3:
			sum=sum+31;
		case 2:
			sum=sum+28;
		case 1:
			sum=sum+31;
			break;
		default:
			break;
		}
	sum=sum+day;
	System.out.println(sum);
	}
}