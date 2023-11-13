package day04;

import java.util.Scanner;

public class ex01_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000; // 잔액
		String list = "";
		while(run) {
			System.out.printf("=====LOL상점=====[잔액 : %,d원]\n", balance); // \n 줄바꿈
			System.out.println("1.도란검(1000) 2.링(1200) 3.방패(1500) 4.충전 5.구매내역 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				if (balance >= 1000) {
					System.out.println("도란검 구매완료!");
					balance -= 1000;
					list += "도란검\t1000\n";
				} else {
					System.out.println("돈이 부족합니다.");
				}

				break;
			case 2:
				if (balance >= 1200) {
					System.out.println("도란링 구매완료!");
					balance -= 1200;
					list += "도란링\t1200\n";
				} else {
					System.out.println("돈이 부족합니다.");
				}
				break;
			case 3:
				if (balance >= 1500) {
					System.out.println("도란방패 구매완료!");
					balance -= 1500;
					list += "도란방패\t1500\n";
				} else {
					System.out.println("돈이 부족합니다.");
				}
				break;
			case 4:
				System.out.println("충전할 금액> ");
				int money = sc.nextInt();
				balance += money;
				break;
			case 5:
				System.out.println("구매상품\t가격");
				System.out.println("============");
				System.out.println(list);
				break;
			case 0:
				run = false;
				break;
			default:
				System.out.println("없는 번호입니다.");
			}

			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
