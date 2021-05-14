class IfTest1{
	public static void main(String[] args){
		int heartBeats=179;
		if(heartBeats<60 || heartBeats>100){
			System.out.println("需要进一步检查");
		}

		System.out.println("检查结束")；	
	}
}

class IfTest2{
	public static void main(String[] args){
		int age=23;
		if(age<18){
			System.out.println("你还可以看动画片");
		}else{
			System.out.println("你可以看成人电影")；
	}
}