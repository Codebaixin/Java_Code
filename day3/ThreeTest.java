class ThreeTest1{
	public static void main(String[] args){
	int m=12;
	int n=5;
	int max=(m>n)?m:n;
	System.out.println(max);

	double num=(m>n)?2:1.0;
	System.out.println(num);

	String maxStr=(m>n)? "1" : ((m==n)? "0" : "-1");
	System.out.println(maxStr);
	}
}

class ThreeTest2{
	public static void main(String[] args){
		int n1=10;
		int n2=20;
		int n3=-10;
		int max1=(n1>n2) ? n1 : n2;
		int max2=(max1>n3) ? max1 : n3;
		System.out.println("max2="+max2);
	}
}

class ThreeTest3{
	public static void main(String[] args){
	int m1=10;
	int m2=20;
	int m3=-10;
	int max3=((m1>m2) ? m1 :m2)>m3 ? ((m1>m2) ? m1 :m2) : m3;
	System.out.println("max3="+max3);
	}
}