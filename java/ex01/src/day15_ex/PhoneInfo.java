package day15_ex;
//데이터 클래스
public class PhoneInfo {
	private String name;
	private String phoneNum;	

	
	public PhoneInfo(String name, String phoneNum) {
		this.name=name;
		this.phoneNum=phoneNum;
	}
	public void showPhoneInfo(){
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNum);

		System.out.println("---------------");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
}
}
