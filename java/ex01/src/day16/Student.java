package day16;
//  자식(후손,하위) 클래스     //extends Person  
//  Student 클래스가 Person클래스를 상속한다.
public class Student extends Person{
	// name, age, sleep(), eat()
	private int sNo;
	//상속 < 정보은닉
	public Student(String name, int age, int sNo) {
		super(name,age);   // Person(name,age)  여기서는 같은뜻 조상 클래스를 호출! 기본적으로는 생략
		this.sNo=sNo;
		
	}
	public void study() {
		System.out.println("학생은 공부한다.");
	}
	public void exam() {
		System.out.println("학생은 시험을 본다.");
	}
	@Override
	public void showInfo() {
		super.showInfo();  //재활용
		System.out.println("sNo "+sNo);
	}
	// 재정의 (오버라이딩)
	@Override
	public void sleep() {
		//super.sleep();   //Person 의 sleep() 메소드를 호출 
//		System.out.println("학생은 6시간 잔다.");
		super.sleep();     
		System.out.println("Game,TV를 줄인다.");
	}
	@Override
	public void eat() {
		System.out.println("학생은 두끼만 먹고 야식");
	}
	
	
}
