package day03;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		while (i <= 10) {
//			System.out.println("야하");
//			i++;
//			if (i == 5) {
//				break;
//			}
//		}

//		// while문으로 1~100까지 합 출력
//		int sum = 0;
//		int i = 1;
//		while(i <=100) {
//			sum = sum+i;
//			i++;
//		}
//		System.out.println(sum);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자입력> ");
			int num = sc.nextInt();
			if (num % 15 == 0 && !(num == 0) ) {
				System.out.println("3과5의배수");
			} else if (num % 3 == 0 && !(num == 0)) {
				System.out.println("3의배수");
			} else if (num % 5 == 0 && !(num == 0)) {
				System.out.println("5의배수");
			} else
				System.out.println("입력받은 값 : " + num);
			if (num == 0) {
				break;
			}
		}
		System.out.println("반복문 종료");
	}

}
