package day11;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		User[] list = new User[10];
		int cnt = 0;
		
		while(true) {
			System.out.println("=====LOL=====");
			System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				User u = new User();
				System.out.println("이름 입력");
				u.setName(sc.next());
				System.out.println("아이디 입력");
				u.setId(sc.next());
				System.out.println("비밀번호 입력");
				u.setPw(sc.next());
				list[cnt] = u;
				cnt++;
				System.out.println("가입완료");
				
			}else if(menu == 2) {
				System.out.println("아이디입력");
				String id = sc.next();
				System.out.println("비번입력");
				String pw = sc.next();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(id.equals(list[i].getId()) && pw.equals(list[i].getPw())) {
						System.out.println("로그인 성공");
						find = true;
						break;
					}
				}
				
				if(!find) {
					System.out.println("로그인 실패");
				}
				
			}else if(menu == 3) {
				System.out.println("이름\t아이디\t비밀번호");
				System.out.println("===========================");
				for(int i = 0; i<cnt; i++) {
					list[i].print();
				}
				
			}else if(menu == 0) {
				
			}
			
			System.out.println();
		}
	}

}
