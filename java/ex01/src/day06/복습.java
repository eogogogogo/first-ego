package day06;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		// 입력받은 숫자에 따라 90이상:A, 80이상:B,70이상:C,60이상:D,60미만:F
		
//		System.out.println("숫자입력> ");
//		int a = sc.nextInt();
//		
//		if(a>=90) {
//			System.out.println("A");
//		}else if(a>=80) {
//			System.out.println("B");
//		}else if(a>=70) {
//			System.out.println("C");
//		}else if(a>=60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
//		
		// 1~200까지의 합 출력, 3의 배수의 개수 출력
		
//		int sum = 0;
//		int a = 0;
//		
//		for(int i=1;i<=200;i++) {
//			sum = sum+i;
//			if(i % 3 == 0) {
//				a++;
//			}
//		} System.out.println(sum);
//			System.out.println(a);
		// while문을 통해 반복적으로 숫자를 입력받다가 0이입력되면 반복문 종료
			
		
		
//			while(true) {
//				System.out.println("숫자입력> ");
//				int a = sc.nextInt();
//				if(a == 0) {
//					System.out.println("종료합니다");
//					break;
//					
//				}
//			}
		
//			int[] a = {1,2,3,4,5};
//			int sum = 0;
//			for(int i=0;i<a.length;i++) {
//				sum+=a[i];
//			}
//			System.out.println(sum);
		
			int[] a = {77, 44, 18, 28, 93};
			// 문제) a배열의 값중에 홀수의 합 출력
			
//			int sum = 0;
//			for(int i=0;i<a.length;i++) {
//				if(a[i] % 2 == 1) {
//					sum+=a[i];
//				}
//			}
//			System.out.println(sum);
			// 문제) a배열의 짝수 인덱스 값 합 출력
			int sum = 0;
			for(int i=0;i<a.length;i++) {
				if(i % 2 == 0) {
					sum+=a[i];
				}
			}
			System.out.println(sum);
	}

}
