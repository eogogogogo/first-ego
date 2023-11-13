package bean;

import java.util.Date;

public class Member {
	private int number;
	private String name;
	private String phone;
	private String major;
	private int year;
	private String company;
	private String kind;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() { 
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCompany() {
			return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void showInfo() {
		System.out.print("번호: "+number);
		System.out.print("  이름: "+name);
		System.out.print("  전화번호: "+phone);
		System.out.print("  대학: "+major);
		System.out.print("  학년: "+year);
		System.out.print("  회사: "+company);
		System.out.println("  종류: "+kind);
		System.out.println("------------------------------------------------------------");
	}

}
