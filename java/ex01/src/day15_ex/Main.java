package day15_ex;

import java.util.Scanner;

import day15_ex.PhoneInfo;

public class Main {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		PhoneBookManager manager=new PhoneBookManager();
		
		int menuNum;
		while(true) {
			showMenu();
			menuNum=sc.nextInt();
			switch(menuNum) {
			case 1:
				manager.inputData();
				break;
			case 2: //검색
				manager.searchData();
				break;
			case 3: //삭제
				manager.delAllData();
				break;
			case 4:
				manager.showAllData();
				break;
			case 5:
				System.out.println("프로그램 종료합니다.");
				return;
			}
			
		}
	}
	private static void showMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("----------------");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.데이터 전체 출력");
		System.out.println("5.프로그램 종료");
		System.out.println("----------------");
		System.out.print("선택: ");  
	}

}
