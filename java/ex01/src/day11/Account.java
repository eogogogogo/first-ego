package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
	// 필드
	private String name; // 예금주
	private String account; // 계좌번호
	private String pw ;  //비밀번호
	private int balance;  // 잔액
	private String date; // 가입날짜
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");	
	
	// 생성자
	public Account() {
		String now = dtf.format(LocalDateTime.now());
		this.date = now;
		
	}
	public Account(String name, String account, String pw) {
		this();
		this.name = name;
		this.account = account;
		this.pw = pw;
		this.balance = 0;
		
	}
	
	// 메서드
	public void deposit(int money) {   // 입금
		this.balance += money;
	}
	public boolean withdraw(int money) {  // 출금
		if(this.balance >= money) {
			this.balance -= money;
			return true;
		}else {
			return false;
		}
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return account;
	}
	public void print() {
		System.out.printf("%s\t%s\t%s\t%d원\t%s\n",name,account, pw, balance,date);
	}
}
