package day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member {
	// 필드(인스턴스 변수, 멤버 변수)
	
	private int id;
	private String email;
	private String pw;
	private String name;
	private String joinDate;
	
	// 생성자
	public Member(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
				String now = dtf.format(LocalDateTime.now());
	}
	public Member(int id, String email, String pw, String name) {
		this();
		this.id = id;
		this.email = email;
		this.pw = pw;
		this.name = name;
	}
	
	//메서드
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.printf("%d\t%s\t%s\t%s\t%s\n", id, email, pw, name, joinDate);
	}
	
}
