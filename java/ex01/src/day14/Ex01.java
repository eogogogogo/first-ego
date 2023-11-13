package day14;
//스택 : 지역변수 > 매개변수
//힙(heap) : 인스턴스(객체)
//메소드 영역: 클래스정보, 클래스변수
//실행 ---> JVM--> main호출

public class Ex01 {
	
		public static double getCircleArea(double radius) {
			return radius * radius * Math.PI;
		}
	// 클래스 메소드
	public static void main(String[] args) {
		System.out.println(getCircleArea(5.5));
		Student.ScName="인하공전";
		
		Student.showTitle();
		
		Student kim = new Student("kim", 1);
//		kim.setName("kim");
//		kim.setsNo(1);
		kim.showStudentInfo();
		
		Student lee = new Student("lee");
//		lee.setName("lee");
//		lee.setsNo(2);
		lee.showStudentInfo();
		
		Student park = new Student(3);
		park.showStudentInfo();
		
		Student noname = new Student();
		noname.showStudentInfo();

		
	}

}
