package day17_ex;
//데이터 클래스
public class PhoneInfo {
	private String name;
	private String phoneNum;  //옵션
	
	public PhoneInfo(String name, String phoneNum) {
		this.name=name;
		this.phoneNum=phoneNum;
	}
	public void showPhoneInfo(){
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNum);
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phoneNum;
	}
}
