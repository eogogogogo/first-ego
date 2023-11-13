package day03;

import java.util.Scanner;

public class 조건문_if복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자입력> ");
		// 문제) 입력받은 숫자가 짝수인지 홀수인지 출력
//		int num = sc.nextInt();
//		
//		if(num % 2 == 1) {
//			System.out.println("홀수입니다.");
//		}
//		else if (num == 0) {
//			System.out.println("0입니다.");
//		}
//		else if (num % 2 != 1) {
//			System.out.println("짝수입니다.");
//		}

		// 문제) 입력받은 숫자가 양수 , 음수 , 0 출력

//		int num = sc.nextInt();
//
//		if (num == 0) {
//			System.out.println("0입니다.");
//		} else if (num > 0) {
//			System.out.println("양수입니다.");
//		} else {
//			System.out.println("음수입니다.");
//		}

// ctrl shift f 자동 줄맞춤		
		
		// 문제) 입력받은 숫자에 따라 3의배수, 5의배수, 3과5의배수, 둘다아님
		
//		int num = sc.nextInt();
//
//		if (num % 15 == 0) {
//			System.out.println("3과 5의 배수");
//		} else if(num % 3 == 0) {
//			System.out.println("3의 배수");
//		} else if(num % 5 == 0) {
//			System.out.println("5의 배수");
//		} else {
//			System.out.println("둘다아님");
//		}
//		

		System.out.println("첫번째 숫자> ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자> ");
		int num2 = sc.nextInt();
		
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
		System.out.println("메뉴선택> ");
		int menu = sc.nextInt();
		
		
		if(menu == 1) {
			System.out.println(num1 + num2 +"입니다");
			System.out.println(num1+" + "+num2+" = "+(num1 + num2)+"입니다.");
		} else if (menu == 2) {
			System.out.println(num1 - num2);
			System.out.println(num1+" - "+num2+" = "+(num1 - num2)+"입니다.");
		} else if (menu == 3) {
			System.out.println(num1 * num2);
		} else if (menu == 4) {
			System.out.println(num1 / num2);
		} else if (menu == 5) {
			System.out.println(num1 % num2);
		}
				
		
	}

}
