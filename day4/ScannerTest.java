import java.util.Scanner;
class ScannerTest1{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	System.out.println(num);
	}
}

class ScannerTest2{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);

	System.out.println("请输入你的姓名：");
	String name=scan.next();
	String.out.println(name);

	System.out.println("请输入你的芳龄：");
	int age=scan.nextInt();
	System.out.println(age);

	System.out.println("请输入你的体重：");
	double weight=scan.nextDouble();
	System.out.println(weight);

	System.out.println("你是否相中了我呢?(true/flase)");
	boolean isLove=scan.nextBoolean();
	System.out.println(isLove);

	System.out.println("请输入你的性别：");
	String gender=scan.next();
	char genderChar=gender.charAt(0);
	System.out.println(genderChar);	
	}
}