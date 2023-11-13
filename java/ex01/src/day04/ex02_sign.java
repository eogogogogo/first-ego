package day04;

import java.util.Scanner;

public class ex02_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String name = ""; // 회원가입 이름
		String id = ""; // 회원가입 아이디
		String pw = ""; // 회원가입 비밀번호

		while (run) {
			System.out.println("==========LOL사이트=========");
			System.out.println("1.회원가입 2.로그인 3.비밀번호 찾기 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("이름입력");
				name = sc.next();
				System.out.println("아이디입력");
				id = sc.next();
				System.out.println("비밀번호 입력");
				pw = sc.next();
				System.out.println("회원가입을 축하드립니다");
			} else if (menu == 2) {
				System.out.println("아이디입력");
				String a = sc.next();
				System.out.println("비밀번호입력");
				String b = sc.next();
					// String는 equals로 비교한다
				if (a.equals(id) && b.equals(pw)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}else if(menu == 3) {
				System.out.println("이름> ");
				String searchName = sc.next();
				System.out.println("아이디> ");
				String searchId = sc.next();
				
				if(searchName.equals(name) && searchId.equals(id)) {
					System.out.println(pw);
				}else {
					System.out.println("회원정보가 없습니다.");
				}
			} else if (menu == 0) {
				run = false;
			}
			System.out.println();
		}

		System.out.println("LOL 종료");
	}

}
