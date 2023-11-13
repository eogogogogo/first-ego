package day09;

public class Animal {
	//클래스의 구성요소 3가지  필드 , 생성자, 메서드
	// 필드(인스턴스 변수, 멤버 변수)
	private String name;		
	private String sound;
	private int leg;
	
	// 생성자 1.리턴타입이 없다. 2. 생성자명은 클래스명과 동일하다. 생성자는 객체를 만들때 사용한다 생성자를 쓰는 이유는 값을 세팅하기 위해서 특징!!
	public Animal() {
		
	}
	
	
	
	// 메서드  매개변수와 객체의 이름이 같은때는 일반적으로 this를 사용한다.
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
		this.leg =leg;
	}
	public int getLeg() {
		return leg;
	}
	public void print() {
		System.out.println(name+"\t"+sound+"\t"+leg);
	}
}
