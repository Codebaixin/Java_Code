package com.atguigu.java2;
import java.util.Date;
import org.junit.Test;

public class JUnitTest {
	
	int num=10;
	@Test
	public void tsetEquals() {
		String s1="MM";
		String s2="MM";
		System.out.println(s1.equals(s2));
		
//		Object obj=new String("GG");
//		Date date=(Date)obj;
		
		System.out.println(num);
	}
	
	@Test
	public void testToString() {
		String s2="MM";
		System.out.println(s2.toString());
	}
}
