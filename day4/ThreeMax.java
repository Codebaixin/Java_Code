public class ThreeMax{
	public static void main(String[] args){
	int num1=10,num2=20,num3=-21;
	int max=0;
	if(num1>num2)
		max=num1;
	else if((max=num2)>num3)
		max=num2;
	else
		max=num3;

	System.out.println("max="+max);
	}
}

class ThreeMax1{
	public static void main(String[] args){
	double d1=12.3;
	double d2=32.1;
	if(d1>10.0 && d2<20.0){
		System.out.println(d1+d2);
	}else{
		System.out.println(d1*d2);
	}
	}
}

class DecToHex{
	public static void main(String[] args){
	int n1=60;
	int n2=15;
	int n=n1&n2;
	String n3;
	if(n>=10){
		n3=(char)(n-10+'A')+"";
	}else{
		n3=n+"";
	}
	int n4=n1>>>4;
	int n5=n4&n2;
	String n6;
	if(n5>=10){
		n6=(char)(n5-10+'A')+"";
	}else{
		n6=n5+"";
	}
	System.out.println(n6+n3);
	}
}