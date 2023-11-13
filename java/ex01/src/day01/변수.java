package day01;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		System.out.println(a);
		System.out.println(b);
		/* 변수- 그냥 담아둔다고 생각 이름표
		 sysout -- system.out.printla() 나옴 -- 쓰고 컨트롤 스페이스
		 컨트롤 f11 아래에 뭔가 나옴(콘솔창) 컨트롤 s로 저장 습관
		 window키 shift s 누르면 캡처가 클립보드에 저장 
		 프로젝트 -- 패키지(폴더를 나눔) -- 클래스  
		 =  대입연산자, 오른쪽에 있는 값은 왼쪽에 대입  */
		
		int c = a + b;
		System.out.println(c);
		
		int d = a;
		System.out.println(d);
		
		a = 20;
		b = 10;
		System.out.println(a+b);
		//변수의 이름은 같을수가 없다. 후에 다른값을 입력하면 값이 덮어씌어짐(int 같이 못씀)
	}

}
