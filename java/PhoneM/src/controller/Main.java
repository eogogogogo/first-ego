package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import bean.PhoneInfo;
import exception.MenuWrongException;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();

		int menuNum;
		while (true) {
			try {
				showMenu();
				menuNum = sc.nextInt();  //throw new InputMismatchException()
				if(menuNum<1 || menuNum>5) {
					throw new MenuWrongException(menuNum);
				}
				switch (menuNum) {
				case 1: manager.inputData();
					break;
				case 2:	manager.searchData();
					break;
				case 3:	manager.deleteData();
					break;
				case 4:	manager.showAllData();
					break;
				case 5:	System.out.println("프로그램 종료합니다.");
					return;
				}
			}catch(MenuWrongException e) {
				System.out.println(e.getMessage());
				e.showWrongNumInfo();
			}catch (InputMismatchException e) {
				//System.out.println(e.getMessage());
				System.out.println("메뉴는 정수만 가능합니다.");
				sc.nextLine();  //입력버퍼 삭제
			}
		}//end while
	}//end main

	private static void showMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("----------------");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.전체 목록 출력");
		System.out.println("5.프로그램 종료");
		System.out.println("----------------");
		System.out.print("선택: ");
	}

}
