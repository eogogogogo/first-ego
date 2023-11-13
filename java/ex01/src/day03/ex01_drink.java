package day03;

import java.util.Scanner;

public class ex01_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int money = 10000;

		while (true) {
			System.out.println("=====자판기=====잔액 : " + money + "원");
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (money >= 1000) {
					System.out.println("콜라선택");
					money -= 1000; // money = money - 1000;
				} else {
					System.out.println("잔액부족");
				}
			} else if (menu == 2) {
				if (money >= 1200) {
					System.out.println("사이다선택");
					money -= 1200;
				} else {
					System.out.println("잔액부족");
				}
			} else if (menu == 3) {
				if (money >= 1500) {
					System.out.println("우유선택");
					money -= 1500;
				} else {
					System.out.println("잔액부족");
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("없는 번호입니다.");
			}

			System.out.println();
		}

	}

}
