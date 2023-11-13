package day10;

import java.util.Scanner;

public class MemerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Member[] list = new Member[10];
		int cnt = 0;
		int id = 1000;
		
		while(true) {
			System.out.println("=====멤버관리시스템=====");
			System.out.println("1.멤버등록 2.멤버목록 3.검색 4.멤버수정 0.종료");
			System.out.println("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu ==1) {
				// 두번째 생성자 사용하여 객체 생성
				System.out.println("e메일 입력");
				String email = sc.next();
				System.out.println("비밀번호 입력");
				String pw = sc.next();
				System.out.println("이름입력");
				String name = sc.next();
				Member m =new Member(id++,email,pw,name);
				list[cnt] = m;
				cnt++;
				System.out.println("등록이 완료되었습니다.");
			}else if(menu ==2) {
				System.out.println("=============================================");
				System.out.println("아이디\t이메일\t비밀번호\t이름\t가입일");
				System.out.println();
				for(int i = 0; i<cnt;i++) {
					list[i].print();
				}
				// 전체목록 출력
			}else if(menu ==3) {
				// 아이디로 검색하고 멤버정보 출력
				System.out.println("검색할 아이디를 입력해주세요.");
				String searchId = sc.next();
				boolean find = false;
				for(int i=0; i<cnt; i++) {
					if(searchId.equals(list[i].getId())) {
						list[i].print();
						find = true;
						break;
					}
				}
				if(!find);{
					System.out.println("아이디가 없습니다.");
				}
			}else if(menu ==4) {
				// 이메일과 비밀번호를 입력받고, 맞으면 비밀번호 수정
				System.out.println("e메일을 입력하세요");
				String email = sc.next();
				System.out.println("비밀번호를 입력하세요");
				String pw = sc.next();
				boolean find = false;
				for(int i=0;i<cnt;i++) {
					if(email.equals(list[i].getEmail()) && pw.equals(list[i].getPw())) {
						System.out.println("수정할 비밀번호를 입력해 주세요");
						list[i].setPw(sc.next());
						find = true;
						break;
					}
				}
				if(!find){
					System.out.println("정보가 맞지 않습니다.");
				}
			}else if(menu ==0) {
				break;
			}
		}
		System.out.println();
	}

}
