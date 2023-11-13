package day15_ex;

public class PhoneUnivInfo extends PhoneInfo {
	private String major;
	private int year;

	public PhoneUnivInfo(String name, String phoneNum, String major, int year) {
		super(name, phoneNum);
		this.major = major;
		this.year = year;
	}
	

	public void showPhoneInfo() {
		super.showPhoneInfo();
	}
	
}
