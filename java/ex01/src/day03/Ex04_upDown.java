package day03;

import java.util.Scanner;

public class Ex04_upDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int answer = (int) (Math.random() * 31) + 1;
//		// 1부터 31까지의 랜덤값
//
//		System.out.println();
//		int cha = 1;
//		while(true) {	
//			System.out.println("=====up&down=====");
//			System.out.println("1~31까지 숫자입력> ");
//			int num = sc.nextInt();
//			if(num > answer) {
//				System.out.println("Down");
//				cha ++;
//			}else if(num < answer) {
//				System.out.println("Up");
//				cha ++;
//			}else if(num == answer) {
//				System.out.println("정답입니다.");
//				System.out.println(cha+"번만에 성공!");
//				 break;	 
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*31)+1;
		System.out.println(answer);
		int cnt = 0;
		int chance = 5;
		
		while(true) {
			System.out.println("=====up&down=====");
			System.out.println("남은시도횟수 : "+(chance-cnt));
			System.out.print("1~31까지 숫자입력> ");
			int num = sc.nextInt();
			cnt++;
			
			if(num == answer) {
				System.out.println("정답입니다! 시도횟수 : "+cnt);
				break;
			}else if(cnt == chance) {
				System.out.println("Game over\n정답 : "+answer);
				break;
			}else if(num > answer) {
				System.out.println("down");
			}else if(num < answer) {
				System.out.println("up");
			}
			
			System.out.println();
		}
	}

}
