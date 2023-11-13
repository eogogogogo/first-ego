package day04;

import java.util.Scanner;

public class 조건문if_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 문제) 입력받은 수에 따라 양수, 음수 0 출력
//		System.out.println("숫자입력> ");
//		int num = sc.nextInt();
//		
//		if(num >0) {
//			System.out.println("양수");
//		}else if(num<0) {
//			System.out.println("음수");
//		}else {
//			System.out.println("0");
//		}
		
		//문제) 입력받은수에 따라 3의배수, 5의배수 3과5의배수 둘다아님 출력
		
		 System.out.println("숫자입력> ");
		 int num = sc.nextInt();
		 
		 if(num % 3 == 0 && num % 5 == 0) {
			 System.out.println("3과5의배수");
		 }else if(num % 3 == 0) {
			 System.out.println("3의배수");
		 }else if(num % 5 == 0) {
			 System.out.println("5의배수");
		 }else {
			 System.out.println("둘다아님");
		 }
	}

}
