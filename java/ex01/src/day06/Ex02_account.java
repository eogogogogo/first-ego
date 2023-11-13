package day06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10]; // 예금주
		String[] account = new String[10]; // 계좌번호
		int[] balance = new int[10]; // 잔액
		String[] joinDate = new String[10]; // 가입날짜
		int cnt = 0;

		while (true) {
			System.out.println("=====LOL은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("예금주> ");
				name[cnt] = sc.next();
				System.out.println("계좌번호> ");
				account[cnt] = sc.next();
				System.out.println("초기잔액> ");
				balance[cnt] = sc.nextInt();

				String now = dtf.format(LocalDateTime.now());
				joinDate[cnt] = now;

				System.out.println(name[cnt] + "님 계좌생성 되었습니다.");
				cnt++;
			} else if (menu == 2) {
				System.out.println("입금할 계좌번호> ");
				String inAccount = sc.next();
				System.out.println("입금할 금액> ");
				int inMoney = sc.nextInt();
				boolean find = false;
				for (int i = 0; i < cnt; i++) {
					if (inAccount.equals(account[i])) {
						balance[i] = balance[i] + inMoney;
						System.out.println("입금끝");
						find = true;
						break;
					}

				}
				if (!find) {
					System.out.println("없는계좌입니다.");
				}
			} else if (menu == 3) {
				System.out.println("출금할 계좌번호> ");
				String outAccount = sc.next();
				System.out.println("출금할 금액> ");
				int outMoney = sc.nextInt();
				boolean find = false;
				for(int i=0; i < cnt; i++) {
					if (outAccount.equals(account[i])) {
						if(outMoney > balance[i]) {
							System.out.println("잔액이 부족합니다.");
						}else {
						balance[i] = balance[i] - outMoney;
						System.out.println("출금끝");}
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("없는계좌입니다.");
				}
			} else if (menu == 4) {
				System.out.println("예금주\t계좌번호\t잔액\t\t가입날짜");
				System.out.println("=========================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d원\t\t%s\n", name[i], account[i], balance[i], joinDate[i]);
				}
			} else if (menu == 0) {
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
