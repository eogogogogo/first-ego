package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> list = new ArrayList<Account>();
		Util util = new Util();

		while (true) {
			System.out.println("=====LOL은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.조회 0.종료");
//			System.out.println("메뉴선택> ");
			int menu = util.numberCheck(sc,"메뉴선택");

			if (menu == 1) {
				System.out.println("예금주> ");
				String name = sc.next();
				System.out.println("계좌번호> ");
				String account = util.lengthCheck(sc);
				System.out.println("비밀번호> ");
				String pw = sc.next();
				Account a = new Account(name, account, pw);
				list.add(a);
				System.out.println(name + "님 계좌번호 생성 완료");
			} else if (menu == 2) {
				System.out.println("입급할 계좌> ");
				String inAccount = sc.next();
				System.out.println("입금할 금액> ");
				int inMoney = sc.nextInt();
				boolean find = false;

				for (Account a : list) {
					if (inAccount.equals(a.getAccount())) {
						a.deposit(inMoney);
						System.out.println("입금완료");
						break;
					}
				}
				if (!find) {
					System.out.println("조회가 불가능한 계좌입니다.");
				}

			} else if (menu == 3) {
				System.out.println("출금할 계좌> ");
				String outAccount = sc.next();
				System.out.println("출금할 금액> ");
				int outMoney = sc.nextInt();
				boolean find = false;

				for (Account a : list) {
					if (outAccount.equals(a.getAccount())) {
						if (a.withdraw(outMoney)) {
							System.out.println("출금완료");
						} else {
							System.out.println("잔액부족");
						}
						find = true;
						break;
					}
					
				}
				if (!find) {
					System.out.println("조회가 불가능한 계좌입니다.");
				}
				
			} else if (menu == 4) {
				System.out.println("예금주\t계좌번호\t비밀번호\t잔액\t가입날짜");
				System.out.println("==================================================");
				for (Account a : list) {
					a.print();
				}
			} else if (menu == 5) {
				System.out.println("계좌번호 입력> ");
				String inputAccount = sc.next();
				boolean find = false;
				for(Account a : list) {
					if(inputAccount.equals(a.getAccount())) {
						a.print();
						find = true;
						break;
					}
				}
				find = false;
				System.out.println("계좌가 없습니다.");
				

			} else if (menu == 0) {
				break;
			}
			System.out.println();
		}
	}

}
