package day15_ex;

import java.util.Scanner;

import day15_ex.PhoneInfo;

//제어 클래스
public class PhoneBookManager {
	Scanner sc = new Scanner(System.in);
	private PhoneInfo[] phoneList = new PhoneInfo[100];

	private int cnt; // idx와 목록갯수

	public PhoneBookManager() {
		cnt = 0;
	}

	public PhoneBookManager(int size) {
		cnt = 0;
		this.phoneList = new PhoneInfo[size];
	}

	public void inputData() {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");
		int subMenuNum = 0;
		subMenuNum = sc.nextInt();
		switch (subMenuNum) {
		case 1:
			normalInputDate();
			break;
		case 2:
			univInputDate();
			break;
		case 3:
			companyInputDate();
			break;
		}

	}

	public void univInputDate() {
		System.out.println("데이터를 입력합니다.");
		System.out.print("이름 입력: ");
		String name = Main.sc.next();
		System.out.print("전화번호 입력: ");
		String phoneNum = Main.sc.next();
		System.out.print("전공 입력: ");
		String major = Main.sc.next();
		System.out.println("학년 입력: ");
		int year = Main.sc.nextInt();
		PhoneInfo info = new PhoneUnivInfo(name, phoneNum, major, year);
		phoneList[cnt++] = info;
	}

	public void normalInputDate() {
		System.out.println("데이터를 입력합니다.");
		System.out.print("이름 입력: ");
		String name = Main.sc.next();
		System.out.print("전화번호 입력: ");
		String phoneNum = Main.sc.next();
		PhoneInfo info = new PhoneInfo(name, phoneNum);
		phoneList[cnt++] = info;
	}

	public void companyInputDate() {
		System.out.println("데이터를 입력합니다.");
		System.out.print("이름 입력: ");
		String name = Main.sc.next();
		System.out.print("전화번호 입력: ");
		String phoneNum = Main.sc.next();
		String company = "우리회사";
		PhoneInfo info = new PhoneCompanyInfo(name, phoneNum, company);
		phoneList[cnt++] = info;
	}

	public void showAllData() {
		for (int i = 0; i < cnt; i++) {
			phoneList[i].showPhoneInfo();
		}
	}

	public void searchData() {
		System.out.println("찾으실 이름");
		String searchName = sc.next();
		boolean find = false;
		for (int i = 0; i < cnt; i++) {
			if (searchName.equals(phoneList[i].getName())) {
				phoneList[i].showPhoneInfo();
				find = true;
				return;
			}
		}
		if (!find) {
			System.out.println("이름이 없습니다.");
		}

	}
	
	//

	public void delAllData() {
		System.out.println("찾으실 이름");
		String delName = sc.next();
		boolean find = false;
		for (int i = 0; i < cnt; i++) {
			if (delName.equals(phoneList[i].getName())) {
//				phoneList[i]=phoneList[cnt-1];
//				cnt--;
				for(int j=i;i<cnt-1;j++) {
					phoneList[j] = phoneList[j+ 1];
				}
				find = true;
				return;
			}
		}
		if (!find) {
			System.out.println("이름이 없습니다.");
		}

	}
}
