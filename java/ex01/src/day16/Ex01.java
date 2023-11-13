package day16;

public class Ex01 {

	public static void main(String[] args) {
//		Person p = new Person("cha",20);
//		Student s1 = new Student("kim",30,1);
//		s1.showInfo();
//		s1.eat();
//		s1.exam();
//		s1.sleep();
		
//		PartTimeStd pts = new PartTimeStd("choi",22,5,9620,20);
		Person pts = new PartTimeStd("choi",22,5,9620,20);   //  is a 관계   학생을 가르키는 참조변수 student pts가 partTimeStd도 학생이니까. 
																// 조상타입 참조변수는 후손 인스턴스를 참조할 수 있다.
		pts.showInfo();											 // is a 관계가 되더라도 오버라이딩된게 나온다 마지막꺼.
		pts.eat();
		
		 Student std=(Student)pts;
		 std.study();                //두줄짜리를 아래처럼 한줄로 표현
		
//		((Student)pts).study();
		((Student)pts).exam();
		pts.sleep();
		((PartTimeStd)pts).work();        // part에서stud로 바꾸면서 에러 잠시 바꿈.
		
//		Person p = new Person("사람",10);
//		fct(p);    생략해서 아래처럼 씀
		
		fct(new Person("사람",10));
		fct(new Student("학생",20,1));
//		fct(new Teacher("선생"));  만약에 새롭게 선생이라는게 나와도 아래 코드는 변하지 않고 사용이 가능하다.
		fct(new PartTimeStd("근로학생",30,2,9000,10));
	}

	private static void fct(Person obj) {
		obj.showInfo();   // 다형성
		System.out.println("--------------");
	}
	
}
