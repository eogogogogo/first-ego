package day01;

public class 타입_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "홍길동";
		String b = "이순신";
		String c = "심청이";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("이름은 홍길동입니다.");
		System.out.println("이름은 "+a+"입니다.");
		
		//문자열과의 + 는 연결을 의미한다.
		
		char aa = 'A';
		char bb = 'B';
		char cc = 'C';
		
		// 문제 예시) 홍길동의 학점은 A입니다.
		// 문제 예시) 이순신의 학점은 B입니다.
		// 문제 예시) 심청이의 학점은 C입니다.
		System.out.println(a+"의 학점은 "+aa+"입니다.");
		System.out.println(b+"의 학점은 "+bb+"입니다.");
		System.out.println(c+"의 학점은 "+cc+"입니다.");
	
		
		
	}

}
