class BitTest1{
	public static void main(String[] args){
		int i=21;
		System.out.println("i<<2:"+(i<<2));
		System.out.println("i<<3:"+(i<<3));
		System.out.println("i<<26:"+(i<<26));
		System.out.println("i<<27:"+(i<<27));
	}
}

class BitTest2{
	public static void main(String[] args){
	int m=12;
	int n=5;
	System.out.println("m&n="+(m&n));
	System.out.println("m|n="+(m|n));
	System.out.println("m^n="+(m^n));
	}
}

class BitTest3{
	public static void main(String[] args){
	int num1=10;
	int num2=20;
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("num1="+num1+",num2="+num2);
	}
}

class BitTest4{
	public static void main(String[] args){
	int num3=10;
	int num4=20;
	int temp=num3;
	num3=num4;
	num4=temp;
	System.out.println("num3="+num3+",num4="+num4);
	}
}


class BitTest5{
	public static void main(String[] args){
	int num5=10;
	int num6=20;
	num5=num5^num6;
	num6=num5^num6;
	num5=num5^num6;
	System.out.println("num5="+num5+",num6="+num6);
	}
}