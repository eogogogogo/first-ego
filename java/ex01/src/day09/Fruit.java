package day09;

public class Fruit {
	// 필드(인스턴스 변수,맴버 변수)
	String name;
	String color;
	boolean isSeed;
	
	
	//생성자 특징 =>  1.리턴타입이 없다 2. 클래스명과 동일하다
	public Fruit(String name, String color, boolean isSeed) {
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	
	//매서드 
	public void print() {
		System.out.printf("%s\t%s\t%b\n",name, color, isSeed);
	}
}
