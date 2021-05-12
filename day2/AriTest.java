class AriTest1{
	public static void main(String[] args){
		int num1=12;
		int num2=5;
		int result=num1/num2;
		System.out.println("result="+result);

		int result1=num1/num2*num2;
		System.out.println("result1="+result1);

		double result2=num1/num2;
		System.out.println("result2="+result2);

		double result3=num1/(num2+0.0);
		System.out.println("result3="+result3);

		double result4=(double)num1/num2;
		System.out.println("result4="+result4);

		double result5=(double)(num1/num2);
		System.out.println("result5="+result5);
	}

}
class AriTest2{
	public static void main(String[] args){
		int m1=12;
		int n1=5;
		System.out.println("m1%n1="+m1%n1);

		int m2=-12;
		int n2=5;
		System.out.println("m2%n2="+m2%n2);

		int m3=12;
		int n3=-5;
		System.out.println("m3%n3="+m3%n3);

		int m4=-12;
		int n4=-5;
		System.out.println("m4%n4="+m4%n4);
	}
}
class AriTest3{
	public static void main(String[] args){
		int a1=10;
		int b1=++a1;
		System.out.println("a1="+a1+",b1="+b1);

		int a2=10;
		int b2=a2++;
		System.out.println("a2="+a2+","+"b2="+b2);

		int a3=10;
		a3++;
		int b3=a3;
		System.out.println("a3="+a3+","+"b3="+b3);

		short s1=10;
		s1=(short)(s1+1);
		s1++;

		byte bb1=127;
		bb1++;
		System.out.println("bb1="+bb1);

		int a4=10;
		int b4=--a4;
		System.out.println("a4="+a4+",b4="+b4);

		int a5=10;
		int b5=a5--;
		System.out.println("a5="+a5+","+"b5="+b5);
	}
}

class AriTest4{
	public static void main(String[] args){
	int i1=10;
	int i2=10;

	int j1,j2;
	j1=j2=10;

	int i3=10,j3=20;

	int num1=10;
	num1+=2;
	System.out.println("num1="+num1);

	int num2=12;
	num2%=2;
	System.out.println("num2="+num2);

	short s1=10;
	s1+=2;
	System.out.println("s1="+s1);
	}
}

class AriTest5{
	public static void main(String[] args){
	int i = 1;
                i *= 0.1;
	System.out.println(i);
	i++;
	System.out.println(i);

	int m = 2;
	int n = 3;
	n *= m++; 
	System.out.println("m=" + m);
	System.out.println("n=" + n);

	int n1 = 10;
	n1 += (n1++) + (++n1);
	System.out.println(n1);
	}
}