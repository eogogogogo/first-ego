package day11;

public class User {
	// 필드(인스턴스 변수, 멤버 변수)
	private String name;
	private String id;
	private String pw;
	
	// 생성자
	public User() { // 기본생성자
		
	}
	public User(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	// 메서드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	public void print() {
		System.out.printf("%s\t%s\t%s\n",name, id, pw);
	}
}
