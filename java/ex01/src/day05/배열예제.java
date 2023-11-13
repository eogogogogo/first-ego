package day05;

import java.util.Scanner;

public class 배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int[] a = {11,22,33,44,55,66,77,88,99,110};
		// 문제1) a배열의 모든값의 합 출력
//		int sum = 0;
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];
//		} System.out.println(sum);

		// 문제2) a배열의 값중 짝수의 합 출력
//		int sum = 0;
//		for(int i=0; i<a.length; i++) {
//			if(a[i] % 2 == 0) {
//				sum += a[i];
//			} 
//		}
//		System.out.println(sum);
//		//문제3) a배열의 홀수의 개수 출력
//		int e= 0;
//		for(int i=0; i<a.length; i++) {
//			if(a[i] % 2 ==1 ) {
//				e++;
//			}
//		}System.out.println(e);

		// 문제4)a배열의 인덱스가 짝수인 값의 합 출력
//		int sum = 0;
//		for(int i=0; i<a.length; i=i+2) {
//			sum += a[i];
//		}System.out.println(sum);

		// 문제 5) 0번째 인덱스를 제외하고 짝수의 값의 합
//		int sum = 0;
//		for(int i=0; i<a.length; i++) {
//			if(i % 2 == 0 && i!=0) {
//				sum += a[i];
//			}
//		}System.out.println(sum);

//		int[] a = new int[100];
//		
//		for(int i=0; i<a.length; i++) {
//			a[i] = i+1;
//		}
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}

//		int[] a = new int[10];                  
//		for(int i=0; i<a.length; i++) {
//			System.out.println("숫자입력> ");
//			a[i] = sc.nextInt();
//		}
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}

		// 반복하면서 a배열에 값을 입력하는데 인덱스 순서를 1,2,3,4,5,6,7,8,9,0
//		int[] a = new int[10];
//
//		for(int i=0; i<a.length; i++) {
//			if(i==9) {
//				System.out.println("숫자입력> ");
//				a[0] = sc.nextInt();
//			}else if(i<9) {
//				System.out.println("숫자입력> ");
//				a[i+1] = sc.nextInt();
//			}
//		}for(int i=0; i<a.length; i++) {
//				System.out.println(a[i]);
//		}

		// 교수님께서 쓰신 방법
//		for(int i=0; i<a.length; i++) {
//			System.out.println("숫자입력> ");
//			if(i == a.length-1) {
//				a[0] = sc.nextInt();
//			}else {
//				a[i+1] = sc.nextInt();
//			}
//		}for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}

		// 문제) a배열에서 값이 3의배수개수, 5의배수개수, 3과5의배수개수
//		int[] a = { 23, 4, 25, 3, 2, 5, 1, 99, 45, 77 };
//		int cnt3 = 0;
//		int cnt5 = 0;
//		int cnt35 = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 3 == 0) {
//				cnt3++;
//			}
//			if (a[i] % 5 == 0) {
//				cnt5++;
//			}
//			if (a[i] % 15 == 0) {
//				cnt35++;
//			}
//		}
//		System.out.println(cnt3);
//		System.out.println(cnt5);
//		System.out.println(cnt35);

		// 문제) 반복하면서 입력을 받는데, 짝수만 a배열에 저장하고 출력
//		int[] a = new int[10];
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("숫자입력> ");
//			int num = sc.nextInt();
//
//			if (num % 2 == 0) {
//				a[i] = num;
//			} else {
//				i--; // 홀수가 들어가면 i의 개수가 올라가면 안되서 i-- 입력
//			}
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}

		// 후치는 실행문 다 실행하고 전치는 실행문 시작 전에

		// 문제) 짝수의 합에서 홀수의 합 뺴기
//		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 110 };
//
//		int sum1 = 0;
//		int sum2 = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				sum1 += a[i];
//			} else {
//				sum2 += a[i];
//
//			}
//		}System.out.println(sum1 - sum2);

		// 문제) a배열의 0번째 인덱스에 모든 값 누적
//		int[] a = { 11, 22, 33, 44, 55 };
//		for (int i = 0; i < a.length; i++) { 
//			if(i > 0) {
//				a[0] += a[i];
//			} else {
//				
//			}
//			
//		}System.out.println(a[0]);

		// 더 간단한 방법
//		int[] a = { 11, 22, 33, 44, 55 };
//		for (int i = 1; i < a.length; i++) {
//			a[0] += a[i];
//		} System.out.println(a[0]);
	}
}
