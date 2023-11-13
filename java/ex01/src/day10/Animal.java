package day10;

public class Animal {
	// 필드(익스턴스 변수, 멤버 변수_
	private String name;
	private String sound;
	private int leg;
	
	
	//생성자  매개변수가 다르면 가능함 중복이 (오버로딩)
	public Animal() {
		
	}
	public Animal(String name, String sound, int leg) {  //기본생성자 => 만들지 않아도 자동으로 컴파일된다.
		this.name = name;
		this.sound = sound;
		this.leg = leg;
	}
	
	// 메서드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getSound() {
		return sound;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getLeg() {
		return leg;               
	}
}
