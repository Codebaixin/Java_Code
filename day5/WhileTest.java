
import java.util.Scanner;
class WhileTest1{
	public static void main(String[] args){
	int i=0;
	while(i<=100){
	if(i%2==0){
		System.out.println(i);
		}
	i++;
		}
	}
}

class DoWhileTest1{
	public static void main(String[] args){
	int j=1;
	int count=0; 
	int sum=0;
	do{
		if(j%2==0){
		System.out.println(j);
		sum+=j;
		count++;
		};
		j++;
		}
	while(j<=100);
	System.out.println(sum);
	System.out.println(count);
	}
}

class ForWhileTest1{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int positivenumber=0;
	int negitivenumber=0;
	while(true){
		int number=scan.nextInt();
		if(number>0){
			positivenumber++;
		}else if(number<0){
			negitivenumber++;
		}else{
			break;
		}
	}
	System.out.println("positivenumber="+positivenumber);
	System.out.println("negitivenumber="+negitivenumber);
	}
}
			

			