class BreakContinueTest1{
	public static void main(String[] args){
	for(int i=1;i<=4;i++){
		for(int j=1;j<=10;j++){
			if(j%4==0){
				break;
				}
			System.out.print(j);
				}
			System.out.println();
		}
	}
}
	
class BreakContinueTest2{
	public static void main(String[] args){
	for(int i=1;i<=4;i++){
		for(int j=1;j<=10;j++){
			if(j%4==0){
				continue;
				}
			System.out.print(j);
				}
			System.out.println();
		}
	}
}	

class BreakContinueTest3{
	public static void main(String[] args){
	label:for(int i=1;i<=4;i++){
		for(int j=1;j<=10;j++){
			if(j%4==0){
				break label;
				}
			System.out.print(j);
				}
			System.out.println();
		}
	}
}

class BreakContinueTest4{
	public static void main(String[] args){
	label:for(int i=1;i<=4;i++){
		for(int j=1;j<=10;j++){
			if(j%4==0){
				continue label;
				}
			System.out.print(j);
				}
			System.out.println();
		}
	}
}