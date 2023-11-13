package day16;

// 부모(조상,상위) 클래스
// 기본적으로 모든 클래스는 가장 상위에 object라는 부모를 가자고 있다.
public class Person {
	// 필드(특성)
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person() call");
		this.name = "noname";
		this.age = 1;
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	//메소드(행위)
	public void sleep() {
		System.out.println("사람은 8시간 잔다.");
	}
	public void eat() {
		System.out.println("사람은 세끼를 먹는다.");
	}

	public void showInfo() {
		System.out.println("name: " +name);
		System.out.println("age: " +age);
	}
}
