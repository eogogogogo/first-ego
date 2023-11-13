package day03;

import java.util.Scanner;

public class Ex02_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id = "test"; //회원가입한 아이디
		String pw = "1234"; //회원가입한 비밀번호
		
		while(true) {
			System.out.println("=====LOL=====");
			System.out.println("아이디입력>");
			String loginId = sc.next();
			System.out.println("비밀번호 입력> ");
			String loginPw = sc.next();
			
			if(loginId.equals(id) && loginPw.equals(pw)) {
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("로그인 실패ㅠ");
				System.out.println("로그인 재시도?(Y/y)> ");
				String re = sc.next();
				
				if(!(re.equals("Y")) && !(re.equals("y"))) {
					break;
				}
			}
			
			
			
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
