package day07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];    //이름
		String[] id = new String[10];      //아이디
		String[] pw = new String[10];      //비밀번호
		String[] date = new String[10];    //회원가입날짜
		int cnt = 0;
		int loginIndex = -1;
		
		while(true) {
			System.out.println("=====LOL=====");
			if(loginIndex == -1) {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			}else {
				System.out.println(name[loginIndex]+"님이 로그인하셨습니다.");
				System.out.println("1.비밀번호수정 2.로그아웃 3.내정보 0.종료");
			}
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(loginIndex == -1) {
					System.out.println("이름> ");
					name[cnt] =sc.next();
					System.out.println("아이디> ");
					id[cnt] = sc.next();
					System.out.println("비밀번호> ");
					pw[cnt] = sc.next();
					String now = dtf.format(LocalDateTime.now());
					date[cnt] = now;
					System.out.println(name[cnt]+"님 회원가입을 축하드립니다.");
					cnt++;
				}else {
					System.out.println("수정할 비밀번호> ");
					pw[loginIndex] = sc.next();
					System.out.println("비밀번호 수정완료!");
				}
				
			}else if(menu ==2) {
				if(loginIndex == -1) {
					System.out.println("아이디를 입력하세요.");
					String inid=sc.next();
					System.out.println("비밀번호를 입력하세요.");
					String inpw=sc.next();
					for(int i=0;i<cnt;i++) {
					if(inid.equals(id[i]) && inpw.equals(pw[i])) {
						System.out.println("로그인성공");
						loginIndex = i;
					} else {
						System.out.println("로그인실패");
					}
					}
				}else {
					loginIndex = -1;
				}
				
			}else if(menu == 3) {
				if(loginIndex == -1) {
					System.out.println("이름\t아이디\t비밀번호\t가입일");
					System.out.println("=========================================");
					for(int i=0; i<cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\n",
								name[i], id[i], pw[i], date[i]);
					}
				}else {
					System.out.println("이름\t아이디\t비밀번호\t가입일");
					System.out.println("=========================================");
					System.out.printf("%s\t%s\t%s\t%s\n",
							name[loginIndex], id[loginIndex], pw[loginIndex], date[loginIndex]);
				}
			}else if(menu == 0) {
				break;
			}
			
			System.out.println();
		}
		System.out.println("LOL게임 종료");
	}

}
