package day02;

public class 조건문_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 11;
		
		if(age >=19) {
			System.out.println("성인입니다.");
		}else if(age >= 13) {
			System.out.println("청소년입니다.");
		}else if(age >= 8) {
			System.out.println("초등학생입니다.");
		}else {
			System.out.println("어린이입니다.");
		}
	}

}
