package day08;

import java.util.Scanner;

public class Ex02_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		int loginIndex = -1;
		int cho1 = 0;
		int outmoney = 0;

		while (true) {
			System.out.println("=====LOL은행=====");
			if (loginIndex == -1) {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			} else {
				System.out.println("1.회원정보수정 2.로그아웃(" + name[loginIndex] + "님) 3.입금 4.출금 5.계좌이체 0.종료");
			}

			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (loginIndex == -1) {
					// 이름, 아이디, 비밀번호, 계좌번호 입력받아서 회원가입
					System.out.print("이름> ");
					name[cnt] = sc.next();
					System.out.print("아이디> ");
					id[cnt] = sc.next();
					System.out.print("비밀번호> ");
					pw[cnt] = sc.next();
					System.out.print("계좌번호> ");
					account[cnt] = sc.next();
					System.out.println("회원가입성공!");
					cnt++;
				} else {
					System.out.println("무엇을 수정하시겠습니까? 1.이름 2.비밀번호 3.계좌번호 0.돌아가기");
					cho1 = sc.nextInt();
					// 회원정보 수정
					if (cho1 == 1) {
						System.out.println("바꿀 이름수정> ");
						name[loginIndex] = sc.next();
					} else if (cho1 == 2) {
						System.out.println("바꿀 비밀번호> ");
						pw[loginIndex] = sc.next();
					} else if (cho1 == 3) {
						System.out.println("바꿀 계좌번호> ");
						account[loginIndex] = sc.next();
					} else if (cho1 == 0) {
						System.out.println("이전 항목으로 돌아갑니다.");
					}

				}

			} else if (menu == 2) {
				if (loginIndex == -1) {
					// 아이디, 비밀번호 입력받아서 로그인 기능
					System.out.print("로그인 할 아이디> ");
					String loginId = sc.next();
					System.out.print("로그인 할 비밀번호> ");
					String loginPw = sc.next();
					boolean find = false;

					for (int i = 0; i < cnt; i++) {
						if (loginId.equals(id[i]) && loginPw.equals(pw[i])) {
							System.out.println("로그인 성공");
							loginIndex = i;
							find = true;
							break;
						}
					}
					if (!find) {
						System.out.println("로그인 실패");
						
					}
				} else {
					// 로그아웃
					loginIndex = -1;
				}
			} else if (menu == 3) {
				if (loginIndex == -1) {
					// 회원목록 출력
					System.out.println("이름\t아이디\t비밀번호\t계좌번호\t잔액");
					System.out.println("======================================");
					for (int i = 0; i < cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\t%,d원\n", name[i], id[i], pw[i], account[i], balance[i]);
					}
				} else {
					// 입금 -입금금액 받아서 입금
					System.out.println("입금하실 금액을 넣어주세요");
					balance[loginIndex] += sc.nextInt();
					System.out.println("입금완료");
				}
			} else if (menu == 4 && loginIndex != -1) {
				// 출금 -출금금액 받아서 출급 잔액부족확인
				int z = 0;
				System.out.println("출금할 금액을 입력해주세요");
				z = sc.nextInt();
				if (balance[loginIndex] >= z) {
					balance[loginIndex] = balance[loginIndex] - z;
					System.out.println("출금이 완료되었습니다.");
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else if (menu == 5 && loginIndex != -1) {
				// 계좌이체 이체 할 계좌랑 이체 금액 받아서 계좌이체 잔액부족확인
				String qwer = "";
				int iinmoney = 0;
				System.out.println("입금할 계좌번호를 입력해 주세요");
				qwer = sc.next();
				System.out.println("이체할 금액을 입력해 주세요");
				iinmoney = sc.nextInt();
				boolean run = false;

				for (int i = 0; i < cnt; i++) {
					if (qwer.equals(account[i])) {
						if (iinmoney <= balance[loginIndex]) {
							balance[loginIndex] = balance[loginIndex] - iinmoney;
							balance[i] = balance[i] + iinmoney;
							System.out.println("입금완료");
							run = true;
							break;
						} else {
							System.out.println("금액이 부족합니다.");
							run = true;
							break;
						}
						

					}

				}
				if (!run) {
					System.out.println("계좌가 없습니다.");

				}

			} else if (menu == 0) {
				break;
			}

			System.out.println();
		}
		System.out.println("LOL은행 프로그램 종료");

	}

}
