import java.util.Scanner;
class ForTest1{
	public static void main(String[] args){
	int i=1;
	for(i=1;i<=5;i++){
		System.out.println("Hello World!");
		}
	}
}

class ForTest2{
	public static void main(String[] args){
	int num=1;
	for(System.out.print('a');num<=3;System.out.print('c'),num++){
		System.out.print("b");
		}
	}
}

class ForTest3{
	public static void main(String[] args){
	int j=0;
	int sum=0;
	int count=0;
	for(j=0;j<=100;j++){
		if(j%2==0){
		     	System.out.print(j+" ");
			sum+=j;
			count++;
			}
		}
	System.out.println();
	System.out.println(sum);
	System.out.println(count);
	}
}

class ForTest4{
	public static void main(String[] args){
	int k=0;
	for(k=1;k<=150;k++){
		System.out.print(k+" ");
		if(k % 3==0){
		System.out.print("foo"+" ");
		}	
		if(k % 5==0){
		System.out.print("biz"+" ");
		}
		if(k % 7==0){
		System.out.print("baz"+" ");
		}
		System.out.println();
		}
	}
}

class ForTest5{
	public static void main(String[] args){
	int l=0;
	int count1=0;
	for(l=0;l<=100;l++){
		if(l%2 !=0){
			System.out.print(l+" ");
			count1++;
			}
		}
	System.out.println();
	System.out.println(count1);
	}
}


class ForTest6{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("please input your first number");
	int m=scan.nextInt();
	System.out.println("please input your second number");
	int n=scan.nextInt();
	
	int min=(m<=n) ? m : n;
	for(int i=min;i >=1; i--){
		if(m % i ==0 && n % i==0){
		System.out.println(i);
		break;
		}
	}

	int max=(m>=n) ? m : n;
	for(int j=max ; j<m*n ; j++){
		if(j % m==0 && j % n==0){
		System.out.println(j);
		break;
		}
	}
	}
}

class ForTest7{
	public static void main(String[] args){
	int h=0;
	for(h=100;h<1000;h++){
	int hundard=h/100;
	int decaed=h%100/10;
	int unit=h%100%10;
	if(hundard*hundard*hundard+decaed*decaed*decaed+unit*unit*unit==h){
		System.out.println(h);
		}
	}
}
}

class ForTest8{
	public static void main(String[] args){
	int y=0;
	int sum1=0;
	for(y=1;y<=100;y++){
	if(y%7==0){
	System.out.print(y+" ");
	sum1+=y;
	}
	}
	System.out.println();
	System.out.println(sum1);
	}
}
		
class IfTest1{
	public static void main(String[] args){
	int a=3;
	int x=100;
	switch(a){
	case 1:
	         x+=5;
	          break;
	case 2:
	         x+=10;
	          break;
	case 3:
	         x+=16;
	          break;
	default:
	          x+=34;
	          break;
	}
	System.out.println(x);
	}
}