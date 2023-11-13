package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.PhoneCompanyInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import exception.MenuWrongException;
//제어 클래스
public class PhoneBookManager {
	static Connection con;  // db 접속을 위해서 필요
	static PreparedStatement pstmt; // sql문장을 db에 전달하기위해서 필요
	static ResultSet rs;   // Select 결과 저장하기 위해서 필요
	private PhoneInfo[] phoneList=new PhoneInfo[100];
	private int cnt; //idx와 목록갯수

	public PhoneBookManager() {
		cnt=0;
	}
	public PhoneBookManager(int size) {
		cnt=0;
		this.phoneList=new PhoneInfo[size];
	}
	public void inputData() throws MenuWrongException {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");
		System.out.print("선택>> ");
		int menuNum=Main.sc.nextInt();
		if(menuNum<0 || menuNum> 3) {
			throw new MenuWrongException(menuNum);
		}
		PhoneInfo info=null;	
		switch(menuNum) {
		case 1:
			info=normalInputData();
			break;
		case 2:	
			info=univInputData();
			break;
		case 3:	
			info=companyInputData();
			break;
		}
		phoneList[cnt++]=info; //배열 추가 1번
	}
	private void normalInputData(String name, String phoneNum) {
		String sql = "insert into PHONEMEMBER(p_name, p_phone,p_kind) values(?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNum);
			pstmt.setString(3, "N");
			int result = pstmt.executeUpdate();   // insert, update, delete 
			if (result != 0) {
				System.out.println("insert 성공");
			}else {  //result = 0
				System.out.println("insert 실패");
			}
		} catch (SQLException e) {
			System.out.println("insert 예외 발생");
			e.printStackTrace();
		}
	}
	private PhoneInfo univInputData() {
		System.out.print("이름: ");
		String name=Main.sc.next();
		System.out.print("전화번호: ");
		String phone=Main.sc.next();
		System.out.print("전공: ");
		String major=Main.sc.next();
		System.out.print("학년: ");
		int year=Main.sc.nextInt();
		return new PhoneUnivInfo(name,phone,major,year);
	}
	private PhoneInfo companyInputData() {
		System.out.print("이름: ");
		String name=Main.sc.next();
		System.out.print("전화번호: ");
		String phone=Main.sc.next();
		System.out.print("회사: ");
		String company=Main.sc.next();
		return new PhoneCompanyInfo(name,phone,company);
	}
	public void showAllData() {
		for(int i=0;i<cnt;i++) {
			phoneList[i].showPhoneInfo();
			System.out.println("----------------");
		}
		System.out.println("전체 목록 출력 완료.");
	}
	public void searchData() {
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름: ");
		String name=Main.sc.next();
		//자료형
		//1.기본형 Primitive type: int, double,boolean 9개정도
		//2.참조형:에러(null) 기본형 제외한 모든것.Person, Student, String, StringBuilder
		int idx=searchIdx(name);  //존재하면 해당idx반환, 없으면 -1(에러)
		if(idx==-1) {
			System.out.println("검색할 데이터가 존재하지 않습니다.");
			return;
		}else {
			phoneList[idx].showPhoneInfo();
			System.out.println("데이터 검색을 완료합니다.");
		}
	}
	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.print("이름: ");
		String name=Main.sc.next();
		int idx=searchIdx(name);  //존재하면 해당idx반환, 없으면 -1(에러)
		if(idx==-1) {
			System.out.println("삭제할 데이터가 존재하지 않습니다.");
			return;
		}else {
			phoneList[idx]=phoneList[cnt-1];
			//for(int idx=i;idx<(cnt-1);idx++) {
			//	phoneList[idx]=phoneList[idx+1];
			//}
			cnt--;
			System.out.println("데이터 삭제를 완료합니다.");
		}
	}
	private int searchIdx(String name) {
		for(int i=0;i<cnt;i++) {
			if(name.equals(phoneList[i].getName())) {
				return i;
			}
		}
		return -1;
	}
}
