package day10;

public class Fruit {
	// 필드(인스턴스 변수, 멤버 변수)
	String name;
	String color;
	boolean isSeed;
	
	// 생성자
	public Fruit() {
		
	}
	public Fruit(String name) {
		this.name = name;
	}
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public Fruit(String name, String color, boolean isSeed) {
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	
	// 메서드
	public void print() {
		System.out.printf("%s\t%s\t%b\n", name, color, isSeed);
	}
}
