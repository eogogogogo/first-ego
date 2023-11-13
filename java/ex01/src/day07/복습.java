package day07;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 입력받은 나이에 따라
		// 19이상은 성인
		// 13 이상은 청소년
		// 13 미만은 어린이 출력

//		System.out.println("입력");
//		int a = sc.nextInt();
//		
//		
//		if(a>=19) {
//			System.out.println("성인");
//		}else if(a>=13) {
//			System.out.println("청소년");
//		}else {
//			System.out.println("어린이");
//		}

		// 문제2) 1~400까지의 짝수의 합과 홀수의 개수 출력

//		int sum = 0;
//		int num = 0;
//		
//		for(int i=1;i<=400;i++) {
//			if(i % 2 == 0) {
//				sum+=i;
//			}else {
//				num++;
//			}
//		} System.out.println(sum);
//			System.out.println(num);

		// 문제3) while문으로 반복하면서 숫자를 입력받고,
		// 입력받은 숫자에 따라 3의배수, 5의배수, 3과5의배수 출력

//		while(true) {
//			System.out.println("입력");
//			int a= sc.nextInt();
//			if(a % 15 == 0) {
//				System.out.println("3과5의배수");
//			}else if(a % 3 == 0) {
//				System.out.println("3의배수");
//			}else if(a % 5 == 0) {
//				System.out.println("5의배수");
//			}
//			
//		}

		// 문제) a배열에서 짝수의 합과 홀수의 개수 출력
//		int[] a = {23,4,5,7,46};
//		int sum=0;
//		int num=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i] % 2 == 0) {
//				sum+=a[i];
//			}if(a[i] % 2 == 1){
//				num++;
//			}
//		}
//		System.out.println(sum);
//		System.out.println(num);

		// 문제) 반복하면서 숫자를 입력받는데 짝수만 b배열에 저장하기 *홀수만 입력 시 무한반복
//		int[] b = new int[5];
//		for(int i=0;i<b.length;i++) {
//			System.out.println("입력해주세요.");
//			int num = sc.nextInt();
//			if(num % 2 == 0) {
//				b[i] =num;
//			}else {
//				i--;
//			}
//		}System.out.println("끝");

		// 고난이도 문제)
		int[] a = { 23, 4, 5, 7, 46 };

		// 출력예시) 4,5,7,46,23
//		int num = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			if (i == 0) {
//				num = a[0];
//			} if (i > 0) {
//				a[i - 1] = a[i];
//			} if(i == 4){
//				a[4] = num;
//			}
//		}
		
		// 또 하나의 방법 정렬방법
		
		for(int i=1; i<a.length;i++) {
			int temp = a[i];
			a[i] = a[i-1];
			a[i-1] = temp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
