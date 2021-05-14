class LogicTest1{
	public static void main(String[] args){
	boolean b1=true;
	int num1=10;
	if(b1&(num1++>0)){
		System.out.println("我现在在北京");
	}else{
		System.out.println("我现在在南京");
	}

	System.out.println("num1="+num1);

	boolean b2=true;
	int num2=10;
	if(b1&&(num2++>0)){
		System.out.println("我现在在北京");
	}else{
		System.out.println("我现在在南京");
	}

	System.out.println("num2="+num2);
	}
}

class LogicTest2{
	public static void main(String[] args){
	boolean b3=true;
	b3=false;
	int num3=10;
	if(b3&(num3++>0)){
		System.out.println("我现在在北京");
	}else{
		System.out.println("我现在在南京");
	}

	System.out.println("num3="+num3);

	boolean b4=true;
	b4=false;
	int num4=10;
	if(b4&&(num4++>0)){
		System.out.println("我现在在北京");
	}else{
		System.out.println("我现在在南京");
	}

	System.out.println("num4="+num4);
	}
}

class LogicTest3{
	public static void main(String[] args){
	int x1=1;
	int y1=1;
	if(x1++==2&++y1==2){
		x1=7;
	}
	System.out.println("x1="+x1+",y1="+y1);
	}
}

class LogicTest4{
	public static void main(String[] args){
	int x2=1;
	int y2=1;
	if(x2++==2&&++y2==2){
		x2=7;
	}
	System.out.println("x2="+x2+",y2="+y2);
	}
}

class LogicTest5{
	public static void main(String[] args){
	int x3=1;
	int y3=1;
	if(x3++==1|++y3==1){
		x3=7;
	}
	System.out.println("x3="+x3+",y3="+y3);
	}
}

class LogicTest6{
	public static void main(String[] args){
	int x4=1;
	int y4=1;
	if(x4++==1||++y4==1){
		x4=7;
	}
	System.out.println("x4="+x4+",y4="+y4);
	}
}