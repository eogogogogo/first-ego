package day15_ex;

public class PhoneCompanyInfo extends PhoneInfo {
	private String company;

	public PhoneCompanyInfo(String name, String phoneNum, String company) {
		super(name, phoneNum);
		this.company = company;
	}

	public void showPhoneInfo() {
		super.showPhoneInfo();
	}

}
