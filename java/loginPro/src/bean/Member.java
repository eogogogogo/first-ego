package bean;

import java.util.Date;

public class Member {
	private String id;
	private String pw;
	private String name;
	private int age;
	private Date birth;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public void showInfo() {
		System.out.println("아이디: "+id);
		System.out.println("비번: "+pw);
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("생일: "+birth);
		System.out.println("---------------");
	}
}
