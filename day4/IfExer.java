import java.util.Scanner;
class IfExer1{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入你的身高(cm)");
	int height=scan.nextInt();
	System.out.println("请输入你的财富(百万)");
	double wealth=scan.nextDouble();
	System.out.println("你是否长得帅(true/flase)");
	boolean handsome=scan.nextBoolean();

	if(height>=180 && wealth >=1 && handsome){
		System.out.println("那就嫁给你吧！！！");
	}else if(height>=180 || wealth >=1 || handsome){
		System.out.println("那就将就吧！！！");
	}else{
		System.out.println("快滚开吧！！！");
	}
	}
}