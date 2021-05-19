import java.util.Scanner；
class AgeTest{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("age");
	double num=0.0;
	int num1=scan.nextInt();
	if(num1<=2 && num1>=0){
		num=num1 * 10.5;
		System.out.println(num);
	}else if(num1>2){
		num=(num1-2)*4+2*10.5;
		System.out.println(num);
	}else{
		System.out.println("error");
	}
	}
}