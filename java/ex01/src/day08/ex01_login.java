package day08;

import java.util.Scanner;

public class ex01_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		
		String[] productName = new String[100];
		int[] productPrice = new int[100];
		int[] productQuantity = new int[100];
 		int pCnt = 0;
		
		int cnt = 0;
		int loginIndex = -1;
		
		while(true) {
			System.out.println("=====쇼핑몰=====");
			if(loginIndex == -1) {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			}else {
				System.out.println("1.상품등록 2.로그아웃("+name[loginIndex]+"님 3.상품목록 0.종료");
			}
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();sc.nextLine();
			
			if(menu == 1) {
				if(loginIndex == -1) {
					System.out.print("이름> ");
					name[cnt] = sc.next();
					System.out.print("아이디> ");
					id[cnt] = sc.next();
					System.out.print("비밀번호> ");
					pw[cnt] = sc.next();
					System.out.println(name[cnt]+"님 회원가입을 축하드립니다");
					cnt++;
				}else {
					// 상품등록
					System.out.println("등록할 상품명> ");
					productName[pCnt] = sc.nextLine();
					System.out.println("등록할 가격");
					productPrice[pCnt] = sc.nextInt();
					System.out.print(productName[pCnt]+" 상품 수량> ");
					productQuantity[pCnt] = sc.nextInt();
					System.out.println(productName+"상품 등록완료!");
					pCnt++;
				}
			}else if(menu == 2) {
				if(loginIndex == -1) {
					System.out.print("로그인할 아이디> ");
					String loginId = sc.next();
					System.out.print("로그인할 비밀번호> ");
					String loginPw = sc.next();
					boolean find = false;
					
					for(int i=0; i<cnt; i++) {
						if(loginId.equals(id[i]) && loginPw.equals(pw[i])) {
							System.out.println("로그인 성공");
							loginIndex = i;
							find = true;
							break;
						}
					}
					
					if(!find) {
						System.out.println("로그인 실패");
					}
				}else {
					loginIndex = -1;
					
				}
				
			}else if(menu == 3) {
				if(loginIndex == -1) {
					System.out.println("이름\t아이디\t비밀번호");
					System.out.println("=======================");
					for(int i=0; i<cnt; i++) {
						System.out.printf("%s\t%s\t%s\n", name[i],id[i],pw[i]);
					}
				}else {
					// 상품목록
					System.out.println("번호\t상품명\t상품가격\t\t상품수량");
					System.out.println("============================");
					for(int i=0; i<pCnt; i++) {
						System.out.printf("%d\t%s\t\t%,d원\t\t%,d개\n",i+1,productName[i],productPrice[i],productQuantity[i]);
					}
					
				}
			}else if(menu == 0) {
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
	}

}










