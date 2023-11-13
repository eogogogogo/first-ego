package day11;

import java.util.Scanner;

import day12.Shopping;

public class Util {
	// 숫자체크 메서드
	public int numberCheck(Scanner sc, String str) {
		while (true) {
			System.out.println(str + "> ");
			if (sc.hasNextInt()) {
				return sc.nextInt();
			} else {
				sc.nextLine();
			}
			System.out.println("숫자를 입력하세요");

		}
	}

	public int numberCheck1(Scanner sc, String str) {
		System.out.print(str + "> ");
		do {
			if (sc.hasNextInt()) {
				return sc.nextInt();
			} else {
				sc.nextLine();
			}
			System.out.print("숫자만 입력> ");
		} while (true);
	}

	// 글자수 체크
	public String lengthCheck(Scanner sc) {
		sc.nextLine();
		while (true) {
			if (sc.hasNextInt()) {
				String a = sc.nextInt() + "";
				if (a.length() == 4) {
					return a.substring(0, 2) + "-" + a.substring(2);
				}
				sc.nextLine();
				System.out.print("4자로 입력하세요> ");
			} else {
				sc.nextLine();
				System.out.print("숫자만 입력> ");
			}
		}
	}
	
}
