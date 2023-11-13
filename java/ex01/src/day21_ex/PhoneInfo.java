package day21_ex;
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
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		PhoneInfo cmp=(PhoneInfo)obj;
		if(name.equals(cmp.name)) {
			return true;
		}
		return false;
	}
}
