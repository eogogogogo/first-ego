package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Board> list = new ArrayList<Board>();
		ArrayList<User> ulist = new ArrayList<User>();
		int loginIndex = -1;
		
		while(true) {
			System.out.println("=====LOL블로그=====");
			if(loginIndex == -1) {
				System.out.println("1.회원가입 2.로그인 3.게시글목록 4.읽기 0.종료");
			}else {
				System.out.println("1.게시글등록 2.로그아웃 3.게시글목록 4.읽기 5.수정 6.삭제 0.종료");
			}
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();sc.nextLine();
			
			if(menu == 1) {
				if(loginIndex == -1) {
					// 회원가입
					User user = new User();
					System.out.print("이름> ");
					user.setName(sc.next());
					System.out.print("아이디> ");
					user.setId(sc.next());
					System.out.print("비밀번호> ");
					user.setPw(sc.next());
					ulist.add(user);
					System.out.println(user.getName()+"님 회원가입 완료!");
				}else {
					System.out.print("책제목> ");
					String title = sc.nextLine();
					System.out.print("글> ");
					String contents = sc.nextLine();
					Board b = new Board(title, contents, ulist.get(loginIndex).getId());
					list.add(b);
					System.out.println(title+" 게시 완료!");
				}
			}else if(menu == 2) {
				if(loginIndex == -1) {
					// 로그인
					System.out.print("로그인 아이디> ");
					String loginId = sc.next();
					System.out.print("로그인 비밀번호> ");
					String loginPw = sc.next();
					boolean find = false;
					for(int i=0; i<ulist.size(); i++) {
						if(loginId.equals(ulist.get(i).getId()) &&
								loginPw.equals(ulist.get(i).getPw())) {
							System.out.println("로그인 성공!");
							loginIndex = i;
							find = true;
							break;
						}
					}
					if(!find) {
						System.out.println("로그인 실패");
					}
				}else {
					// 로그아웃
					loginIndex = -1;
				}
			}else if(menu == 3) {
				for(Board b : list) {
					b.print();
				}
			}else if(menu == 4) {
				System.out.print("읽을 글번호> ");
				int searchBno = sc.nextInt();
				boolean find = false;
				for(Board b : list) {
					if(searchBno == b.getBno()) {
						b.cntUp();
						b.print();
						find = true;
						System.out.print(b.getLike() ? "싫어요?(Y/y)> " : "좋아요?(Y/y)> ");
						char like = sc.next().charAt(0);
						if(like == 'Y' || like == 'y') {
							b.likeToggle();
						}
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 글번호 입니다");
				}
			}else if(menu == 5 && loginIndex != -1){
				System.out.print("수정할 글번호> ");
				int updateBno = sc.nextInt();sc.nextLine();
				boolean find = false;
				for(Board b : list) {
					if(updateBno == b.getBno()) {
						if(b.getId().equals(ulist.get(loginIndex).getId())) {
							System.out.print("수정할 제목> ");
							b.setTitle(sc.nextLine());
							System.out.print("수정할 글> ");
							b.setContents(sc.nextLine());
							System.out.println("수정완료!");
						}else {
							System.out.println("등록자만 수정이 가능합니다.");
						}
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 글번호 입니다");
				}
			}else if(menu == 6 && loginIndex != -1) {
				System.out.print("삭제할 글번호> ");
				int deleteBno = sc.nextInt();
				boolean find = false;
				for(Board b : list) {
					if(deleteBno == b.getBno()) {
						if(b.getId().equals(ulist.get(loginIndex).getId())) {
							list.remove(b);
							System.out.println("삭제 완료!");
						}else {
							System.out.println("등록자만 삭제 가능합니다");
						}
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("조회할 수 없는 글번호 입니다");
				}
			}
			else if(menu == 0) {
				break;
			}
			
			System.out.println();
		}
		System.out.println("블로그 종료");
	}

}








