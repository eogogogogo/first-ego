package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.MenuWrongException;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws MenuWrongException {
		PhoneBookManager manager = new PhoneBookManager();
		boolean run = true;
		int menuNum = 0;
		while (run) {
			try {
				System.out.println("메뉴 선택.");
				System.out.println("----------------");
				System.out.println("1.데이터 입력");
				System.out.println("2.데이터 검색");
				System.out.println("3.데이터 수정");
				System.out.println("4.데이터 삭제");
				System.out.println("5.전체 목록 출력");
				System.out.println("6.프로그램 종료");
				System.out.println("----------------");
				System.out.print("선택: ");
				menuNum = sc.nextInt();
				if (menuNum < 1 || menuNum > 6) {
					throw new MenuWrongException(menuNum);
				}
				if (menuNum == 1) {
					manager.inputData();
				} else if (menuNum == 2) {
					manager.searchData();
				} else if (menuNum == 3) {
					manager.change();
				} else if (menuNum == 4) {
					manager.deleteData();
				} else if (menuNum == 5) {
					manager.showAllData();
				} else if (menuNum == 6) {
					System.out.println("프로그램 종료합니다.");
					run = false;
				} else {
					System.out.println("잘못 입력됬습니다.");
				}
			} catch (MenuWrongException e) {
				System.out.println("없는 메뉴입니다");
//				e.printStackTrace();
			} catch (InputMismatchException e) {
				System.out.println("메뉴는 숫자만 가능");
//				e.printStackTrace();
				sc.nextLine();
			}
		}
	}

}
