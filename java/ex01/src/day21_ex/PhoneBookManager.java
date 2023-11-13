package day21_ex;

import java.util.HashSet;
import java.util.Iterator;
//제어 클래스
public class PhoneBookManager {
	//private PhoneInfo[] phoneList=new PhoneInfo[100];
	//private int cnt; //idx와 목록갯수
	HashSet<PhoneInfo> hSet=new HashSet<PhoneInfo>();
	static PhoneBookManager inst=null;
	
	private PhoneBookManager() {
		//hSet=new HashSet<PhoneInfo>();
	}
	private PhoneBookManager(int size) {
		hSet=new HashSet<PhoneInfo>(size);
	}
	public static PhoneBookManager creatManagerInst()
	{	
	   	if(inst==null)
			inst=new PhoneBookManager();
		return inst;
	}
	
	public void inputData() throws MenuWrongException {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");
		System.out.print("선택>> ");
		int menuNum=Main.sc.nextInt();
		if(menuNum<SubMenu.NORMAL || menuNum>SubMenu.COMPANY) {
			throw new MenuWrongException(menuNum);
		}
		PhoneInfo info=null;	
		switch(menuNum) {
		case SubMenu.NORMAL:
			info=normalInputData();
			break;
		case SubMenu.UNIV:	
			info=univInputData();
			break;
		case SubMenu.COMPANY:	
			info=companyInputData();
			break;
		}
		//phoneList[cnt++]=info; //배열 추가
		boolean result=hSet.add(info);
		if(result) {
			System.out.println("데이터 입력이 완료됨.\n");
		}else {
			System.out.println("이미 저장된 데이터입니다.\n");
		}
	}
	private PhoneInfo normalInputData() {
		System.out.print("이름: ");
		String name=Main.sc.next();
		System.out.print("전화번호: ");
		String phone=Main.sc.next();
		return new PhoneInfo(name, phone);
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
//		for(int i=0;i<cnt;i++) {
//			phoneList[i].showPhoneInfo();
//			System.out.println("----------------");
//		}
		for(PhoneInfo info:hSet) {
			info.showPhoneInfo();
			System.out.println("-------------");
		}
		System.out.println("전체 목록 출력 완료.\n");
	}
	public void searchData() {
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름: ");
		String name=Main.sc.next();
		
		PhoneInfo info=search(name);
		if(info==null) {
			System.out.println("해당 데이터가 존재하지 않습니다.\n");
		}else {
			info.showPhoneInfo();
			System.out.println("데이터 검색을 완료합니다.\n");
		}
		//자료형
//		int idx=searchIdx(name);  //존재하면 해당idx반환, 없으면 -1(에러)
//		if(idx==-1) {
//			System.out.println("검색할 데이터가 존재하지 않습니다.");
//			return;
//		}else {
//			phoneList[idx].showPhoneInfo();
//			System.out.println("데이터 검색을 완료합니다.");
//		}
	}
	
	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.print("이름: ");
		String name=Main.sc.next();
//		PhoneInfo info=search(name);
//		if(info==null) {
//			System.out.println("해당 데이터가 존재하지 않습니다.\n");
//		}else{
//			hSet.remove(info);
//			System.out.println("데이터 삭제를 완료합니다.\n");
//		}
		Iterator<PhoneInfo> ir=hSet.iterator();
		while(ir.hasNext()) {
			PhoneInfo info=ir.next();
			if(name.equals(info.getName())) {
				ir.remove();
				//hSet.remove(info);
				System.out.println("데이터 삭제를 완료합니다.\n");
				return;
			}
		}//end while
		System.out.println("해당 데이터가 존재하지 않습니다.\n");
		
//		int idx=searchIdx(name);  //존재하면 해당idx반환, 없으면 -1(에러)
//		if(idx==-1) {
//			System.out.println("삭제할 데이터가 존재하지 않습니다.");
//			return;
//		}else {
//			phoneList[idx]=phoneList[cnt-1];
//			//for(int idx=i;idx<(cnt-1);idx++) {
//			//	phoneList[idx]=phoneList[idx+1];
//			//}
//			cnt--;
//			System.out.println("데이터 삭제를 완료합니다.");
//		}
	}
	private PhoneInfo search(String name) {
		Iterator<PhoneInfo> ir=hSet.iterator();
		while(ir.hasNext()) {
			PhoneInfo info=ir.next();
			if(info.getName().equals(name)) {
				return info;
			}
		}
		return null; //검색 실패
	}
//	private int searchIdx(String name) {
//		for(int i=0;i<cnt;i++) {
//			if(name.equals(phoneList[i].getName())) {
//				return i;
//			}
//		}
//		return -1;
//	}
}
