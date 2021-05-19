class IfTestA{
	public static void main(String[] args){
	int x = 4;
	int y = 1;
	if (x > 2) {
		if (y > 2) 
			System.out.println(x + y);
		System.out.println("atguigu");
	} else
	System.out.println("x is " + x);
	}
}

class IfTestB{
	public static void main(String[] args){
	int x1 = 4;
	int y1 = 1;
	if (x1 > 2) 
	if (y1 > 2) 
	System.out.println(x1 + y1);
	else
	System.out.println("x1 is " + x1);
	}
}