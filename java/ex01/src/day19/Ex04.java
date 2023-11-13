package day19;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
//		long num=220000000000000L;
		
//		int num=???;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
//		float sum=0;
		double sum=0;
		
		for(int i=0;i<100;i++) {
			sum+=0.01;
		}
		System.out.println("sum:"+sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		String val1=sc.next();
		System.out.println("입력");
		String val2=sc.next();
		
		BigDecimal a=new BigDecimal(val1);
		BigDecimal b=new BigDecimal(val2);
		
		//BigDecimal result=a.subtract(b).abs();
	 	//System.out.println("차의 절대값="+result);
	 	BigDecimal result=a.subtract(b);
	 	System.out.println("차의 절대값="+result.abs());   // abs 절대값 나타내는 메서드
		
	}

}
