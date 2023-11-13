package day04;

import java.util.Scanner;

public class 반복문_for복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 문제1) 1~100까지의 합 출력
		// 문제2) 1~100까지의 3의배수개수, 5의배수개수, 3과5의배수 개수 출력
		// 문제3) 두개의 숫자를 입력받고, 첫번째 입력받은 수부터 두번쨰 입력받은 수까지의 합 출력

//		int num = 0;
//		for(int i=1; i<=100; i++) {
//			num=num+i;
//		}
//		System.out.println(num);

//		int a = 0;
//		int b = 0;
//		int c = 0;
//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				a++;
//			}
//			if (i % 5 == 0) {
//				b++;
//			}
//			if (i % 3 == 0 && i % 5 == 0) {
//				c++;
//			}
//			
//		}
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		// 문제3) 두개의 숫자를 입력받고, 첫번째 입력받은 수부터 두번쨰 입력받은 수까지의 합 출력
		
		int sum=0;
		System.out.print("숫자입력> ");
		int num1 = sc.nextInt();
		System.out.print("숫자입력> ");
		int num2 = sc.nextInt();				
		if(num1<num2) {for(int i = num1; i<= num2; i++) {
			sum=sum+i;}
		}else if(num2<num1) {for(int i = num2; i<=num1; i++) {
			sum=sum+i;}
		}
		System.out.println(sum);
	}
}
