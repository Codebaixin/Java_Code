class ForForTest1{
	public static void main(String[] args){
	int i=0;
	for(i=0;i<4;i++){
		int j=0;
		for(j=0;j<5;j++){
			System.out.print("*");
			}
		System.out.println();
		}
	}
}

class ForForTest2{
	public static void main(String[] args){
	int i=0;
	for(i=0;i<5;i++){
		int j=0;
		for(j=0;j<=i;j++){
			System.out.print("*");
			}
		System.out.println();
		}
	}
}

class ForForTest3{
	public static void main(String[] args){
	int i=0;
	for(i=0;i<4;i++){
		int j=0;
		for(j=0;j<4-i;j++){
			System.out.print("*");
			}
		System.out.println();
		}
	}
}

class ForForTest4{
	public static void main(String[] args){
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5-i;j++){
				System.out.print(" ");
				}
		for(int k=1;k<=i;k++){
				System.out.print("*"+" ");
				}
		System.out.println();
		}
	for(int l=1;l<=4;l++){
		for(int m=1;m<=l;m++){
			System.out.print(" ");
			}
		for(int n=1;n<=4-l+1;n++){
			System.out.print("*"+" ");
			}
		System.out.println();
		}
	}
}

class ForForTest5{
	public static void main(String[] args){
	int i=0;
	int j=0;
	for(i=1;i<=9;i++){
		for( j=1;j<=i;j++){
			System.out.print(i+"*"+j+"="+i*j);
			System.out.print(" ");
			}
		System.out.println();
		}
	}
}

class ForForTest6{
	public static void main(String[] args){
	int i=0;
	int j=0;
	int count=0;
	for(i=2;i<=100;i++){
		for(j=2;j<i;j++){
			if(i % j ==0){
				break;
				}
			}
		if(j==i){
			System.out.print(i);
			System.out.print(" ");
			count++;
			}
		}
	System.out.println("\n"+count);
	}
}

class ForForTest7{
	public static void main(String[] args){
	int i=0;
	int j=0;
	int count=0;
	for(i=2;i<=100;i++){
		boolean isFlage=true;
		for(j=2;j<=Math.sqrt(i) ;j++){
			if(i % j ==0){
				isFlage=false;
				break;
				}
			}
		if(isFlage==true){
			System.out.print(i);
			System.out.print(" ");
			count++;
			}
		}
	System.out.println("\n"+count);
	}
}	

			