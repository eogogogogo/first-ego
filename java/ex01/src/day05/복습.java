package day05;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 문제 1) 입력받은수에 따라 짝수 홀수 0 출력
		// 문제 2) 1~300까지 3의배수 개수, 5의배수 개수, 3과5의배수 개수 출력
		// 문제 3) while문을 통해 반복적으로 숫자를 입력받다가 0이 입력되면 반복문 종료하기

//		System.out.println("입력받은수 >");
//		int a = sc.nextInt();
//
//		if (a == 0) {
//			System.out.println("0입니다.");
//		} else if (a % 2 == 1) {
//			System.out.println("홀수입니다.");
//		} else {
//			System.out.println("짝수입니다.");
//		}
		
		
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		
//		for (int i = 1; i<= 300; i++){
//			if(i % 3 == 0) {
//				a++;
//			}if(i % 5 == 0) {
//				b++;
//			}if(i % 15 == 0) {
//				c++;
//			}
//		} System.out.println(a);
//	 	  System.out.println(b);
//	 	  System.out.println(c);
		 
		while(true){
			System.out.println("입력");
			int a = sc.nextInt();
			if(a == 0) {
				System.out.println("실행종료");
				break;
				
			}
		}
	}

}
