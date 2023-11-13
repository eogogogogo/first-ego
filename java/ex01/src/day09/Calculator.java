package day09;

public class Calculator {
	// 필드(인스턴스 변수, 멤버 변수)
	int num1;
	int num2;
	
	/* 매서드 만드는 형식
	 *  public 리턴타입 메서드명(매개변수){
	 *  	실행문구
	 *  }
	 * */
	      //숫자에 +""를 쓰면 문자로 변환된다
	// 메서드
	public void sum() {
		System.out.println(num1 + num2);
	}
	public void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	public int mul() {
		return num1 * num2;
	}
	public int div(int num3, int num4) {
		return num3 / num4;
	}	
	public int qum() {
		return num1 + num2;
	}
	// 메서드명 div
	// 리턴타입 있음
	// 매개변수 숫자 두개
	// 실행문구 매개변수로 받은 두개의 숫자를 나눈값 리턴
	
}
