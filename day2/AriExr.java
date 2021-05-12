class AriExr1{
	public static void main(String[] args){
		int num=187;
		int hundreds=num/100;
		int decade=num%100/10;
		int unit=num%100%10;
		System.out.println("数字"+num+"的情况如下：");
		System.out.println("个位数："+unit);
		System.out.println("十位数："+decade);
          		System.out.println("百位数："+hundreds);
	}
}

